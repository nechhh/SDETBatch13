package javaclass15;

public class IsPrime {
    //write a method to return whether given number id prime or not
    boolean isPrime(int x ){
        boolean isPrime=true;
        if (x>1){
            for (int i=2; i<x;i++){
                if(x%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        IsPrime task=new IsPrime();
        System.out.println(task.isPrime(5));
    }
}
