package class24;

class Main extends Parent{
    @Override
    void m1() {
        System.out.println("Child class providing implementation");
    }
    void m2(){
        System.out.println("Parent class providing implementation");
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.m1();
        main.m2();
    }
}

    abstract class Parent{
        void m2(){
            System.out.println("Parent class providing implementation");
        }
        abstract void m1();

    }

