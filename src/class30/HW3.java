package class30;

import java.util.HashMap;
import java.util.Map;

public class HW3 {
    /*Create a map of Best Buy store. Place
     item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
     Retrieve all keys and values from a Best Buy map using EntrySet.
    */
    public static void main(String[] args) {
        HashMap<Integer,String> bestbuy=new HashMap<>();
        bestbuy.put(32323,"Apple mac book pro m1");
        bestbuy.put(234453,"Iphone 13 pro ");
        bestbuy.put(65523,"ipad");
        bestbuy.put(76523,"TV");
        bestbuy.put(45723,"Refrigerator");

        bestbuy.entrySet();
        for (Map.Entry<Integer,String> entry: bestbuy.entrySet()){
            //System.out.println(" item ID = "+entry.getKey()+", item name = "+entry.getValue());
            System.out.println(entry);
        }
    }
  }
