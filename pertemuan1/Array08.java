import java.util.Scanner;

public class Array08 {
    static String[][] dataMatkul = new String[8][5];
    static Scanner input = new Scanner(System.in);
    static double ips = 0, countNilai = 0, countSks = 0;
    public static void main(String[] args) {
        dataMatkul[0][0] = "Pancasila \t\t\t";
        dataMatkul[1][0] = "Konsep Teknologi Informasi\t";
        dataMatkul[2][0] = "Critical Thingking dan Problem Solving";
        dataMatkul[3][0] = "Matematika Dasar\t\t";
        dataMatkul[4][0] = "Bahasa Inggris \t\t\t";
        dataMatkul[5][0] = "Dasar Pemrograman \t\t";
        dataMatkul[6][0] = "Praktikum Dasar Pemrograman\t";
        dataMatkul[7][0] = "Keselamatan dan Kesehatan Kerja\t";

        inputData();
        getPredicate();
        getIPS();
        showData();
    }

    public static void inputData(){

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for(int i=0; i < dataMatkul.length; i++){
            System.out.print("Masukkan Nilai Angka untuk Mk "+dataMatkul[i][0]+ " : ");
            dataMatkul[i][1] = input.next();
            System.out.print("Masukkan SKS untuk Mk "+dataMatkul[i][0]+ " : ");
            dataMatkul[i][2] = input.next();
            System.out.println();
        }
    }

    public static void getPredicate(){
        for(int i=0; i<dataMatkul.length; i++){
            if(Double.valueOf(dataMatkul[i][1]) > 80){
                dataMatkul[i][3] = "A";
                dataMatkul[i][4] = "4.00";
            }else if(Double.valueOf(dataMatkul[i][1]) > 73){
                dataMatkul[i][3] = "B+";
                dataMatkul[i][4] = "3.50";
            }else if(Double.valueOf(dataMatkul[i][1]) > 65){
                dataMatkul[i][3] = "B";
                dataMatkul[i][4] = "3.00";
            }else if(Double.valueOf(dataMatkul[i][1]) > 60){
                dataMatkul[i][3] = "C+";
                dataMatkul[i][4] = "2.50";
            }else if(Double.valueOf(dataMatkul[i][1]) > 50){
                dataMatkul[i][3] = "C";
                dataMatkul[i][4] = "2.00";
            }else if(Double.valueOf(dataMatkul[i][1]) > 39){
                dataMatkul[i][3] = "D";
                dataMatkul[i][4] = "1.50";
            }else {
                dataMatkul[i][3] = "E";
                dataMatkul[i][4] = "1.00";
            }
        }
    }

    public static void getIPS(){
        
        for(int i=0; i<dataMatkul.length; i++){
            countNilai += (Double.valueOf(dataMatkul[i][4]) * Double.valueOf(dataMatkul[i][2]));
            countSks += Double.valueOf(dataMatkul[i][2]);
        }
        ips = countNilai/countSks;
    }

    public static void showData(){
        
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.println("MK \t\t\t\t\t Nilai Angka \t Nilai Huruf \t Bobot Nilai \t\t SKS");
        for(int i=0; i<dataMatkul.length; i++){
            System.out.println(dataMatkul[i][0] +"\t\t"+ dataMatkul[i][1] +"\t\t"+ dataMatkul[i][3] +"\t\t"+ dataMatkul[i][4] +"\t\t"+ dataMatkul[i][2]);
        }

        System.out.println("==============================");
        System.out.println("IP : " + ips);
    }

    
}
