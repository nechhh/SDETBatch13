package class26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name="yamazan";
        String name1="Beg";
        String name2="Nico";
        /*int size=10;
        String [] arr=new String[size];
         */
        String []names={"yamazan","Beg","Nico"};
        names= new String[]{"yamazan", "Beg", "Nico"};
        System.out.println(names.length);
        names=new String[4];
        names[0]="ahmet";
        names[1]="rexa";
        names[2]="lan";
        names[3]="karla";
        System.out.println(names.length);


        ArrayList<String>syntaxStudent=new ArrayList<>();
        System.out.println(syntaxStudent.size());
        syntaxStudent.add("riax");
        System.out.println(syntaxStudent.size());
        syntaxStudent.add("tony");
        syntaxStudent.add("alex");
        syntaxStudent.add("Max");
        System.out.println(syntaxStudent.size());


        ArrayList<Integer>arrays=new ArrayList<Integer>();
        for (int i=1; i<10;i=i+2){
            arrays.add(i);
        }
        System.out.println(arrays);


    }
}
