package class30;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HW4 {
    /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
*/
    public static void main(String[] args) {
        LinkedHashSet<String> names=new LinkedHashSet<>();
        names.add("hello");
        names.add("World");
        names.add("Welcome");
        names.add("to ");
        names.add("Syntax");

        StringBuilder allValues= new StringBuilder();
        for (String value:names){
            allValues.append(value);
        }
        System.out.println(allValues);

    }
}
