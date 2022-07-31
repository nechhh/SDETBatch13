package reviewclass12;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Jason");
        names.add("Ozkan");
        names.add("Genna");
        names.add("Roman");
        System.out.println(names);
        /*names.forEach(name-> System.out.println(name));
        System.out.println("**********************************");*/
        names.removeIf(name->name.contains("k"));
        System.out.println(names);
        System.out.println(names.contains("Roman"));

    }
}
