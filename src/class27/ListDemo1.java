package class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // we can store the object of a class inside a variable of type parent class
        //interface if that class implements that interface
        List<String> legends=new ArrayList<>();
        legends.add("Hamid");
        legends.add("nec");
        legends.add("asghar");
        legends.add("rem");
        System.out.println(legends);
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("asghar"));
        Object [] arr=  legends.toArray();
        System.out.println(arr[0]);
        legends.remove("Hamid");
        System.out.println(legends);

        List<String> someStudents=new ArrayList<>();
        someStudents.add("asghar");
        someStudents.add("rem");
        System.out.println(legends.containsAll(someStudents));  //check the legend list contain All Elements which in someStudent List

    }
}
