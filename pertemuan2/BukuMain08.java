public class BukuMain08 {
     public static void main(String[] args) {
        Buku bk1 = new Buku();
        bk1.judul = "Today Ends Tomorow Comes";        
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        Buku bk2 = new Buku("Self Reward", "Mahera Ayesi", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        
        Buku bukuDzulfikar = new Buku("Dzulfikar orang baik", "dzulfikar", 3, 50, 10000);
        bukuDzulfikar.tampilInformasi();
        int terjual = bukuDzulfikar.terjual(8);
        int hargaTotal = bukuDzulfikar.hitungHargaTotal(terjual);
        int diskon = bukuDzulfikar.hitungDiskon(hargaTotal);
        bukuDzulfikar.hitungHargaBayar(hargaTotal, diskon);
    }
     
}