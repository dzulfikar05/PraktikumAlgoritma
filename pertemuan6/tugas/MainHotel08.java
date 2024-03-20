package tugas;


public class MainHotel08 {
     public static void main(String[] args) {
        HotelService08 list = new HotelService08();
        Hotel08 m1 = new Hotel08("RedDors", "Malang", 25000, (byte)5);
        Hotel08 m5 = new Hotel08("WhiteDors", "Batu", 26000, (byte)3);
        Hotel08 m2 = new Hotel08("BlakDors", "Surabaya", 19000, (byte)4);
        Hotel08 m3 = new Hotel08("BlueDors", "Kediri", 20000, (byte)1);
        Hotel08 m4 = new Hotel08("GreyDors", "Malang", 22000, (byte)2);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data hotel = ");
        list.tampilAll();

        System.out.println("Data hotel dengan filter harga termurah = ");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Data hotel dengan filter bintang tertinggi");
        list.selectionSort();
        list. tampilAll();

    }
}
