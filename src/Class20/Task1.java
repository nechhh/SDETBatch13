package Class20;

import javax.xml.namespace.QName;

public class Task1 {
    /*
    write program for multilevel inheritance where class C inherits from class B
    and class B inherits from class A
     */
    public class A{
        String name;
    }
    class B extends A{

        class C extends B{

        }



    }

}
