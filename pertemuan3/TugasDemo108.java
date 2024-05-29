import java.util.Scanner;
public class TugasDemo108 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.print("Masukkan berapa mahasiswa yang ingin di data : ");
        length = sc.nextInt();

        Tugas108[] mahasiswa = new Tugas108[length];
        double ipk;
        String nama, nim, jenisKelamin;

       
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            nama = sc.next();
            System.out.print("Masukkan NIM: ");
            nim = sc.next();
            System.out.print("Masukkan jenis kelamin: ");
            jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            ipk = sc.nextDouble();

            mahasiswa[i] = new Tugas108(nama, nim, jenisKelamin, ipk);
            System.out.println();
        }
        Tugas108 tugas108 = new Tugas108();
        tugas108.cetakInfo(mahasiswa);
        
    }
}
