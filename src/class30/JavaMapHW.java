package class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class JavaMapHW {
    /*
    Create a map of a building. Store floor number and it is associated company name.
     (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
    */
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"google");
        building.put(2,"Syntax");
        building.put(5,"GoCell");
        building.put(2,"Town");
        building.put(6,"Syntax");
        building.put(4,"Oracle");
        building.put(7,"Amazon");

        System.out.println(building.size());      //size is 6 because of ignores duplicate
        System.out.println(building);
        building.replace(4, "Spaso");
        building.remove(7);                              //enter the key which you want to remove
        System.out.println(building);


    }
}
