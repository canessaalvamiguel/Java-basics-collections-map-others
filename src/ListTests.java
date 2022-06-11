import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTests {
    public static void main(String[] args) {
        /**
        https://www.youtube.com/watch?v=5dscMs2hnDI
        https://www.geeksforgeeks.org/arraylist-vs-linkedlist-java/
        https://beginnersbook.com/2013/12/difference-between-arraylist-and-linkedlist-in-java/

        ArrayList
        - This class uses a dynamic array to store the elements in it.
        - Manipulating ArrayList takes more time due to the internal implementation.
          Whenever we remove an element, internally, the array is traversed and the memory bits are shifted.
        - This class implements a List interface. Therefore, this acts as a list.
        - This class works better when the application demands storing the data and accessing it.

        LinkedList
        - This class uses a doubly linked list to store the elements in it.
        - Manipulating LinkedList takes less time compared to ArrayList because, in a doubly-linked list,
          there is no concept of shifting the memory bits.
          The list is traversed and the reference link is changed.
        - This class implements both the List interface and the Deque interface.
          Therefore, it can act as a list and a deque.
        - This class works better when the application demands manipulation of the stored data.

        When to use LinkedList and when to use ArrayList?
        1) As explained above the insert and remove operations give good performance (O(1)) in LinkedList
           compared to ArrayList(O(n)).
           Hence if there is a requirement of frequent addition and deletion in application
           then LinkedList is a best choice.

        2) Search (get method) operations are fast in Arraylist (O(1)) but not in LinkedList (O(n)) so
           If there are less add and remove operations and more search operations requirement,
           ArrayList would be your best bet.
        * */

        System.out.println("ArrayList");
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("\n");

        System.out.println("LinkedList");
        List<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println(list);
        System.out.println(list1);
    }
}
