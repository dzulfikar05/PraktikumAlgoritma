import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pajak08 {
    List<Kendaraan08> kendaraan08 = new ArrayList<>();
    List<TransaksiPajak08> transaksiPajak08 = new ArrayList<>();
    private static int kodeCounter = 1;

    void tambahKendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        Kendaraan08 kendaraan = new Kendaraan08( noTNKB,  nama,  jenis, cc, tahun, bulanHarusBayar);
        kendaraan08.add(kendaraan);
    }

    void tampilKendaraaan() {
        System.out.println("=======================================");
        System.out.println("         DAFTAR Kendaraan        ");
        System.out.println("=======================================");
        System.out.println("Nomor TNKB |Nama Pemilik | Jenis\t | CC Kendaraan | Tahun  | Bulan Harus Bayar");
        for (Kendaraan08 kendaraan : kendaraan08) {
            System.out.println(kendaraan.noTNKB+" \t"+kendaraan.nama+"\t\t"+kendaraan.jenis+"\t\t"+kendaraan.cc+"\t\t"+kendaraan.tahun+"\t\t"+kendaraan.bulanHarusBayar+"\t\t");
        }
        System.out.println("---------------------------------------");
    }

    void bayarPajak() {
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("         BAYAR PAJAK KENDARAAN        ");
        System.out.println("=======================================");

        System.out.print("Masukkan Nomor TNKB: ");
        String noTNKB = input.nextLine();

        System.out.print("Masukkan Bulan Bayar: ");
        int bulanBayar = input.nextInt();
        input.nextLine();

        Kendaraan08 kendaraan = cariKendaraan(noTNKB);
        if (kendaraan != null) {
            long nominalBayar = hitungPajak(kendaraan, bulanBayar);
            long denda = hitungDenda(bulanBayar, kendaraan.bulanHarusBayar);

            System.out.println("=======================================");
            System.out.println("         RINCIAN PEMBAYARAN        ");
            System.out.println("=======================================");
            System.out.println("Nomor TNKB             : " + kendaraan.noTNKB);
            System.out.println("Nama Pemilik           : " + kendaraan.nama);
            System.out.println("Jenis Kendaraan        : " + kendaraan.jenis);
            System.out.println("CC Kendaraan            : " + kendaraan.cc);
            System.out.println("Bulan Harus Bayar      : " + kendaraan.bulanHarusBayar);
            System.out.println("Bulan Bayar             : " + bulanBayar);
            System.out.println("Nominal Pajak          : Rp" + nominalBayar);
            System.out.println("Denda                 : Rp" + denda);
            System.out.println("Total Bayar            : Rp" + (nominalBayar + denda));
            System.out.println("---------------------------------------");

            System.out.print("Konfirmasi pembayaran? (Y/N): ");
            String konfirmasi = input.nextLine().toUpperCase();

            if (konfirmasi.equals("Y")) {
                TransaksiPajak08 transaksiPajak = new TransaksiPajak08(kodeCounter++, nominalBayar, denda, bulanBayar, kendaraan);
                transaksiPajak08.add(transaksiPajak);
                System.out.println("Pembayaran pajak berhasil.");
            } else {
                System.out.println("Pembayaran pajak dibatalkan.");
            }
        } else {
            System.out.println("Kendaraan dengan nomor TNKB " + noTNKB + " tidak ditemukan.");
        }
    }

    private Kendaraan08 cariKendaraan(String noTNKB) {
        for (Kendaraan08 kendaraan : kendaraan08) {
            if (kendaraan.noTNKB.equals(noTNKB)) {
                return kendaraan;
            }
        }
        return null;
    }
    long hitungPajak(Kendaraan08 kendaraan, int bulanBayar) {
        int tarifPajak = 0;

        if (kendaraan.jenis.equalsIgnoreCase("Motor")) {
            if (kendaraan.cc < 100) {
                tarifPajak = 100000;
            } else if (kendaraan.cc <= 250) {
                tarifPajak = 250000;
            } else {
                tarifPajak = 500000;
            }
        } else if (kendaraan.jenis.equalsIgnoreCase("Mobil")) {
            if (kendaraan.cc < 1000) {
                tarifPajak = 750000;
            } else if (kendaraan.cc <= 2500) {
                tarifPajak = 1000000;
            } else {
                tarifPajak = 1500000;
            }
        }
        return tarifPajak;
    }

    public long hitungDenda(int bulanBayar, int bulanHarusBayar) {
        int denda = 0;

        if (bulanBayar > bulanHarusBayar) {
            int telatBulan = bulanBayar - bulanHarusBayar;

            if (telatBulan <= 3) {
                denda = 50000 * telatBulan;
            } else {
                denda = 50000 * 3;
                denda += (telatBulan - 3) * 50000;
            }
        }

        return denda;
    }

    public void tampilSemuaTransaksi() {
        if (transaksiPajak08.isEmpty()) {
            System.out.println("Belum ada data transaksi pajak.");
        } else {
            System.out.println("=========================================================");
            System.out.println("                       DAFTAR TRANSAKSI PAJAK                    ");
            System.out.println("=========================================================");
            System.out.println("Kode | TNKB \t\t| Nama Pemilik | Nominal | Denda ");
            for (TransaksiPajak08 transaksiPajak : transaksiPajak08) {
                System.out.println(transaksiPajak.kode + " \t " + transaksiPajak.kendaraan08.noTNKB + " \t " + transaksiPajak.kendaraan08.nama + "\t \t " + transaksiPajak.nominalBayar + " \t " + transaksiPajak.denda);
            }
            System.out.println("---------------------------------------------------------");
        }
    }

    public void tampilTransaksiPemiliki() {
        if (transaksiPajak08.isEmpty()) {
            System.out.println("Belum ada data transaksi pajak.");
        } else {
            Collections.sort(transaksiPajak08, new Comparator<TransaksiPajak08>() {
                @Override
                public int compare(TransaksiPajak08 transaksi1, TransaksiPajak08 transaksi2) {
                    return transaksi1.kendaraan08.nama.compareToIgnoreCase(transaksi2.kendaraan08.nama);
                }
            });

            System.out.println("=========================================================");
            System.out.println(" DAFTAR TRANSAKSI PEMBAYARAN PAJAK ");
            System.out.println("=========================================================");
            System.out.println("Kode | TNKB \t| Nama Pemilik | Nominal Bayar | Denda");
            for (TransaksiPajak08 transaksiPajak : transaksiPajak08) {
                System.out.println(transaksiPajak.kode + " \t " + transaksiPajak.kendaraan08.noTNKB + " \t " + transaksiPajak.kendaraan08.nama + "\t \t " + transaksiPajak.nominalBayar + " \t " + transaksiPajak.denda);
            }
            System.out.println("---------------------------------------------------------");
        }
    }
   
}
