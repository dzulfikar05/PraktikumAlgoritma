package LinkedList;

public class LinkedList08 {

    Node08 head;

    public LinkedList08() {
        head = null;
    }

    public void add(RestaurantLL08 data) {
        Node08 newNode = new Node08(data);
        if (head == null) {
            head = newNode;
        } else {
            Node08 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public RestaurantLL08 get(String idItem) {
        Node08 current = head;
        while (current != null) {
            if (current.data.idItem.equals(idItem)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void printAll() {
        Node08 current = head;
        System.out.println("---------------------------------------------------");
        System.out.printf("| %-7s| %-20s | %-15s |", "ID", "Nama Makanan", "Harga");
        System.out.println("\n---------------------------------------------------");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void delete(String idItem) {
        if (head == null) {
            return;
        }

        if (head.data.idItem.equals(idItem)) {
            head = head.next;
            return;
        }

        Node08 current = head;
        while (current.next != null && !current.next.data.idItem.equals(idItem)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void sortDesc() {
        if (head == null || head.next == null) {
            return;
        }

        Node08 current = head;
        while (current != null) {
            Node08 maxNode = current;
            Node08 next = current.next;

            while (next != null) {
                if (next.data.harga > maxNode.data.harga) {
                    maxNode = next;
                }
                next = next.next;
            }

            if (maxNode != current) {
                double tempHarga = current.data.harga;
                String tempIdItem = current.data.idItem;
                String tempNamaMakanan = current.data.namaItem;

                current.data.harga = maxNode.data.harga;
                current.data.idItem = maxNode.data.idItem;
                current.data.namaItem = maxNode.data.namaItem;

                maxNode.data.harga = tempHarga;
                maxNode.data.idItem = tempIdItem;
                maxNode.data.namaItem = tempNamaMakanan;
            }

            current = current.next;
        }
        printAll();
    }
}
