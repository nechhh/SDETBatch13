package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HW4 {
    /*
     Create an arrayList of even numbers from 1 to 500.
      Remove any number that is divisible by 5 from that arrayList.
      */
    public static void main(String[] args) {
        ArrayList<Integer> evenNums=new ArrayList<>();
        for (int i = 0; i <500 ; i+=2) {
            evenNums.add(i);
        }
        System.out.println(evenNums);

      /* Iterator<Integer> iterator = evenNums.iterator();
        while (iterator.hasNext()){
            if (iterator.next()%5==0){
              iterator.remove();
            }
        }*/
        evenNums.removeIf(num->num%5==0);
        System.out.println(evenNums);

    }
}
