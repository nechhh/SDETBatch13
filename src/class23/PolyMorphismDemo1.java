package class23;

public class PolyMorphismDemo1 {
    void doSomething(String name){
        System.out.println("Dowloading a movie from the internet");
    }
    void doSomething(int num){
        System.out.println("calculating the text based on new rules");

    }
}
class PolyTester {
    public static void main(String[] args) {
        PolyMorphismDemo1 p=new PolyMorphismDemo1();
        p.doSomething(10);
    }
}
