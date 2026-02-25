/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanTabelPerkalian {
     public static void main(String[] args) {
        //deklarasi variable angka dengan nilai awal 7
        int angkaDasar = 7;
        System.out.println("=== TABEL PERKALIAN 7 ===");
        for (int i = 1; i <= 12; i++) {//Menggunakan for loop untuk iterasi 1-12 
            int hasilPerkalian = angkaDasar * i;//untuk perkaliannya
            System.out.println(angkaDasar + " x " + i + " = " + hasilPerkalian);//Tampilkan format: angka × i = hasil dan tambahkan garis pemisah untuk keterbacaan
        }
    }
}

