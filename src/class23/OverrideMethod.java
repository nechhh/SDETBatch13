package class23;

public class OverrideMethod {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
     */
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();//you will get always from parent because child can't effect the parent class
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();//inside child class is empty it will takes from parent class
        Masters masters=new Masters();
        masters.getPrerequisite();//new Child class object
    }

}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    //to override copy same  method from parent class and inside the Child change the body
    void getPrerequisite() {
        System.out.println("To get a degree you need Bachelors Degree first");
    }

}