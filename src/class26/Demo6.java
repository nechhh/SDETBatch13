package class26;

import class16.StaticDemo;

public class Demo6 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        int num3 = 10;
        int num4 = 10;
        int num5 = 10;
        int num6 = 10;
        System.out.println(num1 + num2 + num3 + num4 + num5 + num6);
        //whenever we have to store more than three value o same typing which are
        //also logically connected we should create an array for them
        String name = "abdlul";
        String name1 = "ozkan";
        String name2 = "nec";
        String name3 = "rem";
        String name4 = "beg";
        String[] names = {"abdlul", "ozkan", "nec", "rem", "beg"};

        //not a good fit for an array because data is not same logically
        String name5="james";
        String address="New york";
        String movieName="thor";


        String[] arr={"james","New york","thor"};

    }
}