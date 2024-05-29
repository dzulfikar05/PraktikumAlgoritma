public class PersegiPanjang08 {
    public int panjang;
    public int lebar;

    public PersegiPanjang08(int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    public PersegiPanjang08()
    {

    }
    public void cetakInfo(PersegiPanjang08[] arrayOfPersegiPanjang08)
    {
        for (int i = 0; i < arrayOfPersegiPanjang08.length ; i++) {
            int luas = hitungLuas(arrayOfPersegiPanjang08[i].panjang, arrayOfPersegiPanjang08[i].lebar);
            int keliling = hitungKeliling(arrayOfPersegiPanjang08[i].panjang, arrayOfPersegiPanjang08[i].lebar);
            System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: "
            + arrayOfPersegiPanjang08[i].panjang + ", lebar: " + arrayOfPersegiPanjang08[i]. lebar+", luas: "+ luas+ ", keliling: "+keliling );
        }
    }

    public int hitungLuas(int p, int l)
    {
        int luas = 0;
        luas = p * l;
        return luas;
    }
    public int hitungKeliling(int p, int l)
    {
        int keliling = 0;
        keliling = 2*(p+l);
        return keliling;
    }
}
