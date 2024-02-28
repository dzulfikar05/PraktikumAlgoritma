public class Omset {
    public Omset (){ }
    

    public void getOmset(Transaksi[] data)
    {
        for(int i =0; i<data.length; i++){
            double total = data[i].totalBayar - ((data[i].totalBayar*data[i].diskon)/100);
            System.out.println("Omset hari ke-"+(i+1)+" : "+ total);
        }
        System.out.println();
    }
    
    public void getAvg(Transaksi[] data)
    {
        double avg =0;
        for(int i =0; i<data.length; i++){
            avg += data[i].totalBayar - ((data[i].totalBayar*data[i].diskon)/100);
        }
        System.out.println("Rata rata omset : " + (avg/data.length));
        System.out.println();
    }

    public void getHighest(Transaksi[] data)
    {
        double highest = 0;
        double index = 0;
        for(int i =0; i<data.length; i++){
            double total = data[i].totalBayar - ((data[i].totalBayar*data[i].diskon)/100);
            if(total > highest){
                index = i;
                highest = total;
            }
        }
        System.out.println("Omset Tertinggi pada hari ke-"+(index+1)+ " Sebesar : "+ highest);
        System.out.println();
    }
}
