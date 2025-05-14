package Queue;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        System.out.println("First Node of queue: "+ queue.peek());

        queue.remove();
        queue.remove();

        System.out.println("After Deletion, First Node of queue: "+ queue.peek());


        Queue<String> queue1 = new ArrayDeque<>(); // Queue with capacity 5
        queue1.add("A");
        queue1.add("B");
        queue1.add("C");
        queue1.add("D");

        System.out.println("Front element: " + queue1.peek());

        queue1.remove();
        queue1.remove();

        System.out.println("After Deletion, First Node of queue: "+ queue1.peek());

    }
}
