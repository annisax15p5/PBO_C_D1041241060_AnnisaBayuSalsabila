/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanDeretGanjil {
    public static void main(String[] args) {
        //Deklarasi variabel angka ganjil tersebut dengan nilai awal 1
        int angkaGanjil = 1;
        //Menampilkan  tampilan Bilangan Ganjil 1-15
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        //Menggunakan while loop untuk iterasi sampai angka kurang dari sama dengan 15
        while (angkaGanjil <= 15){
            System.out.print(angkaGanjil + " "); //Untuk tampilan dalam satu baris dipisah spasi 
            //tNilai angka ditambah 2 pada setiap iterasi (angka += 2) sehingga yang ditampilkan hanya bilangan ganjil.
            angkaGanjil += 2;
        }
    }
}
