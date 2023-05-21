package JavaSynchronized;

/**
 * Reference: https://medium.com/@anil.java.story/you-dont-know-java-synchronized-keyword-612b176cc2d2
 *
 * Thread1 has entered the synchronized block. Immediately, Thread2 have entered the synchronized will be printed.
 * Both threads will wait simultaneously for 5 seconds and the program will terminate.
 */

public class Synchronized1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task()); // line 1
        Thread t2 = new Thread(new Task()); // line 2
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}

class Task implements Runnable{
    public void run(){
        synchronized (this) // line 3
        {
            System.out.println(Thread.currentThread().getName() + " have entered the synchronized block");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
