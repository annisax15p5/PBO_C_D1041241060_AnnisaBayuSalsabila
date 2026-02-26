public class LatihanBilangan {
    public static void main(String[] args) {
        //Deklarasi variable number 
        //int startingNumber = 12; //value menyesuaikan 12 atau -7
        int startingNumber = -7;
        //Tampilan user untuk menampilkan pemeriksaan bilangan
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + startingNumber);
        //kondisi untuk mengecek bilangan positif
        if (startingNumber > 0){
            System.out.println("Jenis: Bilangan Positif");
            //kondisi untuk menentukan bilangan genap atau ganjil
            if (startingNumber % 2 == 0){
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
            //kondisi untuk mengecek bilangan negatif
        }else if (startingNumber < 0){
            System.out.println("Jenis: Bilangan Negatif");
            //kondisi untuk menentukan bilangan genap atau ganjil
            if (startingNumber % 2 == 0){
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
            //kondisi jika bilangan bukan positif/negatif (0)
        }else {
            System.out.println("Jenis: Bilangan nol");
        }
    }
}
