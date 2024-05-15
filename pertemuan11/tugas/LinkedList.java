package tugas;

import java.util.Scanner;

public class LinkedList {
    ScavengerHuntNode head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("==========================");
            System.out.println("Daftar Pertanyaan");
            System.out.println("==========================");

            ScavengerHuntNode currentNode = head;

            while (currentNode != null) {
                System.out.println("+" + currentNode.soal);
                currentNode = currentNode.next;
            }
            System.out.println("");

        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addLast(String soal, String kunci) {
        ScavengerHuntNode newNode = new ScavengerHuntNode(soal, kunci, null);
        if (head == null) {
            head = newNode;
        }else {
            ScavengerHuntNode currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next; 
            }
            currentNode.next = newNode;
        }
    }

    public void start(){
        Scanner input = new Scanner(System.in);
        ScavengerHuntNode currentNode = head;

        int benar = 0;
        int jumlahSoal = 0;

        while (currentNode != null) {
            System.out.println("Pertanyaan yang harus dijawab\t: " + currentNode.soal);
            System.out.print("Isi jawaban dari pertanyaan\t: ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase(currentNode.kunci)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
                System.out.println();
                benar++;
                currentNode = currentNode.next;
                
            } else {
                System.out.println("Jawaban salah. Coba lagi!");
                System.out.println();
            }
            jumlahSoal++;
        }

        System.out.println("==============");
        System.out.println("SUCCESSFULLY ");
        System.out.println("==============");
        System.out.println("Skor anda :");
        System.out.println("Benar "+benar);
        System.out.println("Salah "+(jumlahSoal-benar));
        System.out.println("Total Percobaan "+(jumlahSoal));
        System.out.println();
        System.out.println();
    }
}