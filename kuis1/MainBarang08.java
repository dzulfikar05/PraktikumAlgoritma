import java.util.Scanner;

public class MainBarang08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Barang08 barang08 = new Barang08();
        TransaksiBarang08 transaksiBarang08 = new TransaksiBarang08();
        Pembelian08 pembelian08 = new Pembelian08();
        int pil = 0;

        Barang08[] data = new Barang08[5];
        TransaksiBarang08[] pembelian = new TransaksiBarang08[100];

        data[0] = new Barang08("K01", "Buku", 5000, 10);
        data[1] = new Barang08("K02", "Pensil", 1000, 15);
        data[2] = new Barang08("K03", "Bulpen", 2000, 15);
        data[3] = new Barang08("K04", "Sandal", 5000, 5);
        data[4] = new Barang08("K05", "Tipex", 3000, 10);

        while (true) {
            System.out.println("====================");
            System.out.println("TOKO DZULFIKAR 08");
            System.out.println("====================");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            System.out.print( "Pilih [1-4] : ");
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    barang08.tampilBarang(data);
                    break;
                case 2:
                    barang08.tampilBarang(data);
                    pembelian = transaksiBarang08.inputTransksi(pembelian, data);
                    break;
                case 3:
                    pembelian08.pembelian(pembelian, data);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia. Silahkan Pilih Lagi.");

                    break;
            }

        }

        
    }
}
