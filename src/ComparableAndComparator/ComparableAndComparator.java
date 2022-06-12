package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://www.youtube.com/watch?v=oAp4GYprVHM&ab_channel=Telusko
 * https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
 * */

public class ComparableAndComparator {
    public static void main(String[] args) {

        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16, 1200.0));
        laps.add(new Laptop("Apple", 8, 1500.0));
        laps.add(new Laptop("Hp", 12, 1000.0));

        //sorting using interface Comparable
        Collections.sort(laps);

        System.out.println("Sorting using interface Comparable in class Laptop by ram");
        for (Laptop l : laps){
            System.out.println(l);
        }

        System.out.println("\n");

        //sorting using interface Comparator (this is a functional interface)
        Comparator<Laptop> comparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop l1, Laptop l2) {
               if( l1.getPrice() > l2.getPrice() )
                   return 1;
               else
                   return -1;
            }
        };

        Collections.sort(laps, comparator);

        System.out.println("Sorting using interface Comparator by price");
        for (Laptop l : laps){
            System.out.println(l);
        }

        System.out.println("\n");

        //sorting using interface Comparator lambda form
        Comparator<Laptop> comparator2Lambda = (Laptop l1, Laptop l2) -> (int) (l1.getPrice() - l2.getPrice());

        Collections.sort(laps, comparator2Lambda);

        System.out.println("Sorting using interface Comparator by price using lambda");
        for (Laptop l : laps){
            System.out.println(l);
        }
    }
}

class Laptop implements Comparable{
    String brand;
    Integer ram;
    Double price;

    public Laptop(String brand, Integer ram, Double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        Laptop lap2 = (Laptop) o;

        //this > lap2  = +
        //this < lap2  = -
        //this == lap2 = 0

        if(this.getRam() > lap2.getRam())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
