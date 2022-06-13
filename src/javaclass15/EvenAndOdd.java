package javaclass15;

public class EvenAndOdd {
    void printEvenOrOdd(int number){

        if(number%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }

    public static void main(String[] args) {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        evenAndOdd.printEvenOrOdd(15);
    }
}
