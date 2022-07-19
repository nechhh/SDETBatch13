package class29;

import java.util.Collection;
import java.util.HashMap;

public class MapDemo6 {
    public static void main(String[] args) {
                                     //how can we remove the elements from a map bases on the values
        HashMap<String,Double> fruits=new HashMap<>();
        fruits.put("Apple",2000.0);
        fruits.put("Orange",5.5);
        fruits.put("Kiwi",3.5);
        fruits.put("Banana",3.5);
        fruits.put("Apple",10.5);
        Collection<Double> values=fruits.values();
        values.removeIf(value-> value>10.2);                                  //{Kiwi=3.5, Orange=5.5, Banana=3.5}
        System.out.println(fruits);
    }
}
