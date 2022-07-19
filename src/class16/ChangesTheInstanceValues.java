package class16;

import java.util.Scanner;

public class ChangesTheInstanceValues {
    String str="instance";
    void changeInstanceValue(){
        str="Captain Marvel";
    }

    void printIstanceValue(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        ChangesTheInstanceValues id=new ChangesTheInstanceValues();
        System.out.println(id.str); // prints the value of str which is instance
        id.printIstanceValue(); // method once simple prints the value of str which is still instance
        id.changeInstanceValue(); //this method changes the instance variable value which will be not captain marvel
        id.printIstanceValue();// method once simple prints the value of str which is now instance captain marvel


    }
}


