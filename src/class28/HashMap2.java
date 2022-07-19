package class28;

import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> groceries=new HashMap<>();
        groceries.put("Milk",2);
        groceries.put("Eggs",12);
        groceries.put("Fish",22);
        groceries.put("Beef",32);
        groceries.put("Apple",3);

        Set<String> key=groceries.keySet();
        for (String s:key){
            System.out.println(s);
        }

    }
}
