public class HP {
    String merk;
    String tipe;
    float ukuranLayar;
    int harga;

    public HP(String mr, String tp, float ukuran) {
        merk = mr;
        tipe = tp;
        ukuranLayar = ukuran;
    }

    void cekKondisi(boolean c) {
        if (c == true) {
            System.out.println("HP ini second\n");

        } else {
            System.out.println("HP ini masih baru\n");
        }
    }

    void tampilInformasi() {
        System.out.printf("HP merk %s tipe %s dengan ukuran layar %.1f\n", merk, tipe, ukuranLayar);
    }

    void mengirimPesan(String pesan, String penerima, String paketData) {
        if (paketData.equalsIgnoreCase("ada")) {
            System.out.printf("Pesan %s berhasil dikirim ke %s", pesan, penerima);
        } else {
            System.out.printf("Pengirima pesan ke %s gagal", penerima);
        }
    }

    public class HPMain {
        public static void main(String[] args) {
            HP phone1 = new HP(null, null, 0);
            phone1.merk = "Samsung";
            phone1.tipe = "S23 Ultra";
            phone1.ukuranLayar = 6.8f;
            phone1.tampilInformasi();
            phone1.cekKondisi (false);
            
            HP phone2 = new HP("iPhone", "51 Plus", 6.8f);
            phone2.tampilInformasi();
            phone2.cekKondisi (true);
        }
    }
}
