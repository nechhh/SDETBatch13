package class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends=new ArrayList<>(); //Recommended
        legends.add("Hamid");
        legends.add("nec");
        legends.add("asghar");
        legends.add("rem");

        ArrayList<String> moreStudents=new ArrayList<>();
        moreStudents.add("jason");
        moreStudents.add("Handan");

        ArrayList<String> allStudents=new ArrayList<>();
        allStudents.addAll(legends);       // we added  all the names in the legend to the allStudents
        allStudents.addAll(moreStudents);   // we also added moreStudents List to the allStudents array
        System.out.println(allStudents);
        allStudents.removeAll(legends);  // opposite to addAll method
        System.out.println(allStudents);
        allStudents.clear();
        System.out.println(allStudents);

    }
}
