import java.util.Scanner;

public class Pemilihan08{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tugas = 0, kuis = 0, uts = 0, uas = 0, nilaiAkhir = 0; 
        String predikat ="", ket="";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        uas = input.nextInt();

        System.out.println("==============================");
        System.out.println("==============================");

        if(tugas > 100 || kuis > 100 ||uts > 100 ||uas > 100 ){
            System.out.println("Nilai tidak valid");
        }else{
            nilaiAkhir = (tugas*20/100) + (kuis*20/100) + (uts*30/100) + (uas*30/100);
            if(nilaiAkhir > 80){
                predikat = "A";
                ket = "SELAMAT ANDA LULUS";
            }else if(nilaiAkhir > 73){
                predikat = "B+";
                ket = "SELAMAT ANDA LULUS";
            }else if(nilaiAkhir > 65){
                predikat = "B";
                ket = "SELAMAT ANDA LULUS";
            }else if(nilaiAkhir > 60){
                predikat = "C+";
                ket = "SELAMAT ANDA LULUS";
            }else if(nilaiAkhir > 50){
                predikat = "C";
                ket = "SELAMAT ANDA LULUS";
            }else if(nilaiAkhir > 39){
                predikat = "D";
                ket = "MAAF, ANDA TIDAK LULUS";
            }else {
                predikat = "E";
                ket = "MAAF, ANDA TIDAK LULUS";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + predikat);
            
        }
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println(ket);
    }
}