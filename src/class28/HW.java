package class28;

import java.util.ArrayList;

public class HW {
    /*
  Create an ArrayList that will store 5 names into it.
  Find out whether the given ArrayList is empty or not?
  Check whether the specific name is present in an ArrayList or not?
  Find the size of your arrayList and print all values from that
   */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Olric");
        names.add("Rem");
        names.add("Beg");
        names.add("Nicholas Tesla");
        names.add("Erish");
        System.out.println(" Names [] ="+names);
        System.out.println(names.isEmpty());  //false
        System.out.println(names.contains("Olric")); //check specific name
        System.out.println(names.size());
        names.add(2,"Jorday");
        System.out.println(" Names [] ="+names);

    }

}
