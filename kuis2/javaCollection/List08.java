import java.util.ArrayList;
import java.util.Collections;
public class List08 {

    private ArrayList<Restaurant08> menu;

    public List08() {
        menu = new ArrayList<>();
    }

    public void add(Restaurant08 item) {
        menu.add(item);
        System.out.println();
        System.out.println("Berhasil menambahkan menu.");
        System.out.println();
    }

    public Restaurant08 get(String itemId) {
        for (Restaurant08 item : menu) {
            if (item.idItem.equals(itemId)) {
                return item;
            }
        }
        return null;
    }

    public void printAll() {
        System.out.println("-------------------------------------------------------");
        System.out.printf("| %-7s| %-20s | %-15s |", "ID", "Nama Makanan", "Harga");
        System.out.println("\n-------------------------------------------------------");
        for (Restaurant08 product : menu) {
            System.out.println(product);
        }
    }

    public void sortDesc() {
        Collections.sort(menu, (p1, p2) -> Double.compare(p2.harga, p1.harga));
        printAll();
    }

    public void delete(String itemId) {
        menu.removeIf(item -> item.idItem.equals(itemId));
        System.out.println();
        System.out.println("Menu dengan ID " +itemId+"Sudah Dihapus.");
        System.out.println();
    }
}
