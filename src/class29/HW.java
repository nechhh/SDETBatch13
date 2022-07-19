package class29;

import java.util.Collection;
import java.util.HashMap;

public class HW {
    /*
    * Create a Set collection that will hold Objects of Student Type.
    *  In this set we do not care about the insertion order.
    * Each student object should have name and studentID.
    *  Display name of each student.*/

    public static void main(String[] args) {
        HashMap<String,Integer> student=new HashMap<>();
        student.put("Jordan",1245);
        student.put("Jimmy",544);
        student.put("Carlos",654);
        student.put("Olric",5445);
        student.put("NE",1265);

        System.out.println(student.keySet());
        System.out.println(student.values());/// Also values
    }

}
