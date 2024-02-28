public class Transaksi {
    public double totalBayar, jumlahUang, diskon;
    
    public Transaksi (double totalBayar, double jumlahUang, double diskon){
        this.totalBayar = totalBayar;
        this.jumlahUang = jumlahUang;
        this.diskon = diskon;
    }
    public Transaksi (){ }

    public void bayar(Transaksi[] data){

        for(int i =0; i<data.length; i++){

            if(data[i].jumlahUang<data[i].totalBayar){
                System.out.println("Maaf, uang anda kurang");
            }else{
                
                double total = (data[i].totalBayar * data[i].diskon) / 100;
                
                double diskon = data[i].totalBayar*data[i].diskon/100;
                System.out.println("Total Bayar \t : " + data[i].totalBayar);
                System.out.println("Jumlah Uang \t : " + data[i].jumlahUang);
                System.out.println("Diskon \t\t : "+ diskon);
                System.out.println("Kembalian anda \t:" + kembalian(total, data[i].jumlahUang));
                System.out.println();
            }
        }

    }

    public double kembalian(double totalBayar, double jumlahUang){
        double back = 0;
        back = jumlahUang - totalBayar; 
        return back;
    }

}
