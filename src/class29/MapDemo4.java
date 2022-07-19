package class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruits=new HashMap<>();
        fruits.put("Apple",2000.0);
        fruits.put("Orange",5.5);
        fruits.put("Kiwi",3.5);
        fruits.put("Banana",3.5);
        fruits.put("Apple",10.5);

        Set<Map.Entry<String,Double>>entries=fruits.entrySet();
        for (Map.Entry<String,Double>entry:entries){
            System.out.println("entry ="+entry);
        }

    }
}
