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

    //Constructor 1: Tanpa parameter 
    public Mobil(){
        merkMobil ="Belum diisi";
        warnaMobil="Belum diisi";
        tahunPembuatan=0;
    }
    //Constructor 2: 1 parameter (merk saja)
    public Mobil(String merkMobil){
        this.merkMobil=merkMobil;
        warnaMobil="Belum diisi";
        tahunPembuatan=0;
    }
    //Constructor 3: 3 parameter (semua atribut)
    public Mobil(String merkMobil, String warnaMobil, int tahunPembuatan){
        this.merkMobil=merkMobil;
        this.warnaMobil=warnaMobil;
        this.tahunPembuatan=tahunPembuatan;
    }
    //method untuk menampilkan merk, warna, tahun
    public void tampilkanSpesifikasi(){
    System.out.println("=== SPESIFIKASI MOBIL === ");
    System.out.println("Merk : " +merkMobil);
    System.out.println("Warna: "+warnaMobil);
    System.out.println("Tahun: " + tahunPembuatan);
    System.out.println();
    }
}
public class LatihanMobilConstructor {
    public static void main(String[] args) {
    //Buat 1 object dengan constructor default
    Mobil mobil1=new Mobil();
    mobil1.tampilkanSpesifikasi();

    // Buat 1 object dengan constructor 1 parameter
    Mobil mobil2 = new Mobil("Toyota");
    mobil2.tampilkanSpesifikasi();
    
    // Buat 1 object dengan constructor berparameter
    Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);
    mobil3.tampilkanSpesifikasi();
    }
}
