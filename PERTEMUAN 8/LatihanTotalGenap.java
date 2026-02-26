/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanTotalGenap {
    public static void main(String[] args) {
        // Variabel bantuan untuk menyimpan total
        int totalGenap = 0;
        //Menampilkan tampilan user untuk total bilangan genap 1-20
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        // looping dengan range 1 sampai 20
        for (int i = 1; i <= 20; i++) {
            // Jika bilangan ganjil, lewati dengan menggunakan continue
            if (i % 2 == 1) {
                continue;
            }
            // Tambahkan bilangan genap ke total
            totalGenap += i;
            // menampilkan  bilangan yang ditambahkan dan total sementara
            System.out.println("Tambah: " + i + " → Total: " + totalGenap);
        }
        System.out.println("---");
        //menampilkan total akhir
        System.out.println("Total akhir: " + totalGenap);
    }
}
