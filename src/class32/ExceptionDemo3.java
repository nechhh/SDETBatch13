package class32;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {


            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4 / 0);
            System.out.println(5);
            System.out.println(6);
            System.out.println(7);
        }catch (ArithmeticException ae){
            System.out.println(" you have an ArithmeticException error");
        }
        }
}
