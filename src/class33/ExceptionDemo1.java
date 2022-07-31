package class33;

public class ExceptionDemo1 {
    /*
    * What is printStackTrace
    * it's a method that show all the details of exception
    */
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("you are trying to divide by zero");
            ae.printStackTrace();                                     //mostly we will use this
            System.out.println(ae.getMessage());
            System.out.println(ae);
        }
        System.out.println("Important code");
    }
}
