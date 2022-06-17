package abstractClasses;

/***
 * https://www.youtube.com/watch?v=HvPlEJ3LHgE
 *  Abstract Classes:
 *  - You can't instance abstract classes, you can't create objects from them
 *  - You can have abstract methods and no abstract methods
 *
 *
 *  Interfaces advantage: you can implement a lot of interfaces
 *  Interfaces disadvantage: all instance fields are static
 *
 *  Abstract class disadvantage: you can only extend one class on abstract class
 *  Abstract class advantage: all instance fields are not static
 *
 *  YOU MIGHT WANT TO CREATE AN ABSTRACT CLASS IF YOU HAVE A LOT OF RELATED CLASSES
 *  THAT  YOU WANT TO HAVE THE SAME FUNCTIONALITY AND THE SAME TYPE OF FIELDS AVAILABLE.
 *  AND YOU MIGHT WANT TO CREATE An INTERFACE IF YOU HAVE A LOT OF UNRELATED CLASSES
 *  THAT YOU WANT TO BE ABLE TO DO A CERTAIN THING
 *
 */
public class AbstractClassesTests {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeNoise();
        myCat.poop();
        myCat.weirdSound();
    }
}

abstract class Animal{
    int age;
    String name;

    public abstract void makeNoise();

    public void printName(){
        System.out.println("My name is "+name);
    }
}

interface AnimalStuff{
    String identifier = "x012";//This is static and final variable by definition
    public void poop();
}

interface AnimalWalkingSound{
    public void weirdSound();
}

class Cat extends Animal implements AnimalStuff, AnimalWalkingSound{

    @Override
    public void makeNoise() {
        System.out.println("meow");
    }

    @Override
    public void poop() {
        System.out.println("poop");
    }

    @Override
    public void weirdSound() {
        System.out.println("seuseusue");
    }
}
