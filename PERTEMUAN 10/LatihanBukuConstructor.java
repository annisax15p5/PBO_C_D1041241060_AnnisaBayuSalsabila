/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
//deklarasi class buku
class Buku{
    //deklarasi atribut dari class buku
    String judulBuku;
    String namaPengarang;
    int hargaBuku;

    //Constructor 1: Tanpa parameter 
    public Buku(){
        judulBuku ="Belum diisi";
        namaPengarang="Belum diisi";
        hargaBuku=0;
    }

    //Constructor 2: 3 parameter (gunakan this)
    public Buku(String judulBuku, String namaPengarang, int hargaBuku){
        this.judulBuku=judulBuku;
        this.namaPengarang=namaPengarang;
        this.hargaBuku=hargaBuku;
    }

    //Method untuk menampilkan info
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " +judulBuku);
        System.out.println("Pengarang: "+namaPengarang);
        System.out.println("Harga    : Rp "+hargaBuku);
        System.out.println();
    }
}
public class LatihanBukuConstructor {
    public static void main(String[] args) {
    //Buat 1 object dengan constructor default
    Buku buku1=new Buku();
    buku1.tampilkanInfo();//Tampilkan info semua object

    //Buat 2 object dengan constructor berparameter
    Buku buku2=new Buku("Pemrograman Java", "Budi Raharjo", 125000 );
    buku2.tampilkanInfo();//Tampilkan info semua object

    Buku buku3= new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);
    buku3.tampilkanInfo();//Tampilkan info semua object
    }
}
