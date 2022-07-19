package class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {


        List<String> names=new ArrayList<>();
        names.add("Naveed");
        names.add("Nico");
        names.add("Noel");
        names.add("Ben");
        names.add("John");


        //those  operations which can change the size of collection are not allowed to be used inside loop
       /* for (String name:names){
            if(name.contains("N")) {
                names.remove(name);
            }else if (name.endsWith("l")){
                names.remove(name);
           }
        }
           */
        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
        }



    }

}
