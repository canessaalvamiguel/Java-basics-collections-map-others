package JavaSynchronized;

/**
 * Reference: https://medium.com/@anil.java.story/you-dont-know-java-synchronized-keyword-612b176cc2d2
 *
 * Suppose thread t1 with the name Thread1 enters the syncronized block, it will print the
 * “Thread1 has entered the synchronized block”. It will then sleep for 5 seconds.
 * Meanwhile, Thread2 will wait in line commented as line 3. After Thread1 has exited,
 * Thread2 will enter the block and will print “Thread2 has entered the synchronized block”
 * and will sleep for 5 minutes and after that, the whole program will terminate.
 */
public class Synchronized2 {
    public static void main(String[] args) {
        Task task = new Task();
        Thread t1 = new Thread(task); // line 1
        Thread t2 = new Thread(task); // line 2
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}
