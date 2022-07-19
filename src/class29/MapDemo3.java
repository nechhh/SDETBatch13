package class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> fruits=new HashMap<>();
        fruits.put("Apple",2000.0);
        fruits.put("Orange",5.5);
        fruits.put("Kiwi",3.5);
        fruits.put("Banana",3.5);
        fruits.put("Apple",10.5);

        Set<String> keys=fruits.keySet();                              //key =Apple
        for (String key:keys){                                         //key =Kiwi
            System.out.println("key ="+key);                           //key =Orange
        }                                                              //key =Banana

        Collection<Double> values =  fruits.values();                   // value =10.5
        for (Double value:values){                                     // value =3.5
            System.out.println("value ="+value);                       // value =5.5
        }                                                              // value =3.5
    }
}
