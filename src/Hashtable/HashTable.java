package Hashtable;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("One",1);
        hashtable.put("Two",2);
        hashtable.put("Three",3);

        System.out.println(hashtable);
    }
}