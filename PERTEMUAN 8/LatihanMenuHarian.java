/*
Nim  : D1041241060
Nama : Annisa Bayu Salsabila
 */
public class LatihanMenuHarian {
    public static void main(String[] args) {
        //Menampilkan  tampilan user untuk Menu makan
        System.out.println("=== MENU MAKAN 3 HARI ===");
        //outer loop untuk hari
        for (int i = 1; i <= 3; i++){
            System.out.println("Hari " +  i + ":");
            //inner loop untuk waktu makan
            for (int j = 1; j <= 2; j++){
                //kondisi untuk menu 3 hari pagi dan siang
                if (i == 1 && j == 1){
                    System.out.println("  Pagi: Nasi Goreng");
                } else if (i == 1 && j == 2){
                    System.out.println("  Siang: Soto Ayam");
                } else if (i == 2 && j == 1){
                    System.out.println("  Pagi: Bubur Ayam");
                } else if (i == 2 && j == 2){
                    System.out.println("  Siang: Mie Goreng");
                } else if (i == 3 && j == 1){
                    System.out.println("  Pagi: Roti Bakar");
                } else if (i == 3 && j == 2){
                    System.out.println("  Siang: Nasi Uduk");
                }
            }
            System.out.println();
        }
     }
}
