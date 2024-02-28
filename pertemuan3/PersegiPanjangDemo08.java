import java.util.Scanner;

public class PersegiPanjangDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.print("Masukkan berapa banyak anda ingin menghitung : ");
        length = sc.nextInt();

        PersegiPanjang08[] arrayOfPersegiPanjang08 = new PersegiPanjang08[length];
        int panjang, lebar;

        for (int i = 0; i < arrayOfPersegiPanjang08.length; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang08[i] = new PersegiPanjang08(panjang, lebar);
            
        }
        PersegiPanjang08 persegiPanjang08 = new PersegiPanjang08();
        persegiPanjang08.cetakInfo(arrayOfPersegiPanjang08);
        
    }
}
