package reviewClass10;

public interface SellAble {
    void sell();
}
interface  ChargeAble{
    void charge();
}



class Laptop implements SellAble,ChargeAble{

    @Override
    public void sell() {

    }

    @Override
    public void charge() {
        System.out.println("Charging............");
    }
}

