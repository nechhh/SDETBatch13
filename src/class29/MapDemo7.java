package class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
                             //how can we remove the elements from a map bases on the keys and values
        HashMap<String,Double> fruits=new HashMap<>();
        fruits.put("Apple",2000.0);
        fruits.put("Orange",5.5);
        fruits.put("Kiwi",3.5);
        fruits.put("Banana",3.5);
        fruits.put("Apple",10.5);

        Set<Map.Entry <String,Double>> entries=fruits.entrySet();
        entries.removeIf(entry->entry.getKey().contains("e") && entry.getValue()>10.2);
        System.out.println(fruits);
    }
}
