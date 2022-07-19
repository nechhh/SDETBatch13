package class29;

import java.util.HashMap;
import java.util.HashSet;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> fruits=new HashMap<>();
        fruits.put("Apple",2000.0);
        fruits.put("Orange",5.5);
        fruits.put("Kiwi",3.5);
        fruits.put("Banana",3.5);
        fruits.put("Apple",10.5);                           //it will override the value

        System.out.println(fruits);
        System.out.println(fruits.get("Kiwi"));
        System.out.println(fruits.remove("Orange"));
        System.out.println(fruits);
        System.out.println(fruits.containsKey("Kiwi"));
        System.out.println(fruits.containsValue(10.5));
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.replace("Kiwi",7.6));
        System.out.println(fruits);
        fruits.put("null",null);                   //it will execute but  ThreeMap does Not allow
        System.out.println(fruits);
    }
}
