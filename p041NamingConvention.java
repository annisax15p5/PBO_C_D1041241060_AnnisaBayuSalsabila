public class p041NamingConvention {
    //Deklarasi nilai PI dengan CONSTANT_CASE (tidak berubah-ubah)
    public static final double PI = 3.14;
    //dideklarasikan di level class (di luar method main)
    //Konstanta PI ditulis dengan huruf besar
    public static void main(String[] args) {
        //Variabel dengan camelCase 
        int studentAge = 20;
        String studentName = "Budi";
        boolean isActive = true;
        //Menampilkan nilai semua variabel
        System.out.println("Nama         : " + studentName);
        System.out.println("Umur         : " + studentAge);
        System.out.println("Status       : " + isActive);
        System.out.println("Konstanta PI : " + PI);
    }
}

