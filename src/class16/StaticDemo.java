package class16;

public class StaticDemo {
    static int noOfEmployees=10;
    String name;

    static void method1(){
        System.out.println(noOfEmployees);
        //System.out.println(name);//error that is why instance can be changed but static should be same
    }
    void method2(){

    }

    public static void main(String[] args) {
        StaticDemo st2=new StaticDemo();
        st2.name="omid";
    }
}
