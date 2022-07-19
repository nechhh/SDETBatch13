package class29;

import java.util.Iterator;
import java.util.TreeSet;

public class HWRetrieveElementFromSet {
    /*
    * Create a Set collection in which you need to add names of the countries.
    * In this set we want all objects to be sorted in alphabetical order.
    *  Using 2 different ways retrieve all elements from set.*/
    public static void main(String[] args) {
        //Set using TreeSet
        TreeSet<String> countries=new TreeSet<>();
        countries.add("Turkey");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Italy");
        countries.add("United Kingdom");

        System.out.println("1 way to print values by enhanced for loop******* ");
        for (String country:countries){
            System.out.println(country);
        }
         ///
        System.out.println("2.Way of retrieving sorted elements from the set ");
        Iterator<String> iterator=countries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

