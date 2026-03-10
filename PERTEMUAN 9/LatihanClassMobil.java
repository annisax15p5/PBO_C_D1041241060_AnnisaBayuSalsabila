/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
//deklarasi class yaitu mobil
class Mobil{
    //deklarasi atribut dari class mobil
    String merkMobil;
    String warnaMobil;
    int tahunPembuatan;
    int kecepatanSekarang;

    //method untuk menampilkan merk, warna, tahun
    public void tampilkanSpesifikasi(){
    System.out.println("=== SPESIFIKASI MOBIL === ");
    System.out.println();
    System.out.println("Merk : " +merkMobil);
    System.out.println();
    System.out.println("Warna: "+warnaMobil);
    System.out.println();
    System.out.println("Tahun: " + tahunPembuatan);
    System.out.println();
    System.out.println();
    }
    //method untuk menambah kecepatan sebesar 20 km/jam
    public void percepat(){
        kecepatanSekarang = kecepatanSekarang + 20;
        System.out.println("Mobil dipercepat... ");
        System.out.println();
    }
    //method untuk menampilkan kecepatan saat ini
    public void tampilkanKecepatan(){
        System.out.println("Kecepatan saat ini: "+kecepatanSekarang+" km/jam");
    }
}
public class LatihanClassMobil {
    public static void main(String[] args) {
        //Satu object Mobil 
        Mobil mobil1=new Mobil();
        mobil1.merkMobil="Toyota Avanza";
        mobil1.warnaMobil="Silver";
        mobil1.tahunPembuatan=2020;

        //panggil method untuk menampilkan spesifikasi
        mobil1.tampilkanSpesifikasi();
        //panggil method untuk mempercepat kecepatan mobil 2x
        mobil1.percepat();
        mobil1.percepat();
        //panggil method untuk menampilkan kecepatan mobil saat ini
        mobil1.tampilkanKecepatan();
    }
}
