package LinkedList;

public class RestaurantLL08 {
    String idItem;
    String namaItem;
    double harga;

    public RestaurantLL08() {
    }

    public RestaurantLL08(String idItem, String namaItem, double harga) {
        this.idItem = idItem;
        this.namaItem = namaItem;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return String.format("| %-7s | %-20s | Rp. %-10s", idItem, namaItem, harga);
    }
}
