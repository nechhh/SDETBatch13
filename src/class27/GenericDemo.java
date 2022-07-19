package class27;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //names.add(10); Error can only insert Strings
        ArrayList all=new ArrayList();
        all.add(10);
        all.add("name");
        all.add(10.4);

    }
}
