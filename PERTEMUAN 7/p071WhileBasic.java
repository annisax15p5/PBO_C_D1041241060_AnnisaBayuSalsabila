/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class p071WhileBasic {
    public static void main(String[] args) {
        // Contoh 1: Menampilkan angka 1-5
        System.out.println("=== Deret Angka 1-5 ===");
        // Inisialisasi bahwa variabel dimulai dari 1
        int angkaAwal = 1;
        // Berikan kondisi selama angkaAwal <= 5
        while (angkaAwal <= 5) {
            System.out.println("Angka: " + angkaAwal);
            // Update setiap iterasi, nilai bertambah 1
            angkaAwal++;
        }
        System.out.println();
        // Contoh 2: Menghitung total
        System.out.println("=== Hitung Total 1+2+3+4+5 ===");
        int angkaSekarang = 1;
        int jumlahTotal = 0;
        while (angkaSekarang <= 5) {
            jumlahTotal = jumlahTotal + angkaSekarang; // akumulasi total
            System.out.println("Total sementara: " + jumlahTotal);
            angkaSekarang++; // update angka
        }
        System.out.println();
        // Contoh 3: Perulangan mundur
        System.out.println("=== Hitung Mundur 5-1 ===");
        int angkaMundur = 5;
        while (angkaMundur >= 1) { // kondisi perhitungan mundur
            System.out.println("Hitung: " + angkaMundur);
            
            angkaMundur--; // mengurangi nilai setiap iterasi
        }
        System.out.println("Selesai!");
    }
}
