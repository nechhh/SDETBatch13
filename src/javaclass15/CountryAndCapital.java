package javaclass15;

public class CountryAndCapital {

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

        CountryAndCapital countryAndCapital =new CountryAndCapital();
        countryAndCapital.sayHello("France");

    }
}
