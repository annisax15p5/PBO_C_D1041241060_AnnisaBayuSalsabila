/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanCariKelipatan {
    public static void main(String[] args) {
        //Menampilkan tampilan user untuk cari kelipatan 7
        System.out.println("=== CARI KELIPATAN 7 ===");
        //Gunakan for loop 1-50 
        for(int i=0; i<50; i++){
            System.out.println("Cek: " + i);//untuk menampilkan angka yang diperiksa sebelum break
            if(i % 7 == 0){//menggunakan if untuk cek kelipatan 7
                System.out.println("✓ Kelipatan 7 pertama: " + i);
                break; //menggunakan break untuk memberhentikan perulangan ketika ditemukan 
            }
        }
        System.out.println("Pencarian selesai.");
    }
}
