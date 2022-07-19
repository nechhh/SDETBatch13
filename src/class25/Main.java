package class25;

class Main implements MyInterface{

    public static void main(String[] args){
        Main ob=new Main();
        ob.method1();
        ob.method2();
    }

    @Override
    public void method1() {System.out.println("implementation of method1");}

    @Override
    public void method2() {System.out.println("implementation of method1");}
}
interface MyInterface{
    void method1();
    void method2();
}
