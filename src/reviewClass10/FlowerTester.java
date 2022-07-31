package reviewClass10;

public class FlowerTester {
    public static void main(String[] args) {
        Rose rose=new Rose("Red");
        rose.showColor();
        rose.bloom();
        rose.smell();
        System.out.println("******************************************");
        Flower flower=new Rose("Green");
        flower.showColor();
        flower.bloom();
        flower.smell();
        Flower[] flowers={new Rose("Red"),new Tulips("green")};

        for (Flower flower1:flowers) {
          flower1.bloom();
          flower1.smell();
        }
    }
}
