package javaclass15;

public class LargerNumber {
    void printLarger(int num1,int num2){
        int larger=0;
        if(num1>num2){
            larger=num1;
        }else if(num2>num1){

            larger=num2;
        }else{
            larger=num1;
        }
        System.out.println(larger);
    }

    public static void main(String[] args) {

        LargerNumber largerNumber =new LargerNumber();
        largerNumber.printLarger(12,24);

    }

}
