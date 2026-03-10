//deklarasi class yaitu buku
class Buku {
    //deklarasi atribut dari class buku
    String judulBuku;
    String namaPengarang;
    int hargaBuku;

    //method untuk menampilkan informasi buku (judul, pengarang, harga)
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println();
        System.out.println("Judul    : " + judulBuku);
        System.out.println();
        System.out.println("Pengarang: " + namaPengarang);
        System.out.println();
        System.out.println("Harga    : Rp "+ hargaBuku);
    }
}
public class LatihanClassBuku{
    public static void main(String[] args) {
        // object buku pertama
        Buku buku1 = new Buku();
        buku1.judulBuku = "Pemrograman Java";
        buku1.namaPengarang="Budi Raharjo";
        buku1.hargaBuku= 125000;

        // object buku kedua
        Buku buku2 = new Buku();
        buku2.judulBuku = "Algoritma dan Struktur Data";
        buku2.namaPengarang="Rinaldi Munir";
        buku2.hargaBuku= 150000;

        // Panggil method menampilkan data buku 1
        buku1.tampilkanInfo();

        System.out.println();
        // Panggil method menampilkan data buku 2
        buku2.tampilkanInfo();
    }
}
