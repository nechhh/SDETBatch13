package class23;

public class Animal {

    Animal(){
        System.out.println("parent");
    }
    void eat(){
        System.out.println("All the animal eat");
    }
}
class Panda extends Animal{
    //no other class can inherit from class because it is declared final
    void eat() {
        System.out.println("all animal eat");
    }
        Panda(){
            System.out.println("parent");
    }
}
class Tester{
    public static void main(String[] args) {
        new Panda();
    }
}
