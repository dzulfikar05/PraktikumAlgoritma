public class TransaksiPajak08 {
    int kode, bulanBayar;
    long nominalBayar, denda;
    Kendaraan08 kendaraan08;

    TransaksiPajak08(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan08 kendaraan08) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan08 = kendaraan08;
    }
}
