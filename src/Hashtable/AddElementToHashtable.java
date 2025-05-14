package Hashtable;

import java.util.Hashtable;

public class AddElementToHashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable1 = new Hashtable<>();
        hashtable1.put(1,"One");
        hashtable1.put(2,"Two");
        hashtable1.put(3,"Three");

        Hashtable<Integer,String> hashtable2 = new Hashtable<>();
        hashtable2.put(4,"Four");
        hashtable2.put(5,"Five");
        hashtable2.put(6,"Six");

        System.out.println("Mapping of HashTable 1: "+hashtable1);
        System.out.println("Mapping of HashTable 2: "+hashtable2);

        Hashtable<String,Integer> hashtable3 = new Hashtable<>();
        hashtable3.put("Vishal",10);
        hashtable3.put("Sachin",30);
        hashtable3.put("Anu",20);

        System.out.println("Size of map is: "+hashtable3.size());
        System.out.println("Mapping of HashTable 3: "+hashtable3);

        if (hashtable3.containsKey("Vishal")){
            int a = hashtable3.get("Vishal");
            System.out.println("Value of key Vishal is: "+a);
        }


    }
}
