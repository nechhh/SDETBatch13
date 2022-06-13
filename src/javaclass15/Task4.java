package javaclass15;

public class Task4 {

    void sayHello(String country){
        String hello;
        switch (country){
            case "USA":
            hello="hola";
            break;
            case "Rusia":
                hello="Privet";
                break;
            case "France":
                hello="bonjour";
                break;
            case "Pakistan":
                hello="Assalam o Alykum";
                break;
            case "india":
                hello="Namastay";
                break;
            case "turkiye":
                hello="Merhaba";
                break;
            default:
                hello="country not found";

        }
        System.out.println(hello);
    }

    public static void main(String[] args) {

        Task4 task4 =new Task4();
        task4.sayHello("France");

    }
}
