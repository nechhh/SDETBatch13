package Class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();

    }

}
    class Furniture{
        String name="Table";
        String color="Black";
    }
    class Chair extends Furniture{
        String color="gray";
        void printColor(){
            String color="white";
            System.out.println(color);
            System.out.println(this.color);
            System.out.println(super.color);
        }

    }


