package map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableTests {
    public static void main(String[] args) {
        /**
        https://www.geeksforgeeks.org/hashtable-in-java/

        * The Hashtable class implements a hash table, which maps keys to values.
        * Hashtable doesn't allow any null key or value. (Error on runtime)
        * To successfully store and retrieve objects from a hashtable,
        * the objects used as keys must implement the hashCode method and
        * the equals method.
        *
        * Features of Hashtable
        * - It is similar to HashMap, but is synchronized.
        * - Hashtable stores key/value pair in hash table.
        * - In Hashtable we specify an object that is used as a key, and the value we want to associate to that key.
        *   The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
        * - The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
        * - HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.
        *
        * NO PERMITE CLAVES DUPLICADAS
        * HASHMAP is almost deprecated
        * */

        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht1.put(1, "one-duplicated");
        //ht1.put(4, null); // Error on runtine
        ht1.putIfAbsent(5, "five");
        System.out.println("Mappings of ht1 : " + ht1);

        System.out.println("\n");

        System.out.println("Using Enumeration");
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()) {
            // Getting the key of a particular entry
            int key = e.nextElement();

            // Print and display the Rank and Name
            System.out.println("Key : " + key + "\t\t Value : " + ht1.get(key));
        }

        System.out.println("\n");

        System.out.println("Using Set to iterate");
        Set<Integer> setOfKeys = ht1.keySet();

        // object using for-Each loop
        for (Integer key : setOfKeys) {
            // Print and display the Rank and Name
            System.out.println("Rank : " + key + "\t\t Name : "+ ht1.get(key));
        }

        System.out.println("\n");

        System.out.println("Using foreach");
        ht1.forEach( (key, value) -> System.out.println(key)  );
    }
}
