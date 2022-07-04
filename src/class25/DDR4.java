package class25;




interface DDR3 {
    void speed();
    void read();
    void write();

}
public interface DDR4 extends DDR3{
    void speed();
}
class SamsungRam implements DDR4{

    @Override
    public void speed() {
        System.out.println("Extra speed of 1GBPs");
    }

    @Override
    public void read() {
        System.out.println("Reading speed is now 3GB/s");
    }

    @Override
    public void write() {
        System.out.println("writing speed is now 3GB/s");
    }
}

