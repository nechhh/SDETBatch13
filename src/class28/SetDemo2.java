package class28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("mango");
        fruit.add("Aplee");
        fruit.add("banana");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Kiwi");                  //it does not execute duplicate
        System.out.println(fruit);
    }
}
