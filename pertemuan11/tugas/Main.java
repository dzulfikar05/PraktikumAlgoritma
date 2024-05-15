package tugas;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("=======================");
        System.out.println("PILIHAN MENU");
        System.out.println("=======================");
        System.out.println("1. Tampilkan pertanyaan");
        System.out.println("2. Jaweb pertanyaan");
        System.out.println("3. Exit");
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList linkedList = new LinkedList();
        int pil;

        do {
            menu();
            System.out.print("Pilih salah satu (1/2/3) : ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    linkedList.addLast("suku yang ramah", "jawa");
                    linkedList.addLast("poltek identik dengan warna", "biru");
                    linkedList.addLast("roda mobil ada (jawab dengan kata)", "empat");
                    linkedList.addLast("roda motor ada (jawab dengan kata)", "dua");
                    linkedList.print();
                    break;
                case 2:
                    linkedList.start();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia .");
                    break;
            }
        } while (pil == 1 || pil == 2 || pil == 3);
    }

}
