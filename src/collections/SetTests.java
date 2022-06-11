package collections;

import java.util.*;

public class SetTests {
    public static void main(String[] args) {
        /**
         * https://jenkov.com/tutorials/java-collections/set.html
         * https://www.geeksforgeeks.org/set-in-java/
         *
         * Set has no guaranteed internal order
         * Set doesn't allow duplicated values
         *
         * - HashSet is backed by a HashMap. It makes no guarantees about the sequence
         *   of the elements when you iterate them.
         *
         * - LinkedHashSet differs from HashSet by guaranteeing that the order of the elements
         *   during iteration is the same as the order they were inserted
         *
         * - TreeSet also guarantees the order of the elements when iterated. This order is determined
         *   either by their natural order (if they implement Comparable), or by a specific Comparator implementation.
         *
         *   NO PERMITE VALORES DUPLICADOS
         *
         *   <<<Set doesn't provide a get method, "You have no other option but to use the iterator">>>
         *
         * */
        Set<String> hash_Set = new HashSet<>();

        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        System.out.println("HashSet");
        System.out.println(hash_Set);
        System.out.println("\n");

        Set<String> lh = new LinkedHashSet<>();

        lh.add("India");
        lh.add("Australia");
        lh.add("South Africa");
        lh.add("India");

        System.out.println("LinkedHashSet");
        System.out.println(lh);
        System.out.println("\n");

        Set<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        ts.add("India");

        System.out.println("TreeSet");
        System.out.println(ts);

        System.out.println("\n");

        System.out.println("Using Iterator");

        //iterate
        Set<String> names = hash_Set;
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

    }
}
