package Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemNilai sistem = new SistemNilai();
        Scanner input = new Scanner(System.in);
        int pilihan;

        // insert data mahasiswa
        sistem.tambahMahasiswa("001", "abdur", "021xxx");
        sistem.tambahMahasiswa("002", "ikram", "021xxx");
        sistem.tambahMahasiswa("003", "rahman", "021xxx");
        sistem.tambahMahasiswa("004", "ghofur", "021xxx");
        sistem.tambahMahasiswa("005", "ibda", "021xxx");
        sistem.tambahMahasiswa("006", "asbak", "021xxx");

        sistem.tambahMataKuliah("01", "Internet of Things", 3);
        sistem.tambahMataKuliah("02", "Algoritma dan Struktur Data", 3);
        sistem.tambahMataKuliah("03", "Algoritma dan Pemrograman", 3);
        sistem.tambahMataKuliah("04", "Praktikum Algoritma dan Struktur Data", 3);
        sistem.tambahMataKuliah("05", "Praktikum Algoritma dan Pemrograman", 3);

        do {
            System.out.println("=======================================");
            System.out.println(" SISTEM PENGOLAHAN DATA NILAI MAHASISWA [dzulfikar / 1FSIB - 08] ");
            System.out.println("=======================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            // System.out.println("5. Keluar");
            System.out.println("5. Tambah Mahasiswa ke Antrian Penghapusan");
            System.out.println("6. Hapus Mahasiswa dari Antrian");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeMk = input.nextLine();
                    System.out.print("Masukkan Nilai: ");
                    double nilai = input.nextDouble();
                    sistem.inputNilai(nim, kodeMk, nilai);
                    break;
                case 2:
                    sistem.tampilNilai();
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    nim = input.nextLine();
                    sistem.cariNilaiMahasiswa(nim);
                    break;
                case 4:
                    sistem.urutDataNilai();
                    break;
                // case 5:
                //     return;

                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang akan ditambahkan ke antrian penghapusan: ");
                    nim = input.nextLine();
                    sistem.antrianHapusMahasiswa(nim);
                    break;
                case 6:
                    sistem.hapusMahasiswa();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Pilih antara 1-7.");
            }
        } while (pilihan != 7);
    }
}
