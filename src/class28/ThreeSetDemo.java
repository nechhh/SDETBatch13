package class28;

import java.util.TreeSet;

public class ThreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> sortedNumbers=new TreeSet<>();
        sortedNumbers.add(5);
        sortedNumbers.add(10);
        sortedNumbers.add(15);
        sortedNumbers.add(2);
        sortedNumbers.add(8);                                    //it will sorted all numbers
        sortedNumbers.add(8);                                    //it will sorted all numbers
        System.out.println(sortedNumbers);
    }
}
