/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanCounter {
    public static void main(String[] args) {
        //Deklarasi variable counter
        int counter = 10;
        //Menampilkan Counter
        System.out.println("=== COUNTER ===");
        System.out.println("Nilai awal          : " + counter);
        //Operasi increment sebanyak 2x
        counter++;
        counter++;
        //Menampilkan Hasil setelah Increment 2x
        System.out.println("Setelah ++  (2x)    : " + counter);
        //Operasi decrement 1x
        counter--; 
        //Menampilkan Hasil setelah Decrement 1x
        System.out.println("Setelah --          : " + counter);
        //Tambah 5 menggunakan +=
        counter += 5;
        //Mempilkan Hasil setelah +5
        System.out.println("Setelah += 5        : " + counter);
        //Kurangi 3 menggunakan -=
        counter -= 3;
        //Menmpilkan Hasil setelah -3
        System.out.println("Setelah -= 3        : " + counter);
        //Kalikan 2 menggunakan *=
        counter *= 2;
        //Mempilkan Hasil setelah *2
        System.out.println("Setelah *= 2        : " + counter);
    }
}

