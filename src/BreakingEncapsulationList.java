import java.util.ArrayList;
import java.util.List;

/**
 * https://stackoverflow.com/questions/48346063/how-does-returning-an-arraylist-break-encapsulation
 */

public class BreakingEncapsulationList {
    public static void main(String[] args) {

        CountryBreakingEncapsulation countryBreakingEncepsulation = new CountryBreakingEncapsulation();
        //Adding a citi to the class field while broken encapsulation
        countryBreakingEncepsulation.getCities().add("Fake Citi - broken encapsulation");

        System.out.println("Printing list with broken encapsulation. An attacker was able to insert a fake city in the original list");
        for (String city :  countryBreakingEncepsulation.getCities()){
            System.out.println(city);
        }

        System.out.println("\n");

        CountryNoBreakingEncapsulation countryNoBreakingEncapsulation = new CountryNoBreakingEncapsulation();
        //Adding a citi but not able to add a city to the class field due to get method is returning a clone
        countryNoBreakingEncapsulation.getCities().add("Fake Citi - NO broken encapsulation");

        for (String city :  countryNoBreakingEncapsulation.getCities()){
            System.out.println(city);
        }
    }
}

class CountryBreakingEncapsulation {
    List<String> cities = new ArrayList<>();

    CountryBreakingEncapsulation(){
        cities.add("Paris");
        cities.add("Madrid");
    }

    public List<String> getCities() {
        //Encapsulation is broken as we are returning a reference to the field class
        return cities;
    }
}

class CountryNoBreakingEncapsulation{

    CountryNoBreakingEncapsulation(){
        cities.add("Paris");
        cities.add("Madrid");
    }

    List<String> cities = new ArrayList<>();

    public List<String> getCities() {
        //Always returning a clone (using copy constructor) to avoid broken encapsulation
        return new ArrayList<>(cities);
    }
}