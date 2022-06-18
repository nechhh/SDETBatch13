package reviewclass7;

public class Demo1 {
    public static void main(String[] args) {

        char [] arr={'a','b','c'};
        String str=new String(arr);
        System.out.println(str);

        int [] arr2={65,66,67,68,69};// on ASCII table (65 mean A ) to ABC
        String str2=new String(arr2,0,3);
        System.out.println(str2);

        String name="Muhammed AbdulSamad Bond";
        if(name.length()>10){
            System.out.println("please use shorter name ");
        }else{
            System.out.println("your name has  been accepted");
        }
    }
}
