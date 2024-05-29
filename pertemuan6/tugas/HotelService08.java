package tugas;

public class HotelService08 {
    Hotel08 rooms[] = new Hotel08[5];
    int idx;

    void tambah(Hotel08 h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        for (Hotel08 h : rooms) {
            h.tampil();
            System.out.println("---------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i - 1; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel08 tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMax].bintang) {
                    idxMax = j;
                }
            }

            Hotel08 tmp = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = tmp;
        }
    }

}
