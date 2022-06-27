package class21;

import static class21.MethodOverLoading2.add;

public class MethodOverLoading {
    static void addDoubles(double number1,double number2){
        System.out.println(number1+number2);
    }
    static void add3Doubles(double number1,double number2,double number3){
        System.out.println(number1+number2);
    }
    static void add3Doubles(double number1,double number2,double number3,double number4){
        System.out.println(number1+number2+number3+number4);
    }

    public static void main(String[] args) {
        add(20,20);
        addDoubles(20.5,43.6);
    }
}
