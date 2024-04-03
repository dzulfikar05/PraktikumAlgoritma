import java.util.Stack;

public class StackDemo08 {
    public static void main(String[] args) {
        Stack08 stack = new Stack08(10);
        stack.push(8);
        stack.push(12);
        stack.push(18);
        stack.print();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(-5);
        stack.print();
    }
}
