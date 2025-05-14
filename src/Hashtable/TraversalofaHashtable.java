package Hashtable;

import java.util.Hashtable;
import java.util.Map;

public class TraversalofaHashtable {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable1 = new Hashtable<>();
        hashtable1.put("Vishal",10);
        hashtable1.put("Sachin",30);
        hashtable1.put("Anu",20);

        for (Map.Entry<String, Integer> e : hashtable1.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
