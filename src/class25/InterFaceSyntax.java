package class25;

public interface InterFaceSyntax {
    public void method1();
    public void method2();
}
class ImpInterface implements InterFaceSyntax{

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");

    }

    public static void main(String[] args) {
        ImpInterface obj=new ImpInterface();
        obj.method1();
        obj.method2();
    }
}
