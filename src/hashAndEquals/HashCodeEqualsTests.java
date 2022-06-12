package hashAndEquals;

import java.util.Objects;
/**
 * https://www.arquitecturajava.com/entiendo-los-metodos-de-java-equals-y-hashcode/
 * https://www.youtube.com/watch?v=6JoXp1e8jAQ&ab_channel=YourITClass
 * https://www.youtube.com/watch?v=0EB-SS-Ac4k&ab_channel=Roelcode
 * https://www.youtube.com/watch?v=CpVALR9HeTE&ab_channel=WebEncyclopTutorials
 * https://www.youtube.com/watch?v=Nr56SlbMed4&ab_channel=SeleniumExpress
 * https://srvaroa.github.io/jvm/java/openjdk/biased-locking/2017/01/30/hashCode.html <-- must read
 * */

public class HashCodeEqualsTests {
    public static void main(String[] args) {
        Person p1 = new Person("Miguel", "Canessa");
        Person p2 = new Person("Miguel", "Alva");

        System.out.println("Comparing using equals");
        System.out.println("Are the same? "+p1.equals(p2));
        System.out.println("\n");

        System.out.println("Comparing using hashcode");
        System.out.println("Are the same? "+(p1.hashCode() == p2.hashCode()));

        Object o1 = new Object();
        Object o2 = o1;
        Object o3 = new Object();

        System.out.println("o1 hash code: "+o1.hashCode());
        System.out.println("o2 hash code: "+o2.hashCode());
        System.out.println("o3 hash code: "+o3.hashCode());
    }
}

class Person{
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public Person(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
