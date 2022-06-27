package class17;

class Main {

    public static void main(String[] args){
        Car car=new Car("Toyota","Prius",4,120,30000);
        car.display();
        Car car1=new Car("Toyota","Prius",120,30000);
        car1.display();
        Car car2=new Car(4,120,30000);
        car2.display();
        Car car3=new Car("Toyota","Prius",4);
        car3.display();
    }


}
class Car{
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Car( String make,String model,int numberOfDoors,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

    }
    Car( String make,String model,int topSpeed,double price){
        numberOfDoors=4;
        this.make=make;
        this.model=model;
        this.topSpeed=topSpeed;
        this.price=price;

    }
    Car( int numberOfDoors,int topSpeed,double price){
        make="unknown";
        model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

    }
    Car( String make,String model,int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        topSpeed=90;
        price=0;
    }
    void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

}
