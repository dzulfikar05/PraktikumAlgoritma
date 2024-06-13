import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Pajak08 pajak = new Pajak08();
        Scanner input = new Scanner(System.in);
        int pilihan;


        // insert data mahasiswa
        pajak.tambahKendaraan("N 001 C", "abdur", "mobil", 2010, 2001, 4);
        pajak.tambahKendaraan("B 002 C", "kode", "motor", 100, 2009, 5);
        pajak.tambahKendaraan("S 003 C", "khodir", "mobil", 2500, 2001, 8);
        pajak.tambahKendaraan("D 004 C", "dudung", "motor", 200, 2012, 1);
        pajak.tambahKendaraan("D 005 C", "dono", "mobil", 1900, 2005, 3);
       
        do {
            System.out.println("=======================================");
            System.out.println("  MENU [dzulfikar / 1FSIB - 08] ");
            System.out.println("=======================================");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampil seluruh transaksi");
            System.out.println("4. Urutkan transaksi berdasar nama pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();  

            switch (pilihan) {
                case 1:
                    pajak.tampilKendaraaan();
                    break;
                case 2:
                    pajak.bayarPajak();
                    break;
                case 3:
                    pajak.tampilSemuaTransaksi();
                    break;
                case 4:
                    pajak.tampilTransaksiPemiliki();
                    break;
                case 5:
                    return;

              
                default:
                    System.out.println("Pilih antara 1-5.");
            }
        } while (pilihan != 5);
    }
}
