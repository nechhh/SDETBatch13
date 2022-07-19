package class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> fruit=new TreeMap<>();
        fruit.put("Apple",20);
        fruit.put("Water Melon",25);
        fruit.put("Peach",20);
        fruit.put("Banana",6);
        fruit.put("Strawberry",100);


        HashMap<String,Integer> cosmetic=new HashMap<>();
        cosmetic.put("foundation",20);
        cosmetic.put("lipstick",25);
        cosmetic.put("Mascara",20);
        cosmetic.put("Blush",6);


        LinkedHashMap<String,Integer> groceries=new LinkedHashMap<>();            //adding fruit and cosmetic inside the groceries
        groceries.putAll(fruit);
        groceries.putAll(cosmetic);
        System.out.println(groceries);

     }
}
