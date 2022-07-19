package class26;

import java.util.ArrayList;

public class ArrayListAlexLee {
    public static void main(String[] args) {
        String[] fruits= new String[3];
        fruits[0]="Mango";
        fruits[1]="apple";
        fruits[2]="Strawberry";
        System.out.println(fruits[1]);

        ArrayList fruitList =new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("waterMelon");

        fruitList.remove(2);
        fruitList.remove("Mango");
        System.out.println(fruitList.contains("waterMelon"));
        System.out.println(fruitList);


    }

}
