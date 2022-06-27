package class23;

public class Parent {
    public static void eat(){
        System.out.println("I like to rat seafood");
    }
    public static void sleep(){
        System.out.println("I like to sleep 8 hours");
    }
    public static void activity(){
        System.out.println("watching news ");
    }
}
class Child extends Parent{

    public static void activity() {
        System.out.println("I am very religious ");
    }

}
class ParentTester{
    public static void main(String[] args) {

        Child.sleep();
        Child.activity();
        Parent.activity();
        Child.activity();

    }
}
