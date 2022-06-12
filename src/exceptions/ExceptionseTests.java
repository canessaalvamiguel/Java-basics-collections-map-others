package exceptions;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/
 * https://www.youtube.com/watch?v=pWG0zegf-8Q&ab_channel=WebEncyclopTutorials
 * https://www.youtube.com/watch?v=mc8xpzpWDkc&list=PL3hpmQhMoz-dMhvnkTunjOMZSa_f3FH24&index=4&ab_channel=WebEncyclopTutorials
 *
 * Checked Exceptions
 * These are the exceptions that are checked at compile time.
 *
 * Unchecked Exceptions
 * These are the exceptions that are not checked at compile time.
 *
 * Inheritance & Exception
 * If we are overriding method in parent class. And parent class method throws an Exception
 * Then the child class method can only throw:
 *  - No exception
 *  - Same Exception
 *  - Child of the parent method exception
 *  You cannot inherit more wealth than your parent have
 *
 *  When handling Checked Exceptions you need to use try-catch or THROW
 *  When handling Unchecked Exceptions you don't need to use try-catch or THROW
 */

public class ExceptionseTests {
    public static void main(String[] args) throws Exception/*only needed for Checked Exceptions*/ {

        //throw new Error();
        //throw new Exception();
        new RuntimeException();

        //Try with resource and AutoClosable
        try( FileInputStream fs = new FileInputStream(new File("c:/data.txt"))){

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}

//Creating a custom Checked Exception
class MyCustomCheckedException extends Exception{

}

//Creating a custom Non Checked Exception
class MyCustomNonCheckedException extends RuntimeException{

}

class Parent{
    public void m1() throws IOException{

    }
}

class Child1 extends Parent{
    @Override
    public void m1(){

    }
}

class Child2 extends Parent{
    @Override
    public void m1() throws IOException{

    }
}

class Child3 extends Parent{
    @Override
    public void m1() throws IIOException {

    }
}

class Child4 extends Parent{
    //NOT ALLOWED
//    @Override
//    public void m1() throws Exception {
//
//    }
}
