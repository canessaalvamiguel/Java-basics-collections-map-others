package inmutableClass;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.youtube.com/watch?v=TXV0_JhP8pY&ab_channel=WebEncyclopTutorials
 *
 * - No setter
 * - No using the references passed by constructor
 * - No returning references in the getter
 * - Using final for instance variable
 */

public class ImmutableClassSample {
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("football");
        hobbies.add("poker");
        hobbies.add("programming");

        Integer id = 1;
        String name = "miguel";

        Student student = new Student(id, name, hobbies);

        //Tryng to break
        hobbies.add("fake - fake");
        //student.getName() = "fake fake";
        //student.getId() = 3;

        System.out.println(student);
    }
}

class Student{
    private final Integer id;
    private final String name;
    private final List<String> hobbies;

    public Student(Integer id, String name, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.hobbies = new ArrayList<>(hobbies);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(this.hobbies);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
