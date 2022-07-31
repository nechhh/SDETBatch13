package class28;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("hi");
        arr.add("yo");
        arr.add("sup");
        arr.add("yolo");
        arr.add("boop");
        arr.remove("hi");
        arr.remove("sup");
        arr.remove("boop");
        System.out.println(arr);

    }
}
