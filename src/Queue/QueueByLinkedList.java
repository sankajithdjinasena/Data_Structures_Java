package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueByLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
//        Add Elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

//        print the queue
        System.out.println("Queue: "+queue);

//        Remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed Element: "+ front);

//        Print the updated queue
        System.out.println("Queue after removal: "+queue);

//        Add another element to the queue
        queue.add("date");

//        peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked Element: "+peeked);

//        Print the updated queue
        System.out.println("Queue after peek: "+queue);
    }
}
