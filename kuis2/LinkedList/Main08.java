package LinkedList;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        LinkedList08 MenuList = new LinkedList08();

        MenuList.add(new RestaurantLL08("RM001", "Ayam Goreng Padang", 25000));
        MenuList.add(new RestaurantLL08("RM002", "Mie Ayam Bakso ", 15000));
        MenuList.add(new RestaurantLL08("RM003", "Gudeg Jogja", 30000));
        MenuList.add(new RestaurantLL08("RM004", "Nasi Kandar ", 20000));
        MenuList.add(new RestaurantLL08("RM005", "Rujak Cingur", 50000));

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
                    System.out.print("ID Menu   : ");
                    String idItem = scanner.nextLine();
                    System.out.print("Nama Menu : ");
                    String namaItem = scanner.nextLine();
                    System.out.print("Harga Menu        : ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine();
                    MenuList.add(new RestaurantLL08(idItem, namaItem, harga));
                    break;
                case 2:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("                     HAPUS MENU      ");  
                    System.out.println("-------------------------------------------------------");
                    System.out.print("ID Menu   : ");
                    idItem = scanner.nextLine();
                    MenuList.delete(idItem);
                    break;
                case 3:
                    System.out.println("-------------------------------------------------------");
                    System.out.println("                      CARI MENU        ");  
                    System.out.println("-------------------------------------------------------");
                    System.out.print("ID Menu   : ");
                    idItem = scanner.nextLine();
                    RestaurantLL08 menu = MenuList.get(idItem);
                    if (menu != null) {
                        System.out.println("-------------------------------------------------------");
                        System.out.println(menu);
                        System.out.println("-------------------------------------------------------");
                    } else {
                        System.out.println("Menu tidak ditemukan");
                    }
                    break;
                case 4:
                    MenuList.printAll();
                    System.out.println("----------------------------------------------------");
                    break;
                case 5:
                    MenuList.sortDesc();
                    System.out.println("----------------------------------------------------");
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
