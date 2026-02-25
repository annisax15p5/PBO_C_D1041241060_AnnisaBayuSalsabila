/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanValidasi {
     public static void main(String[] args) {
        //Deklarasi variable dan beri nilai awal
        int nilaiUjian = 0;
        int nomorIterasi = 1;
        //Menampilkan Tampilan Validasi Nilai Ujian
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        System.out.println("\n");
        //Menggunakan do-while untuk memvalidasi, looping untuk tetap berjalan jika tidak dalam range 0-100
        do {
            //Mensimulasikan 3 percobaan input
            if (nomorIterasi == 1) {
                nilaiUjian = -10;
            } else if (nomorIterasi == 2) {
                nilaiUjian = 150;
            } else {
                nilaiUjian = 85;
            } 
            System.out.println("Percobaan input: " + nilaiUjian);
            if (nilaiUjian < 0 || nilaiUjian > 100){ // beri kondisi untuk batasan nilai yang tidak valid
                System.out.println("Error: Nilai harus antara 0-100!");//Jika nilai tidak valid, maka akan tertampil pesan error dan "ulangi" input 
                System.out.println("\n");
            }
            nomorIterasi++;//iterasi bertambah
        } while (nilaiUjian < 0 || nilaiUjian > 100);
        System.out.println("Nilai valid: " + nilaiUjian);
    }
}

