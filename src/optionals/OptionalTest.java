package optionals;

import java.util.Optional;

/***
 * https://www.youtube.com/watch?v=vKVzRbsMnTQ
 */

public class OptionalTest {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("Fred");

        int age = optionalCat.map(Cat::getAge)
                .orElse(0);
        System.out.println(age);

        int age1 = optionalCat.orElse(new Cat("UNKNOWN",0))
                .getAge();
        System.out.println(age1);

        Cat myCat = optionalCat.map( (x) -> new Cat(x.getName()+ "3", x.getAge() + 1))
                .orElse(new Cat("UNKNOWN",0));
        System.out.println(myCat);

        Cat myCat2 = optionalCat.orElseThrow(RuntimeException::new);
        System.out.println(myCat2);

    }

    private static Optional<Cat> findCatByName(String name){
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(null);
    }
}

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
