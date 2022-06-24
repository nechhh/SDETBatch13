import Class20.Task1;

public class Animal {
    String name;
    String color;
    String breed;
    int age;

    public Animal(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    void  printInfo(){
        System.out.println("Name"+name+"color"+color+"breed"+breed+"age"+age);
    }
}
class Dog extends Animal {

    public Dog(String name, String color, String breed, int age) {
        super(name, color, breed, age);
    }
}
