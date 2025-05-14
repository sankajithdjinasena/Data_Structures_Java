import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Welcome");
        stack.push("To");
        stack.push("Programming");
        stack.push("Class");

        System.out.println("Initial Stack");

        System.out.println("The element at the top of the stack is: "+stack.peek());

        System.out.println("Final Stack: "+stack);
    }
}
