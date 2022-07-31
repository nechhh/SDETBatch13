package reviewClass10;

public class Flower {
    String color;
    Flower(String color){
        this.color=color;
    }
    Flower(int color){

    }
    void showColor(){
        System.out.println("Flowers have beautiful colors");
    }
    void smell(){
        System.out.println("flowers smell very well");
    }
    void bloom(){
        System.out.println("Generally bloom is Spring ");
    }
}
class Rose extends Flower{
    Rose(String color) {
        super(color);
    }

    void showColor(){
        System.out.println("Roses have "+color+" Colors");
    }
    void bloom(){
        System.out.println("Roses bloom in April ");
    }
}
class Tulips extends Flower{


    Tulips(String color) {
        super(color);
    }
    void showColor(){
        System.out.println("Tulips have "+color+" Colors");
    }

}
