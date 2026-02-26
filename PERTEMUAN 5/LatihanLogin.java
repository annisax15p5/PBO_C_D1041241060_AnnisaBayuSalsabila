public class LatihanLogin {
    public static void main(String[] args) {
        //deklarasi variable username dan password
        String inputUsername = "admin";
        //String inputPassword = "admin123";
        String inputPassword = "admin321";//input sesuaikan kondisi
        //Menampilkan tampilan user untuk validasi login
        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: ****");
        System.out.println("---");
        //kondisi untuk mengecek apakah username valid atau tidak
        if(inputUsername.equals("admin")){//jika username valid
            System.out.println("Username valid");
            //kondisi untuk mengecek apakah password valid atau tidak
            if(inputPassword.equals("admin123")){//jika password valid
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
            }else{//kondisi jika password tidak valid
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
        }else{//kondisi jika username tidak valid
            System.out.println("Username tidak valid");
            System.out.println("LOGIN GAGAL!");
        }
    }
}