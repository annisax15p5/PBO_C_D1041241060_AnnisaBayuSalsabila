/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanProduk {
    //Deklarasi Konstanta PAJAK
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        //Deklrasi Variabel
        String namaProduk = "Laptop Asus";
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean isAvailable = true;
        // Menghitung total nilai stok dengan mengalikan Harga satuan dengan jumlah stok
        int nilaiStok = hargaSatuan * jumlahStok;
        //Menghitung total pajak dengan mengalikan total nilai pajak dengan pajak
        double pajakStock = nilaiStok * PAJAK;
        //Menampilkan Informasi Produk
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk         : " + namaProduk);
        System.out.println("Harga Satuan        : Rp " + hargaSatuan);
        System.out.println("Jumlah Stok         : " + jumlahStok);
        System.out.println("Status Tersedia     : " + isAvailable);
        System.out.println("---");
        System.out.println("Total Nilai Stok    : Rp " + nilaiStok);
        System.out.println("Pajak (11%)         : Rp " + (int) (pajakStock));

    }
}

