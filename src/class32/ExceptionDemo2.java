package class32;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
         String name=null;
           // System.out.println(name.length());
           /*int[] arr={3};
           System.out.println(arr[5]);*/
            int[] ary={-4};
            System.out.println(ary[0]);


        }catch (NullPointerException npe){
            System.out.println("You are tring to call a method on a null object");
        }catch (IndexOutOfBoundsException iobe){
            System.out.println("Please check the index that you are trying to access");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
