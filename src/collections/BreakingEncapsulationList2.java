package collections;

import java.util.ArrayList;
import java.util.List;

public class BreakingEncapsulationList2 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("Madrid");
        cities.add("Barcelona");

        CountryBreakingEncapsulation2 countryBreakingEncapsulation2 = new CountryBreakingEncapsulation2(cities);
        CountryNoBreakingEncapsulation2 countryNoBreakingEncapsulation2 = new CountryNoBreakingEncapsulation2(cities);

        cities.add("Fake citi - inserted");

        System.out.println("Printing list with broken encapsulation. An attacker was able to insert a fake city in the original list");
        for (String city :  countryBreakingEncapsulation2.getCities()){
            System.out.println(city);
        }

        System.out.println("\n");

        System.out.println("Printing list with broken encapsulation. An attacker was able to insert a fake city in the original list");
        for (String city :  countryNoBreakingEncapsulation2.getCities()){
            System.out.println(city);
        }
    }
}

class CountryBreakingEncapsulation2 {
    List<String> cities;

    CountryBreakingEncapsulation2(List<String> cities){
        //Encapsulation is broken as we are receiving and assigned the reference and not the values
        this.cities = cities;
    }

    public List<String> getCities() {
        return new ArrayList<>(cities);
    }
}

class CountryNoBreakingEncapsulation2{
    List<String> cities;

    CountryNoBreakingEncapsulation2(List<String> cities){
        //Encapsulation is not broken as we are cloning the values
        this.cities = new ArrayList<>(cities);
    }

    public List<String> getCities() {
        return new ArrayList<>(cities);
    }
}
