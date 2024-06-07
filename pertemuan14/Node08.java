public class Node08 {
    int data;
    Node08 prev, next;
    int jarak;
    
    Node08(){}
    Node08 (Node08 prev, int data, int jarak, Node08 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this. jarak = jarak;
    }
}