package class28;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> groceries=new HashMap<>();
        groceries.put("Milk",2);
        groceries.put("Eggs",12);
        groceries.put("Fish",22);
        groceries.put("Beef",32);
        groceries.put("Apple",3);
        System.out.println(groceries.get("Milk"));
        System.out.println(groceries.get("Fish"));
    }
}
