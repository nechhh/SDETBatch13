package class16;

public class Dog {
     String name,color;

     static int NumOfLeg=4;// if we know that a value will stay same for all the object of a class and save memory


    public static void main(String[] args) {
        Dog dog1=new Dog();// creating an object of dog class
        dog1.name="tomy";
        dog1.color="pink";

        Dog dog2=new Dog();
        dog2.name="frido";
        dog2.color="black";

        Dog dog3=new Dog();
        dog3.name="olric";
        dog3.color="black";
        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
    }
}
