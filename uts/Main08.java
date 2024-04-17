import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rekening08 rekening08 = new Rekening08();
        Transaksi08 transaksi08 = new Transaksi08();
        
        // insert Rekening
        rekening08.tambah(new Rekening08("16030927 3084","Wallace","Chase Castro","1-458-264-3263","ligula.Nullam@tacitisociosqu.edu"));
        rekening08.tambah(new Rekening08("16100617 0573","Darius","Julian Daniel","1-357-843-0547","nec@lectusjusto.org"));
        rekening08.tambah(new Rekening08("16240401 2243","Fuller","Finn Dunlap","571-7062","convallis@Vestibulumanteipsum.org"));
        rekening08.tambah(new Rekening08("16270525 0112","Malcolm","Keane Floyd","623-0234","porttitor.tellus.non@Curabitur.ca"));
        rekening08.tambah(new Rekening08("16971204 2416","Geoffrey","Stephen Pratt","1-683-416-8323","ut.pellentesque@luctusutpellentesque.com"));
        
        
        // insert Transaction
        transaksi08.tambah(new Transaksi08(898214,494048,3587,"2021-03-09 07:54:42", "active"));
        transaksi08.tambah(new Transaksi08(205420,200162,775880,"2021-06-25 10:23:00", "active"));
        transaksi08.tambah(new Transaksi08(838632,350929,328316,"2021-09-18 23:00:04", "active"));
        transaksi08.tambah(new Transaksi08(230659,204434,690503,"2022-02-02 19:10:34", "active"));
        transaksi08.tambah(new Transaksi08(770592,334245,444267,"2020-08-11 13:36:56", "active"));
      


        int pil = 0;
        while (true) {
            System.out.println("=======================================");
            System.out.println("SISTEM INFORMASI PERBANKAN DZULFIKAR 08");
            System.out.println("=======================================");
            System.out.println("1. Tampilkan Data Rekening");
            System.out.println("2. Tampilkan Data Transaksi");
            System.out.println("3. Mencari Saldo > 750000");
            System.out.println("4. Sorting By Name");
            System.out.println("5. Keluar");
            System.out.print( "Pilih [1-5] : ");
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    rekening08.tampilAll();
                    break;
                case 2:
                    Rekening08 dataCust[] = rekening08.getData();
                    transaksi08.tampilAll(dataCust);
                    break;
                case 3:
                    Rekening08 dataCust1[] = rekening08.getData();
                    transaksi08.showDataSaldoLessThan(750000, dataCust1);
                    break;
                case 4:
                    Transaksi08 dataTra[] = transaksi08.getData();
                    transaksi08.updateData(rekening08.sortByName(dataTra));
                    rekening08.tampilAll();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia. Silahkan Pilih Lagi.");
                    break;
            }
        }
    }
}
