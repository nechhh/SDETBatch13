package class26;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLS");
        subjects.add("Manual Teating");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");

        System.out.println(subjects.indexOf("Java"));//returns the index of java which is 2
        System.out.println(subjects.size());//tells us the total number of elements in the arrays
        subjects.remove("Git");
        System.out.println("subjects = " + subjects);// to printout or arrayList just type soutv
        System.out.println(subjects.contains("Selenium"));
        subjects.add(1,"Jira");
        System.out.println("subjects = " + subjects);

        System.out.println("subjects.get(0) = " + subjects.get(0));
        subjects.clear();
        System.out.println("subjects = " + subjects);


    }
}
