package class33;

public class InSufficientFunds extends RuntimeException{
//    To Create a custom exception simple create a class extend it from RuntimeException
    InSufficientFunds(String message){
        super(message);
    }

}
