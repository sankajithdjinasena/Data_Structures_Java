import java.util.Stack;

public class StackDemo3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

//      Use add() method to add elements
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);

//      Displaying the stack
        System.out.println("Initial Stack: "+stack);

//      Removing elements using pop() method
        System.out.println("Popped element: "+stack.pop());
        System.out.println("Popped element: "+stack.pop());

//        Displaying the stack after pop operation
        System.out.println("Stack after pop operation: "+stack);
    }
}
