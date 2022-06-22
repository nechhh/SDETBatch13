package Class20;

public class Vehicle {
    int engineHP;
    String make;
    String model;
    String color;

    class Car extends Vehicle{
        String steeringType;
        boolean outoPilot;
        int noOfWindow;
        void printBasicInfo(){
            engineHP=500;
            System.out.println(engineHP);
        }

        class BMW extends Car{
            int speedTop;
            void printBasicInfo(){
                engineHP=500;
                System.out.println(engineHP);

            }
        }
    }


}
