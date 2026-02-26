/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanDiskon {
    public static void main(String[] args) {
        // Deklarasi variable
        double totalBelanja = 750000; 
        // Variable bantuan
        int diskonPersen = 0;
        double jumlahDiskon;
        double hargaAkhir;
        // Menampilkan tampilan user kalkulator diskon dan total belanja
        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);
        // Kondisi untuk menentukan diskon
        if (totalBelanja >= 1000000) {          // total belanja ≥ Rp 1.000.000 → diskon 15%
            diskonPersen = 15;
        } else if (totalBelanja >= 500000) {   // Rp 500.000 - Rp 999.999 → diskon 10%
            diskonPersen = 10;
        } else if (totalBelanja >= 100000) {   // Rp 100.000 - Rp 499.999 → diskon 5%
            diskonPersen = 5;
        } else {                               // < Rp 100.000 → tidak ada diskon
            diskonPersen = 0;
        }
        // Menghitung diskon yang didapatkan
        jumlahDiskon = totalBelanja * diskonPersen / 100;
        // Menghitung harga akhir
        hargaAkhir = totalBelanja - jumlahDiskon;
        // Menampilkan hasil akhir dengan persentase
        System.out.println("Diskon (" + diskonPersen + "%): Rp " + jumlahDiskon);
        System.out.println("Harga Akhir: Rp " + hargaAkhir);
        System.out.println("Anda hemat: Rp " + jumlahDiskon);
    }
}

