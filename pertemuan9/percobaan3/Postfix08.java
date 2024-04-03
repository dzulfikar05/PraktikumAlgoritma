package percobaan3;

public class Postfix08 {
    int n, top;
    char[] stack;

    public Postfix08(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push(' (');
    }
}
