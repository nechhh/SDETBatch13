package class25;

public interface Animal {
    void sleep();
    void eat();
}
interface Dog extends Animal{
    void Bark();
}
class Husky implements Dog{

    @Override
    public void sleep() {
        System.out.println("sleep 4 hours ");
    }

    @Override
    public void eat() {
        System.out.println("like to eat meet");
    }

    @Override
    public void Bark() {
        System.out.println("Dogs favorite things");
    }
}


