package map;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTests {
    public static void main(String[] args) {
        /**
         * https://www.geeksforgeeks.org/concurrenthashmap-in-java/
         *
         * ConcurrentHashMap is an enhancement of HashMap as we know that while dealing with Threads
         * in our application HashMap is not a good choice because performance-wise HashMap is not up to the mark.
         *
         * - ConcurrentHashMap class is thread-safe
         *   i.e. multiple threads can operate on a single object without any complications.
         * - In ConcurrentHashMap, the Object is divided into a number of segments according to the concurrency level.
         * - Inserting null objects is not possible in ConcurrentHashMap as a key or value.
         */

        ConcurrentHashMap<Integer, String> chmap = new ConcurrentHashMap<>();

        chmap.put(100, "Hello 100");
        chmap.put(102, "Geeks 102");

        chmap.put(101, "Geeks 101");
        chmap.putIfAbsent(101, "Hello 101");
        chmap.remove(101, "Geeks 101");
        chmap.replace(101, "Hello 101", "For 101");

        chmap.putIfAbsent(103, "Hello 103");

        Iterator< ConcurrentHashMap.Entry<Integer, String> >  itr = chmap.entrySet().iterator();

        while (itr.hasNext()) {
            ConcurrentHashMap.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey()    + ", Value = " + entry.getValue());
        }

    }
}
