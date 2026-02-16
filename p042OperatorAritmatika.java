public class p042OperatorAritmatika {
    public static void main(String[] args) {
        //Deklarasi variabel interger a dan b
        int a = 10;
        int b = 3;
        //Menampilkan nilai A dan b Awal
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //Beri Spasi
        System.out.println();
        //Menampilkan hasil penjumlahan A dan B
        System.out.println("a + b = " + (a + b));
        //Menampilkan hasil pengurangan A dan B
        System.out.println("a - b = " + (a - b));
        //Menampilkan hasil perkalian A dan B
        System.out.println("a * b = " + (a * b));
        //Menampilkan hasil Pembagian A dan B
        System.out.println("a / b = " + (a / b));
        //Menampilkan hasil Modulus A dan B
        System.out.println("a % b = " + (a % b));
        // Pembagian dengan desimal
        double hasil = (double) a / b;
        // Tampilkan Pembagian a dan b dengan nilai desimal
        System.out.println("a / b (desimal) = " + hasil);
    }
}