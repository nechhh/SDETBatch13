package javaclass15;

public class HowUseVariables {
    int num;//whenever you have to share some info  in more than one methods
    //of a class use instance variables
    void met1(){
        int num2;  //local you only can use in this block of codes8
        System.out.println(num);
    }
    void met2(){
        System.out.println(num);
    }
}
