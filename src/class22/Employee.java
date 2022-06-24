package class22;

public class Employee {
    String name;

    int basesalary=30000;
    int baseHolidays=10;

    void calculatePrintSalary(){
        System.out.println(basesalary);
    }
    void calculatePrintHolidays(){
        System.out.println(baseHolidays);
    }
}
class Manager extends Employee{
    void calculatePrintSalary(){
        System.out.println(basesalary*3+20000);
    }
    void calculatePrintHolidays() {
        System.out.println(baseHolidays * 3);
    }
}

class OfficeBoy extends  Employee{

}
class Developer extends Employee{
    void calculatePrintSalary(){
        System.out.println(basesalary*3+30000);
    }
    void calculatePrintHolidays(){
        System.out.println(baseHolidays*2);
    }

}
class QA extends Employee{
    void calculatePrintSalary(){
        System.out.println(basesalary*3+10000);
    }
    void calculatePrintHolidays(){
        System.out.println(baseHolidays*2);
    }

}
