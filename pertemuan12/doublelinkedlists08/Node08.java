package doublelinkedlists08;

// import org.w3c.dom.Node;

public class Node08 {
    int  data;
    Node08 prev, next;

    Node08(Node08 prev, int data, Node08 next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
