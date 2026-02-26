/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanRefleksi {
    public static void main(String[] args) {
        //Deklarasi variable angka dengan nilai awal 1
        int angkaSekarang = 1;
        //Looping dengan while
        System.out.println("=== MENGGUNAKAN WHILE ===");
        while (angkaSekarang <= 5){
            System.out.println(angkaSekarang + " ");
            //update dengan menambah angka sehingga iterasi bertambah
            angkaSekarang++;
        }
        //Deklarasi variable angka dengan nilai awal 1
        angkaSekarang = 1;
        System.out.println("\n");
        //Looping Dengan Do While
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        do { 
            System.out.println(angkaSekarang + " ");
            //update dengan menambah angka sehingga iterasi bertambah
            angkaSekarang++;
        } while (angkaSekarang <= 5); //kondisi untuk berhenti
        System.out.println("\n");
        //Looping dengan for
        System.out.println("=== MENGGUNAKAN FOR ===");
        // Inisialisasi kemudian diberikan kondisi perulangan, dan dilakukan update dengan menambah nilai agar iterasi terus bertambah sampai batas yang ditentukan.
        for (int i = 1; i <= 5; i++){
            System.out.println(i + " ");
        }
    }
}
 /*Loop yang paling mudah dipahami menurut saya adalah for, karena semua bagian pentingnya ada dalam satu baris, sehingga lebih sederhana dan jelas untuk perulangan yang jumlahnya sudah ditentukan.
  */
