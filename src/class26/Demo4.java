package class26;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Zamer");
        names.add("Kelwin");
        names.add("ozkan");
        names.add("asghar");
        names.add("Nico");
        System.out.println(names);
        names.remove("Kelwin");
        System.out.println(names);
        names.remove(3);
        System.out.println(names);
    }
}
