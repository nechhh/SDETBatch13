package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String > words=new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("Game");

        //Never use loops simple for loop Enhanced for loop or while loop whenever
        //you are planing to use any method that can change the size of a list
        /*for (String word : words) {
            if (word.endsWith("e")) {
                words.remove(word);
            }
        }
         */
      /*  for (int i = 0; i <words.size() ; i++) {
            if (words.get(i).endsWith("e")){
                words.remove(i);
            }
        }
        System.out.println(words);

       */
        Iterator<String> iterator=words.iterator();

      /*  System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
       */
        while (iterator.hasNext()){
           // System.out.println(iterator.next());
            if (iterator.next().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);

    }
}
