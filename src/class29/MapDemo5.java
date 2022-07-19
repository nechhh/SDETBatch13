package class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String,Double> fruits=new HashMap<>();
        fruits.put("Apple",2000.0);
        fruits.put("Orange",5.5);
        fruits.put("Kiwi",3.5);
        fruits.put("Banana",3.5);
        fruits.put("Apple",10.5);
         Collection<String> keys=fruits.keySet();

                                                 //Can't use because we are trying to change the size of Map not allowed
         /*for (String key:keys){
             if (key.contains("e")){
                 fruits.remove(key);
             }
         }*/

        keys.removeIf(key ->key.contains("e"));           // same result with below iterator and short way

        /*Iterator<String> iterator=keys.iterator();                          //remove everything contain "e"
        while (iterator.hasNext()){
            if (iterator.next().contains("e")){
                iterator.remove();
            }
        }*/


        System.out.println(fruits);

    }

}
