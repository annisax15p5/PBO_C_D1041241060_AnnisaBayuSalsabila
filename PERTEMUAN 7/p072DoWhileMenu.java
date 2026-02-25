/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class p072DoWhileMenu {
    public static void main(String[] args) {  
        // Simulasi pilihan user 
        int pilihanMenu = 0; 
        int iterasiKe = 1; 
        System.out.println("=== MENU SEDERHANA ==="); 
        do { 
            // Menaampilkan menu 
            // Membaca input
            System.out.println("\n--- Iterasi ke-" + iterasiKe + " ---"); 
            System.out.println("1. Lihat Data"); 
            System.out.println("2. Tambah Data"); 
            System.out.println("3. Hapus Data"); 
            System.out.println("0. Keluar"); 
            System.out.println("---"); 
            // Simulasi input pengguna (dalam praktik nyata pakai Scanner) 
            // Untuk demo, kita ubah pilihan setiap iterasi 
            if (iterasiKe == 1) { 
                pilihanMenu = 1; 
            } else if (iterasiKe == 2) { 
                pilihanMenu = 2; 
            } else { 
                pilihanMenu = 0;  // Keluar
            } 
            //tampilan agar pengguna memilih opis
            System.out.println("Pilihan Anda: " + pilihanMenu); 
            //Switch memproses pilihan
            switch (pilihanMenu) { 
                case 1: 
                    System.out.println("→ Menampilkan data..."); 
                    break; 
                case 2: 
                    System.out.println("→ Menambah data..."); 
                    break; 
                case 3: 
                    System.out.println("→ Menghapus data..."); 
                    break; 
                case 0: 
                    System.out.println("→ Terima kasih!"); 
                    break; 
                default: 
                    System.out.println("→ Pilihan tidak valid"); 
                    break; 
            } 
            iterasiKe++; 
        } while (pilihanMenu != 0); //Kondisi pilihan != 0 dicek setelah eksekusi 
         //Jika pilihan bukan 0, ulangi menu, namun jika pilihan = 0, keluar dari loop
        System.out.println("\nProgram selesai."); 
    }
}
