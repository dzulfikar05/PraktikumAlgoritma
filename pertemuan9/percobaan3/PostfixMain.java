package percobaan3;

import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ") ";

        int total = Q.length();

        Postfix08 post = new Postfix08 (total) ;
        P = post.konversi(Q) ;
        System.out.println("Posftix: " + P);
    }
}
