//deklarasi class yaitu persegi
class Persegi{
    //deklarasi atribut untuk class persegi
    int panjangSisi=0;
    int luasPersegi=0;
    int kelilingPersegi=0;

    //Method untuk menghitung luas (sisi × sisi) 
    public void hitungLuas(){
        luasPersegi=panjangSisi*panjangSisi;
    }
    //Method untuk menghitung keliling (4 × sisi) 
    public void hitungKeliling(){
        kelilingPersegi = 4*panjangSisi;
    }
    //Method untuk menampilkan sisi, luas, dan keliling 
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println();
        System.out.println("Sisi    : "+ panjangSisi+ " cm");
        System.out.println();
        System.out.println("Luas    : "+ luasPersegi+" cm^2");
        System.out.println();
        System.out.println("Keliling: "+ kelilingPersegi+" cm");
    }

}
public class LatihanClassPersegi {
    public static void main(String[] args) {
    //Object persegi
    Persegi persegi1 = new Persegi();
    persegi1.panjangSisi=5;
    //panggil method untuk menghitung luas
    persegi1.hitungLuas();
    //panggil method untuk menghitung keliling
    persegi1.hitungKeliling();
    //panggil method untuk menampilkan hasil
    persegi1.tampilkanHasil();
    }
}
