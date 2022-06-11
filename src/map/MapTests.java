package map;

import java.util.*;

public class MapTests {
    public static void main(String[] args) {
        /**
         * https://code-examples.net/es/q/2c1831
         * https://medium.com/javarevisited/internal-working-of-hashmap-in-java-97aeac3c7beb
         *
         * - HashMap no ofrece ninguna garantía sobre el orden de iteración.
         *   Puede (y lo hará) incluso cambiar completamente cuando se agreguen nuevos elementos.
         *
         * - TreeMap se repetirá de acuerdo con el "orden natural" de las teclas según su método compareTo ()
         *   (o un Comparador suministrado externamente). Además, implementa la interfaz SortedMap, que contiene
         *  métodos que dependen de este orden de clasificación.
         *
         * - LinkedHashMap se repetirá en el orden en que se colocaron las entradas en el mapa.
         *
         * NINGUNO PERMITE CLAVES DUPLICADAS*/

        Map<String,String> m1 = new HashMap<>();
        m1.put("map", "HashMap");
        m1.put("schildt", "java2");
        m1.put("mathew", "Hyden");
        m1.put("schildt", "java2s");
        System.out.println("HashMap");
        System.out.println(m1.keySet());
        System.out.println(m1.values());

        System.out.println("\n");

        System.out.println("TreeMap");
        SortedMap<String,String> sm = new TreeMap<>();
        sm.put("map", "TreeMap");
        sm.put("schildt", "java2");
        sm.put("mathew", "Hyden");
        sm.put("schildt", "java2s");
        System.out.println(sm.keySet());
        System.out.println(sm.values());

        System.out.println("\n");

        System.out.println("LinkedHashMap");
        LinkedHashMap<String,String> lm = new LinkedHashMap<>();
        lm.put("map", "LinkedHashMap");
        lm.put("schildt", "java2");
        lm.put("mathew", "Hyden");
        lm.put("schildt", "java2s");
        System.out.println(lm.keySet());
        System.out.println(lm.values());

        System.out.println("\n");

        System.out.println("Using keySet");

        // using keySet() for iteration over keys
        for (String name : lm.keySet())
            System.out.println("key: " + name);

        System.out.println("\n");
        System.out.println("Using values");

        // using values() for iteration over values
        for (String url : sm.values())
            System.out.println("value: " + url);

        /*
        *
╔══════════════╦═════════════════════╦═══════════════════╦═════════════════════╗
║   Property   ║       HashMap       ║      TreeMap      ║     LinkedHashMap   ║
╠══════════════╬═════════════════════╬═══════════════════╬═════════════════════╣
║ Iteration    ║  no guarantee order ║ sorted according  ║                     ║
║   Order      ║ will remain constant║ to the natural    ║    insertion-order  ║
║              ║      over time      ║    ordering       ║                     ║
╠══════════════╬═════════════════════╬═══════════════════╬═════════════════════╣
║  Get/put     ║                     ║                   ║                     ║
║   remove     ║         O(1)        ║      O(log(n))    ║         O(1)        ║
║ containsKey  ║                     ║                   ║                     ║
╠══════════════╬═════════════════════╬═══════════════════╬═════════════════════╣
║              ║                     ║   NavigableMap    ║                     ║
║  Interfaces  ║         Map         ║       Map         ║         Map         ║
║              ║                     ║    SortedMap      ║                     ║
╠══════════════╬═════════════════════╬═══════════════════╬═════════════════════╣
║              ║                     ║                   ║                     ║
║     Null     ║       allowed       ║    only values    ║       allowed       ║
║ values/keys  ║                     ║                   ║                     ║
╠══════════════╬═════════════════════╩═══════════════════╩═════════════════════╣
║              ║   Fail-fast behavior of an iterator cannot be guaranteed      ║
║   Fail-fast  ║ impossible to make any hard guarantees in the presence of     ║
║   behavior   ║           unsynchronized concurrent modification              ║
╠══════════════╬═════════════════════╦═══════════════════╦═════════════════════╣
║              ║                     ║                   ║                     ║
║Implementation║      buckets        ║   Red-Black Tree  ║    double-linked    ║
║              ║                     ║                   ║       buckets       ║
╠══════════════╬═════════════════════╩═══════════════════╩═════════════════════╣
║      Is      ║                                                               ║
║ synchronized ║              implementation is not synchronized               ║
╚══════════════╩═══════════════════════════════════════════════════════════════╝*/
    }
}
