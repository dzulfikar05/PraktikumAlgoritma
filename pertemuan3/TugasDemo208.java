import java.util.Scanner;

public class TugasDemo208 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalBayar, jumlahUang, diskon;
        int jumlahTransaksi;
        Transaksi transaksi = new Transaksi();
        Omset omset = new Omset();

        System.out.print("Masukkan Berapa transaksi (1 transaksi / hari) :");
        jumlahTransaksi = input.nextInt();
        
        Transaksi[] data = new Transaksi[jumlahTransaksi];

        for(int i =0; i<jumlahTransaksi; i++)
        {
            System.out.println("Transaksi ke-"+(i+1));
            
            System.out.print("Masukkan jumlah Total Bayar : ");
            totalBayar = input.nextDouble();
            System.out.print("Masukkan jumlah Uang : ");
            jumlahUang = input.nextDouble();
            System.out.print("Masukkan Diskon (%) : ");
            diskon = input.nextDouble();

            data[i] = new Transaksi(totalBayar, jumlahUang, diskon);
            System.out.println();
        }

        transaksi.bayar(data);
        
        omset.getOmset(data);
        omset.getAvg(data);
        omset.getHighest(data);
        

    }
}
