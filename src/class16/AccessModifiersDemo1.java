package class16;

public class AccessModifiersDemo1 {
    private String password="pass123";

    int ssn=123456;

    public String name="bilal";

    public static void main(String[] args) {
        AccessModifiersDemo1 sc=new AccessModifiersDemo1();
        System.out.println(sc.password);
        System.out.println(sc.ssn);
        System.out.println(sc.name);
    }
}
