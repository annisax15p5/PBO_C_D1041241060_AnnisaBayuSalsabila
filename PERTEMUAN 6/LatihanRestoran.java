public class LatihanRestoran {
    public static void main(String[] args) {
        //deklarasi variable kode menu dan jumlah pesanan
        int menuCode = 1;
        int menuQuantity = 2;
        //deklarasi variable bantuan
        int hargaSatuan =0;
        int totalBayar=0;
        //Menampilkan tampilan user untuk menu restoran
        System.out.println("=== MENU RESTORAN ===");
        //menampilkan kode menu dan
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + menuQuantity);
        System.out.println();
        System.out.println("Pesanan Anda:");
        //switch statement
        switch (menuCode){
            case 1: 
                hargaSatuan = 15000;
                totalBayar = hargaSatuan * menuQuantity;
                System.out.println("Nama Menu: Nasi Goreng");
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + menuQuantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalBayar);
                break;
            case 2:
                hargaSatuan = 12000;
                totalBayar = hargaSatuan * menuQuantity;
                System.out.println("Nama Menu: Mie Ayam");
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + menuQuantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalBayar);
                break;
            case 3:
                hargaSatuan = 10000;
                totalBayar = hargaSatuan * menuQuantity;
                System.out.println("Nama Menu: Bakso");
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + menuQuantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalBayar);
                break;
            case 4:
                hargaSatuan = 13000;
                totalBayar = hargaSatuan * menuQuantity;
                System.out.println("Nama Menu: Soto Ayam");
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + menuQuantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalBayar);
                break;
            case 5:
                hargaSatuan = 3000;
                totalBayar = hargaSatuan * menuQuantity;
                System.out.println("Nama Menu: Es Teh");
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + menuQuantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalBayar);
                break;
        }
    }
}

