package class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapHW2 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {
        TreeMap<String,String> country=new TreeMap<>();
        country.put("USA","Washington D.C.");
        country.put("Turkiye","Ankara");
        country.put("Spain","Madrid");
        country.put("France","Paris");
        country.put("England","London");
        //hot to get keys and values from a Map in same time

        //country.entrySet()  --> this is a set of Entry object
        //and Entry object (in is an interface) has a method get key to get the key and another method to get the value
        for (Map.Entry<String,String> entry: country.entrySet()){
            System.out.println("entry key = "+entry.getKey()+", entry key = "+entry.getValue());

        }
         Iterator<Map.Entry<String,String>> iterator=country.entrySet().iterator();    //when we have entrySet() method we can get iterator from it
        while (iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
           // System.out.println("entry.getKey()+\"value\" = " + entry.getKey()+" value" +entry.getValue());
            System.out.println(entry);
        }

    }
}
