public class LatihanHariBulan {
    public static void main(String[] args) { 
        //deklarasi variable month
        int sampleMonth = 4;
        //Menampilkan tampilan user jumlah hari dalam bulan
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        //switch statement dengan range 12 angka untuk konversi ke 12 bulan
        switch (sampleMonth) {
            case 1:
                System.out.println("Bulan: Januari (bulan ke-" + sampleMonth + ")" );
                break;
            case 2:
                System.out.println("Bulan: Februari (bulan ke-" + sampleMonth + ")" );
                break;
            case 3:
                System.out.println("Bulan: Maret (bulan ke-" + sampleMonth + ")" );
                break;
            case 4:
                System.out.println("Bulan: April (bulan ke-" + sampleMonth + ")" );
                break;
            case 5:
                System.out.println("Bulan: Mei (bulan ke-" + sampleMonth + ")" );
                break;
            case 6:
                System.out.println("Bulan: Juni bulan ke-" + sampleMonth + ")" );
                break;
            case 7:
                System.out.println("Bulan: Juli (bulan ke-" + sampleMonth + ")" );
                break;
            case 8:
                System.out.println("Bulan: Agustus (bulan ke-" + sampleMonth + ")" );
                break;
            case 9: 
                System.out.println("Bulan: September (bulan ke-" + sampleMonth + ")" );
                break;              
            case 10:
                System.out.println("Bulan: Oktober (bulan ke-" + sampleMonth + ")" );
                break;
            case 11:
                System.out.println("Bulan: November (bulan ke-" + sampleMonth + ")" );
                break;
            case 12:
                System.out.println("Bulan: Desember (bulan ke-" + sampleMonth + ")" );
                break;
        }
        //Menggunakan switch dengan fall through yang disengaja untuk bulan dengan hari yang sama
        switch (sampleMonth) {
            //fall through yang disengaja untuk bulan dengan 31 hari 
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Jumlah Hari : 31");
                break;
            //fall through yang disengaja untuk bulan dengan 30 hari
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Jumlah Hari : " + 30);
                break;
            //fall through yang disengaja untuk bulan dengan 28 hari
            case 2:
                System.out.println("Jumlah Hari : " + 28);
                break;
        }
    }
}

