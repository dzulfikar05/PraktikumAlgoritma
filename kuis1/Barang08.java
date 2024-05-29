public class Barang08 {

    public String kode, nama;
    public int harga, stok;

    public Barang08 (String kode, String nama, int harga, int stok){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }


    public Barang08 (){ }

    public void tampilBarang(Barang08[] data){

        System.out.println();
        System.out.println("====================");
        System.out.println("Daftar Barang");
        System.out.println("====================");
        System.out.println("Kode\t\tNama\t\tHarga\t\tStok");
        for(int i =0; i<data.length; i++)
        {
            System.out.println(data[i].kode+"\t\t"+data[i].nama+"\t\t"+data[i].harga+"\t\t"+data[i].stok);
        }
        System.out.println();
    }


    public boolean checkKode(String kode, Barang08[] data)
    {
        boolean result = false;
        for(int i =0; i<data.length; i++)
        {
            if(data[i].kode.equalsIgnoreCase(kode)){
                result =  true;
            }
        }
        return result;
    }
}