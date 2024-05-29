package tugas1;

// import org.w3c.dom.Node;

public class Node08 {
    Faksinasi08  data;
    Node08 prev, next;

    Node08(Node08 prev, Faksinasi08 data, Node08 next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
