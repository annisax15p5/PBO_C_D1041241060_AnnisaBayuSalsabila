/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class p073ForLoop {
     public static void main(String[] args) { 
        // Contoh 1: Deret angka 1-10 
        System.out.println("=== Deret Angka 1-10 ==="); 
        for (int i = 1; i <= 10; i++) { //Inisialisasi i = 1, kemudian berikan kondisi bahwa loop akan terus berjalan selama i ≤ 10, dan setiap kali perulangan nilai i bertambah 1 dengan i++.
            System.out.print(i + " "); 
        } 
        System.out.println("\n"); 
        // Contoh 2: Deret genap 
        System.out.println("=== Bilangan Genap 2-20 ==="); 
        for (int i = 2; i <= 20; i += 2) { //Inisialisasi i = 2, kemudian berikan kondisi bahwa loop akan terus berjalan selama i ≤ 20, dan setiap kali perulangan nilai i bertambah 2 dengan i += 2 sehingga menghasilkan deret genap.
            System.out.print(i + " "); 
        } 
        System.out.println("\n"); 
        // Contoh 3: Perulangan mundur 
        System.out.println("=== Hitung Mundur 10-1 ==="); 
        for (int i = 10; i >= 1; i--) { //Inisialisasi i = 10, kemudian berikan kondisi bahwa loop akan terus berjalan selama i ≥ 1, dan setiap kali perulangan nilai i berkurang 1 dengan i-- (decrement) agar menghitung mundur.
            System.out.print(i + " "); 
        } 
        System.out.println("\n");
        // Contoh 4: Pola bintang sederhana 
        System.out.println("=== Pola Bintang ==="); 
        for (int i = 1; i <= 5; i++) { 
            System.out.println("* "); 
        } 
        System.out.println(); 
        // Contoh 5: Tabel perkalian 5 
        System.out.println("=== Tabel Perkalian 5 ==="); 
        int angkaDasar = 5; 
        for (int i = 1; i <= 10; i++) { //Perulangan digunakan untuk menunjukkan proses perhitungan di dalam loop, di mana variabel hasil akan terus dihitung atau diperbarui pada setiap iterasi.
            int hasilPerkalian = angkaDasar * i; 
            System.out.println(angkaDasar + " × " + i + " = " + hasilPerkalian); 
        }
    }
}

