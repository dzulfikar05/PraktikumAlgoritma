public class Pembelian08 {
    
    TransaksiBarang08 transaksiBarang08 = new TransaksiBarang08();

    public void pembelian(TransaksiBarang08[] pembelian, Barang08[] data)
    {
        System.out.println();
        System.out.println("====================");
        System.out.println("Daftar Pembelian");
        System.out.println("====================");
        System.out.println("Kode\t\tNama\t\tHarga\t\tStok");

        for(int i=0; i<pembelian.length; i++){
            for(int j=0; j<data.length; j++){
                if(pembelian[i] != null){
                    if(pembelian[i].kode.equalsIgnoreCase(data[j].kode)){
                        System.out.println(data[j].kode+"\t\t"+data[j].nama+"\t\t"+data[j].harga+"\t\t"+data[j].stok);
                    }
                }
            }
        }


    }
}
