import java.util.Scanner;

public class PersegiPanjangDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang08[] arrayOfPersegiPanjang08 = new PersegiPanjang08[3];

        arrayOfPersegiPanjang08[0] = new PersegiPanjang08();
        arrayOfPersegiPanjang08[0].panjang = 110;
        arrayOfPersegiPanjang08[0].lebar = 30;

        arrayOfPersegiPanjang08[1] = new PersegiPanjang08();
        arrayOfPersegiPanjang08[1].panjang = 80;
        arrayOfPersegiPanjang08[1].lebar = 30;

        arrayOfPersegiPanjang08[2] = new PersegiPanjang08();
        arrayOfPersegiPanjang08[2].panjang = 100;
        arrayOfPersegiPanjang08[2].lebar = 20;

        System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang08[0].panjang + ", lebar: " + arrayOfPersegiPanjang08[0].lebar);
        
        System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang08[1].panjang + ", lebar: " + arrayOfPersegiPanjang08[1].lebar);
        
        System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang08[2].panjang + ", lebar: " + arrayOfPersegiPanjang08[2].lebar);
    }
}
