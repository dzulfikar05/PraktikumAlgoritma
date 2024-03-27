import java.util.Scanner;

public class MahasiswaMain08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        int jumMhs;
        
        System.out.println("---------------------------------------------------------");
        System.out.print("Masukkan berapa banyak data yang ingin ditambahkan : ");
        jumMhs = s.nextInt();
        
        PencarianMhs08 data = new PencarianMhs08(jumMhs);
        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("---------------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa08 m = new Mahasiswa08(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        // System.out.println("---------------------------------------------------------");
        // System.out.println("---------------------------------------------------------");
        // System.out.println("Pencarian Data : ");
        // System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
        // System.out.print("NIM : ");
        // int cari = s.nextInt();
        // System.out.println("menggunakan sequential Search");
        // int posisi = data.FindSeqSearch(cari);

        // data.Tampilposisi(cari, posisi);
        // data.TampilData(cari, posisi);



      

        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cari = s.next();

        System.out.println("==========================================================");
        System. out.println("menggunakan binary Search") ;


        // posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.countSearchName(cari);
        int posisi = data.FindBinarySearchByName(cari, 0, jumMhs - 1, 0);
        data.TampilposisiNama(cari, posisi);
        data.TampilDataNama (cari, posisi);

    }
}
