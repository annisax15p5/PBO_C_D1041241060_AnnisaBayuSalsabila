/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
//deklarasi class yaitu persegi
class Persegi{
    //deklarasi atribut untuk class persegi
    int panjangSisi=0;
    int luasPersegi=0;
    int kelilingPersegi=0;

    public Persegi(int sisi) { 
        if (sisi<= 0) { 
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1)."); 
            this.panjangSisi = 1; 
        } else { 
            this.panjangSisi = sisi; 
        } 
        this.luasPersegi = this.panjangSisi * this.panjangSisi; 
        this.kelilingPersegi = 4 * this.panjangSisi; 
    } 
     //Method untuk menampilkan sisi, luas, dan keliling 
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : "+ panjangSisi+ " cm");
        System.out.println("Luas    : "+ luasPersegi+" cm^2");
        System.out.println("Keliling: "+ kelilingPersegi+" cm");
    }
}
public class LatihanPersegiConstructor {
    public static void main(String[] args) {
        // Buat 1 object dengan sisi valid (misalnya 5) 
        Persegi persegi1=new Persegi(5);
        persegi1.tampilkanHasil();//Tampilkan hasil kedua object 

        // Buat 1 object dengan sisi invalid (misalnya -3) 
        Persegi persegi2 = new Persegi(-3);
        persegi2.tampilkanHasil();//Tampilkan hasil kedua object 
    }
}
