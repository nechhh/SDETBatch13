package class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaPDemoIterator {
    public static void main(String[] args) {
        HashMap<String,Double> fruits=new HashMap<>();
        fruits.put("Apple",2000.0);
        fruits.put("Orange",5.5);
        fruits.put("Kiwi",3.5);
        fruits.put("Banana",3.5);
        fruits.put("Apple",10.5);

        Iterator<Map.Entry<String,Double>>iterator=fruits.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getKey().contains("e")){
                iterator.remove();
            }

        }
        System.out.println(fruits);
    }
}
