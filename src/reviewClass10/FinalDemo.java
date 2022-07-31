package reviewClass10;

public class FinalDemo {
    final String company;
    FinalDemo(String company){
        this.company=company;
    }
        void changeCompany(){
            //company="Facebook"; Can't reassing it because it is final
        }

}
class Child extends FinalDemo{

    Child(String company) {
        super(company);
    }
}