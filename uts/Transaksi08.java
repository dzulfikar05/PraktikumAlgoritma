public class Transaksi08 {
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;

    public Transaksi08(double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi, String type) {
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
    }

    public Transaksi08(){}

    // Rekening08 rekening08 = new Rekening08();

    Transaksi08 data[] = new Transaksi08[1000];
    int idx;

    void tambah(Transaksi08 d) {
        if (idx < data.length) {
            data[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    Transaksi08[] getData(){
        return data;
    }

    void updateData(Transaksi08 dataUpdate[])
    {
        data = dataUpdate;
    }

    void tampilAll(Rekening08 dataCust[]) {
        System.out.println();
        System.out.println("Data Transaksi");
        System.out.println();
        System.out.println("No Rekening \t Saldo \t Saldo Awal \t Saldo Akhir \t Tanggal Transaksi");
        for(int i=0; i<data.length; i++)
        {
            if(data[i] != null){
                System.out.println(dataCust[i].noRekening+"\t"+data[i].saldo+"\t"+data[i].saldoAwal+"\t"+data[i].saldoAkhir+"\t"+data[i].tanggalTransaksi);
            }
        }
        System.out.println();
    }

    void showDataSaldoLessThan(int threshold, Rekening08 dataCust[] ) {
        int min = threshold;
        System.out.println();
        System.out.println("Data Filter Saldo Kurang Dari" + min);
        System.out.println();
        System.out.println("No Rekening \t Saldo \t Saldo Awal \t Saldo Akhir \t Tanggal Transaksi");
        for (int i = 0; i < idx; i++) {
            if (data[i] != null && data[i].saldo < threshold) {
                System.out.println(dataCust[i].noRekening+"\t"+data[i].saldo+"\t"+data[i].saldoAwal+"\t"+data[i].saldoAkhir+"\t"+data[i].tanggalTransaksi);
            }
        }
    }
}
