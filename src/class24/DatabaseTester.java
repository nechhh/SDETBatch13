package class24;

public class DatabaseTester {
    public static void main(String[] args) {
        Database [] databases= {new Unformix(),new MySQLServer()};
        for (Database dt:databases){
            dt.open();
            dt.readData();
            dt.writeData();
            dt.closeTheDatabase();

        }
    }
}
