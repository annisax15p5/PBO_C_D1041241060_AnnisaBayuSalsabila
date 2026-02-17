/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanKalkulator {
    public static void main(String[] args) {
        //Deklarasi Variabel
        int angkaPertama = 25;
        int angkaKedua = 4;
        //Hitung : penjumlahan, pengurangan, perkalian, pembagian (integer), dan modulus
        int penjumlahanAngka = angkaPertama + angkaKedua;
        int penguranganAngka = angkaPertama - angkaKedua;
        int perkalianAngka = angkaPertama * angkaKedua;
        int pembagianAngka = angkaPertama / angkaKedua;
        int modulusAngka = angkaPertama % angkaKedua;
        // Hitung pembagian dengan hasil desimal menggunakan type casting dengan mengubah nilai int ke double 
        double pembagianDesimal = (double) angkaPertama / angkaKedua ;
        //Menampilkan hasil kalkulator
        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1             : " + angkaPertama);
        System.out.println("Angka 2             : " + angkaKedua);
        System.out.println("---");
        System.out.println("Penjumlahan         : " + penjumlahanAngka);
        System.out.println("Pengurangan         : " + penguranganAngka);
        System.out.println("Perkalian           : " + perkalianAngka);
        System.out.println("Pembagian           : " + pembagianAngka);
        System.out.println("Sisa Bagi           : " + modulusAngka);
        System.out.println("Pembagian Decimal   : " + pembagianDesimal);
    }
}

