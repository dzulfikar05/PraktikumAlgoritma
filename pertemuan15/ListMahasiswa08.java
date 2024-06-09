import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ListMahasiswa08 {
    List<Mahasiswa08> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa08... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    
    public void hapus(int index) {
        mahasiswas.remove(index);
    }
    
    public void update(int index, Mahasiswa08 mhs) {
        mahasiswas.set(index, mhs);
    }
    
    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for(int i=0; i< mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    int binarySearch(String nim) {
        int low = 0;
        int high = mahasiswas.size() - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
            Mahasiswa08 mhs = mahasiswas.get(mid);
    
            if (mhs.nim.equals(nim)) {
                return mid;
            } else if (mhs.nim.compareTo(nim) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    
        return -1;
    }

     public void sortByNimAsc() {
        Collections.sort(mahasiswas, (mhs1, mhs2) -> mhs1.nim.compareTo(mhs2.nim));
    }

    public void sortByNimDesc() {
        Collections.sort(mahasiswas, (mhs1, mhs2) -> mhs2.nim.compareTo(mhs1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa08 lm = new ListMahasiswa08();
        Mahasiswa08 m = new Mahasiswa08("201234", "Noureen", "021xx1");
        Mahasiswa08 m1 = new Mahasiswa08("201235", "Akhleena", "021xx2");
        Mahasiswa08 m2 = new Mahasiswa08("201236", "Shannun", "021xx3");

        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);

        // enanpilkan list mahasiswa
        lm.tampil();

        // Update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa08("201235","Aknhleena Lela", "021xx2"));
        System.out.println("");

        lm.tampil();
        lm.sortByNimDesc();
        lm.tampil();

        
    }

    
}
