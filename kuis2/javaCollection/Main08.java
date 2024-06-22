
import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        List08 MenuList = new List08();  

        MenuList.add(new Restaurant08("RM001", "Ayam Goreng Padang", 25000));
        MenuList.add(new Restaurant08("RM002", "Mie Ayam Bakso ", 15000));
        MenuList.add(new Restaurant08("RM003", "Gudeg Jogja", 30000));
        MenuList.add(new Restaurant08("RM004", "Nasi Kandar ", 20000));
        MenuList.add(new Restaurant08("RM005", "Rujak Cingur", 50000));

        Scanner scanner = new Scanner(System.in);
        int pil;

        do {
            System.out.println("====================================================");
            System.out.println("          MENU   [Restourant : Dzulfikar/08]        ");
            System.out.println("====================================================");
            System.out.println("1. Tambah Menu");  
            System.out.println("2. Hapus Menu");  
            System.out.println("3. Cari Menu");  
            System.out.println("4. Tampilkan Semua Menu ");  
            System.out.println("5. Tampilkan Harga dari termahal (desc) ");  
            System.out.println("6. Keluar");  
            System.out.println("================================================");


            System.out.print("Pilih Menu : ");
            pil = scanner.nextInt();
            scanner.nextLine();

            switch (pil) {
                case 1:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("                    TAMBAH MENU      ");  
                    System.out.println("-------------------------------------------------------");
                    System.out.print("ID Menu  : ");
                    String idMenu = scanner.nextLine();
                    System.out.print("Nama Menu : ");
                    String namaMenu = scanner.nextLine();
                    System.out.print("Harga Menu : ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine();
                    MenuList.add(new Restaurant08(idMenu, namaMenu, harga));
                    break;
                case 2:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("                     HAPUS MENU      ");  
                    System.out.println("-------------------------------------------------------");
                    System.out.print("ID Menu  : ");
                    idMenu = scanner.nextLine();
                    MenuList.delete(idMenu);
                    break;
                case 3:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("                      CARI MENU        ");  
                    System.out.println("-------------------------------------------------------");
                    System.out.print("ID Menu  : ");
                    idMenu = scanner.nextLine();
                    Restaurant08 restoran = MenuList.get(idMenu);
                    if (restoran != null) {
                        System.out.println("-------------------------------------------------------");
                        System.out.println(restoran);
                        System.out.println("-------------------------------------------------------");
                    } else {
                        System.out.println("Restoran tidak ditemukan");
                    }
                    break;
                case 4:
                    MenuList.printAll();
                    System.out.println("-------------------------------------------------------");
                    break;
                case 5:
                    MenuList.sortDesc();
                    System.out.println("-------------------------------------------------------");
                   break;
                case 6:
                   return;
                default:
                    System.out.println("Pilihan tidak tersedia, pilihan (1/2/.../6).");
            }
        } while (pil != 6);

        scanner.close();
    }
}