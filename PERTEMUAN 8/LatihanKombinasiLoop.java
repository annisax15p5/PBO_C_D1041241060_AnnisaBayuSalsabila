public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        
        // Outer loop untuk baris 1-3
        for (int i = 1; i <= 3; i++) {
            
            // Inner loop untuk kolom 1-5
            for (int j = 1; j <= 5; j++) {
                
                System.out.println("Cek: [" + i + "," + j + "]");
                
                // Jika koordinat [2,3] ditemukan
                if (i == 2 && j == 3) {
                    System.out.println("✓ Koordinat ditemukan!");
                    break; // Keluar dari inner loop saja
                }
            }
            if (i == 2) {
                break;
            }
        }
        System.out.println("Pencarian selesai.");
    }
}

