package tugas2;

// import org.w3c.dom.Node;

public class Node08 {
    Film08  data;
    Node08 prev, next;

    Node08(Node08 prev, Film08 data, Node08 next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
