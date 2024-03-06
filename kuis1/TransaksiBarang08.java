import java.util.Scanner;

public class TransaksiBarang08 {
    Scanner input = new Scanner(System.in);

    String pil = "";
    String kode;
    public TransaksiBarang08 (String kode){
        this.kode = kode;
    }
    public TransaksiBarang08 (){
    }

    Barang08 barang08 = new Barang08();
    public TransaksiBarang08[] inputTransksi(TransaksiBarang08[] pembelian, Barang08[] data)
    {
        int counter = 1;

        System.out.println();
        System.out.print("Masukkan kode barang : ");
        kode = input.next();

        if(barang08.checkKode(kode, data)){
            pembelian[0] = new TransaksiBarang08(kode);
        }
        
        while(true){
            System.out.print("Apakah akan belanjan kembali (y/n) ? ");
            pil = input.next();
            if(pil.equalsIgnoreCase("y")){
                System.out.print("Masukkan kode barag :");
                kode = input.next();
                if(barang08.checkKode(kode, data)){
                    pembelian[counter] = new TransaksiBarang08(kode);
                    counter++;
                }
            }else{
                break;
            }
        }

        return pembelian;
    }
}