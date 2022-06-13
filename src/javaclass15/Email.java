package javaclass15;

public class Email {
    String comleteEmail(String firstName,String lastName,String emailtype){
        return  firstName+lastName+"@"+emailtype+".com";
    }

    public static void main(String[] args) {
        Email task=new Email();
        System.out.println(task.comleteEmail("necirvan","urek8j ","gmail"));
    }
}
