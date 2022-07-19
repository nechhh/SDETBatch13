package class29;

import java.util.LinkedHashSet;

public class HWRemoveCity {
    /*
    * Create a Set of cities in which you want to make sure that insertion order is maintained.
    *  Then remove any city that starts with “A”;*/
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("San Jose");
        cities.add("Alabama");
        cities.add("San Carlos");
        cities.add("Daily city");
        cities.add("Mountain view");

        System.out.println("LIst of cities");
        System.out.println(cities);


        //Remove cities that starts with "S"
        System.out.println("List of cities where insertion order is maintained  ");
        cities.removeIf(city->city.startsWith("S"));                                    //Iterator
        System.out.println(cities);



    }
}

