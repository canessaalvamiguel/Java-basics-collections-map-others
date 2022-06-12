package passingParametersByValue;

import java.util.ArrayList;
import java.util.List;

public class passingByValue {
    /**
     * https://www.infoworld.com/article/3512039/does-java-pass-by-reference-or-pass-by-value.html
    * */
    public static void main(String[] args) {

        //Are primitive types passed by value? Yes
        //The primitive types won't change inside changeHomerAge method <--------------
        int homerAge = 30;
        changeHomerAge(homerAge);
        System.out.println(homerAge);

        //Passing immutable object references
        //Integer, Double, Float, Long, Boolean, BigDecimal, String
        //immutable object won't change inside changeToHomer2 method <--------------
        String name = "Empty";
        changeToHomer2(name);
        System.out.println(name);

        //Passing custom immutable object reference
        //ImmutableClassSample
        //custom immutable object won't change inside changeToHomer3 method <--------------
        List<String> hobbies = new ArrayList<>();
        hobbies.add("football");
        hobbies.add("poker");
        hobbies.add("programming");
        ImmutableStudent immutableClassSample = new ImmutableStudent(1, "miguel", hobbies);
        changeToHomer3(immutableClassSample);
        System.out.println(immutableClassSample);

        //Passing mutable object references
        //mutable objects may change inside addSureName method <--------------
        StringBuilder name2 = new StringBuilder("Homer");
        addSureName(name2);
        System.out.println(name2);

    }

    private static void changeToHomer3(ImmutableStudent immutableClassSample) {
        System.out.println("from inside method changeToHomer3: before assignment: "+immutableClassSample);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("fake - football");
        hobbies.add("fake - poker");
        hobbies.add("fake - programming");
        immutableClassSample = new ImmutableStudent(1, "homer", hobbies);
        System.out.println("from inside method changeToHomer3: after assignment: "+immutableClassSample);
    }

    static void changeHomerAge(int homerAge) {
        homerAge = 35;
    }

    static void changeToHomer2(String name) {
        name = "Homer";
    }

    static void addSureName(StringBuilder name) {
        name.append("Simpson");
    }
}

class ImmutableStudent{
    private final Integer id;
    private final String name;
    private final List<String> hobbies;

    public ImmutableStudent(Integer id, String name, List<String> hobbies) {
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
