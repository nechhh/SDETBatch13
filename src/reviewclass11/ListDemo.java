package reviewclass11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Nacy");
        names.add("Sonia");
        names.add("Nico");
        names.add("Lan");
        for (String name:names){
            System.out.println(" Name = "+name);
        }
        Collections.sort(names);
        System.out.println(names);
    }
}
