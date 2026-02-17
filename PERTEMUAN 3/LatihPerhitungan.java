/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihPerhitungan {
    public static void main (String[] args){
        //Deklarasi saldo awal dengan tipe data int
        int saldoAwal = 1000000;
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        //Menampilkan saldo awal
        System.out.println("Saldo Awal              : " + saldoAwal);
        //Deklarasi simulasi setoran
        int simulasiSetoran = 500000;
        //Menampilkan saldo setoran
        System.out.println("Setoran                 : " + simulasiSetoran);
        //Menambahkan saldo awal dengan setoran untuk menjadi saldo setelah setoran
        saldoAwal += simulasiSetoran;
        //Menampilkan saldo setelah setoran
        System.out.println("Saldo Awal              : " + saldoAwal);
        //Deklarasi penarikan saldo
        int penarikanSaldo = 250000;
        //Menampilkan saldo yang ditarik
        System.out.println("Penarikan               : " + penarikanSaldo);
        //Mengurangi saldo setelah setoran dengan saldo yang ditarik untuk menjadi saldo akhir
        saldoAwal -= penarikanSaldo;
        //Menampilkan saldo akhir
        System.out.println("Saldo Akhir             : " + saldoAwal);
  }
}
