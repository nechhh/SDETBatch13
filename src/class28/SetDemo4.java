package class28;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        TreeSet<String> letters=new TreeSet<>();
        letters.add("c");
        letters.add("z");
        letters.add("f");
        letters.add("k");
        letters.add("e");
        System.out.println(letters);

        TreeSet<String> letters1=new TreeSet<>();
        letters1.add("ca");
        letters1.add("ck");
        letters1.add("ze");
        letters1.add("zz");
        letters1.add("fa");
        letters1.add("ke");
        letters1.add("er");
        System.out.println(letters1);
    }

}
