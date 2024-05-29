package jobsheet6;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi08 list = new DaftarMahasiswaBerprestasi08();
        Mahasiswa08 m1 = new Mahasiswa08("Nusa", 2017, 25, 3);
        Mahasiswa08 m2 = new Mahasiswa08("Rara", 2012, 19, 4);
        Mahasiswa08 m3 = new Mahasiswa08("Dompu", 2018, 19, 3.5);
        Mahasiswa08 m4 = new Mahasiswa08("Abdul", 2017, 23, 2);
        Mahasiswa08 m5 = new Mahasiswa08("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list. tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
