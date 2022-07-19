package class27;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> legends=new ArrayList<>(); //Recommended
        legends.add("Hamid");
        legends.add("asghar");
        legends.add("nec");
        legends.add("asghar");
        legends.add("rem");
        legends.add("asghar");

        System.out.println(legends.get(3));

        System.out.println(legends);
        legends.set(0,"Ozkan");                          //Replace an index
        System.out.println(legends);
        System.out.println(legends.indexOf("asghar"));
        System.out.println(legends.lastIndexOf("asghar"));

        System.out.println(legends.subList(0,3));
    }
}
