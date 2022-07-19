package class28;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("mango");
        fruit.add("Aplee");
        fruit.add("banana");
        fruit.add("Orange");
        fruit.add("Orange");                   //it will execute one orange because hashSet does not allow duplicate
        System.out.println(fruit);
    }
}
