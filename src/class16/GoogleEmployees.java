package class16;

public class GoogleEmployees {

    String name;
    double salary;
    static int numberOfEmployees;// it can be change but it still should be same for everything
    static String companyName = "Google";

    void displayEmployeeInfo() {
        System.out.println("Name " + name + " Salary " + salary + " Company Name " + companyName+" Total Employess "+numberOfEmployees);
    }

    public static void main(String[] args) {
        GoogleEmployees emp1=new GoogleEmployees();
        emp1.name="Oleg";
        emp1.salary=250000;
        emp1.numberOfEmployees=1;


        GoogleEmployees emp2=new GoogleEmployees();
        emp2.name="Sameer";
        emp2.salary=250001;
        emp2.numberOfEmployees=2;//increase from 1 to 2 //it can change but still will be same for all

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
}
}