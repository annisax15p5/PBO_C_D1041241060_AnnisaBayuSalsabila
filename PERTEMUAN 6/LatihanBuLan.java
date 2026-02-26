public class LatihanBuLan {
    public static void main(String[] args) { 
        //deklarasi variable month
        //int sampleMonth = 5; //sesuaikan dengan input 5 atau 13
        int sampleMonth = 13;
        //variable bantuan
        String namaBulan; 
        //Menampilkan tampilan user konversi bulan dan angka bulan sesuai input
        System.out.println("=== KONVERSI BULAN ==="); 
        System.out.println("Angka Bulan: " + sampleMonth); 
        //switch statement dengan range 12 angka untuk konversi ke 12 bulan
        switch (sampleMonth) { 
            case 1: 
                namaBulan = "Januari"; 
                break; 
            case 2: 
                namaBulan = "Februari"; 
                break; 
            case 3: 
                namaBulan = "Maret"; 
                break; 
            case 4: 
                namaBulan = "April"; 
                break; 
            case 5: 
                namaBulan = "Mei"; 
                break; 
            case 6: 
                namaBulan = "Juni"; 
                break; 
            case 7: 
                namaBulan = "Juli"; 
                break; 
            case 8: 
                namaBulan = "Agustus"; 
                break; 
            case 9: 
                namaBulan = "September"; 
                break; 
            case 10: 
                namaBulan = "Oktober"; 
                break; 
            case 11: 
                namaBulan = "November"; 
                break; 
            case 12: 
                namaBulan = "Desember"; 
                break; 
            default: //menggunakan default case untuk menangani input bulan yang tidak sesuai range
                namaBulan = "Error: Angka bulan tidak valid (1-12)"; 
                break; 
        } 
        //menampilkan hasil nama bulan
        System.out.println("Nama Bulan: " + namaBulan); 
    }
}