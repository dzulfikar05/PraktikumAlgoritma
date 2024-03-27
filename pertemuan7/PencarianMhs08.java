public class PencarianMhs08 {
    Mahasiswa08 listMHs[];
    int idx;
    public PencarianMhs08(int jumMhs) {
        listMHs = new Mahasiswa08[jumMhs]; 
    }

    void tambah(Mahasiswa08 m) {
        if (idx < listMHs.length) {
            listMHs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !! ");
        }
    }

    void tampil() {
        for (Mahasiswa08 m : listMHs) {
            m.tampil();
            System.out.println("-------------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMHs.length; j++) {
            if (listMHs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMHs[pos].nama);
            System.out.println("Umur\t : " + listMHs[pos].umur);
            System.out.println("IPK\t : " + listMHs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    public void TampilposisiNama(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilDataNama(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMHs[pos].nama);
            System.out.println("Umur\t : " + listMHs[pos].umur);
            System.out.println("IPK\t : " + listMHs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    // public int FindBinarySearch(int cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (left + right) / 2;
           
    //         if (listMHs[mid].nim < cari) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else if (listMHs[mid].nim > cari) {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         } else {
    //             return mid;
    //         }
    //     }

    //     return -1;
    // }

    public int FindBinarySearchByName(String cari, int left, int right, int count) {
        if (right >= left) {

            int mid = (left + right) / 2;
            int comparison = listMHs[mid].nama.compareTo(cari);

            if (comparison < 0) {
                return FindBinarySearchByName(cari, mid + 1, right, count);
            } else if (comparison > 0) {
                return FindBinarySearchByName(cari, left, mid - 1, count);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public void countSearchName(String cari)
    {
        int count = 0;
        for(int i=0; i<listMHs.length; i++){
            if(cari.equalsIgnoreCase(listMHs[i].nama)){
                count += 1;
            }
        }

        if (count > 1) {
            System.out.println("Data yang ditemukan lebih dari 1");
            return;
        }
    }
}
