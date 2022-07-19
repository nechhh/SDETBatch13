package class28;

import java.util.ArrayList;

public class HW3 {
    /*
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("aplee juise");
        drinks.add("Dragon drink");
        drinks.add("Milk");
        drinks.add("Americano");
        drinks.add("whisky");
        drinks.add("Tea");
        drinks.add("coffee");

        for(int i=0; i<drinks.size(); i++){
            if (drinks.get(i).contains("a") ||drinks.get(i).contains("e") ){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);


    }
}
