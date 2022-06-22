package Class20;

public class Task2 {
    /*
    write program to inherit class G that has method printF which is static and call reuse that method into class E
     */
    public static void main(String[] args) {
        E.printF();
    }

    class G{
        public static void printF(){
            System.out.println("Method printF in class G");
        }


    }
    class E extends G{

    }

}
