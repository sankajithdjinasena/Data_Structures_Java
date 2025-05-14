import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        // Create a LinkedList to store fruits
        LinkedList<String> l_list = new LinkedList<>();

        // Add fruits to the list
        l_list.add("A");
        l_list.add("B");
        l_list.add("C");
        l_list.add("D");
        l_list.add("E");
        l_list.add("F");
        l_list.add("G");


//       l_list.removeFirst();
//       l_list.removeLast();
/*
       // Create an iterator to traverse the list
       Iterator<String> iterator = l_list.iterator();

       // Iterate through the list and print each fruit
       while (iterator.hasNext()) {
           String llist = iterator.next();
           System.out.println(llist);
        }

 */

        /*
        boolean chk_value =l_list.contains("G");
//        Print the result of contains method
        if (chk_value){
            System.out.println("List contains the element 'G'");
        }
        else {
            System.out.println("List doesn't contain the element 'G'");
        }

         */
//                int size= l_list.size();
//                System.out.println("Size of Linked List: "+size);


        Object element = l_list.get(3);
        System.out.println("Element returned by get(): "+element);

        l_list.set(3,"J");
        System.out.println("Linked list after change" +l_list);


    }
}
