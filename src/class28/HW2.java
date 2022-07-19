package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {
    /*
    * Create an arraylist of cars and retrieve all the values using 3 different ways.
    * */
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("porshe");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("BMW");

        for (String car:cars){                                             //best way to print things
            System.out.println(car);
        }
        System.out.println("***************************************");
        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("***************************************");
        System.out.println(cars);
        System.out.println("***************************************");

        Iterator<String> iterator=cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        System.out.println("***************************************");
        cars.forEach(System.out::println);                        //new and short way  //prefered


    }

}
