package Hashtable;

import java.util.Hashtable;

public class ChangeElement {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"Welcome");
        hashtable.put(2,"for");
        hashtable.put(3,"Java");

        System.out.println("Initial Map: "+hashtable);

        hashtable.put(2,"to");

        System.out.println("Updated Map: "+hashtable);
    }
}
