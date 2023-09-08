package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point7MapReplaceMethod;

import java.util.HashMap;
import java.util.Map;

public class Video {
    public static void main(String[] args) {


        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Elon Musk");
        students.put(2,"Steve Jobs");
        students.put(121,"Stacy Rodriguez");
        students.put(4, "Julia Lopez");
        System.out.println(students.size()); //4

        //isEmpty() --> return true if the map has no enteries, false if there is at least
        //one entry

        //returns true or false
        System.out.println(students.isEmpty()); //false

        if(!students.isEmpty()) {

        }

    }
}
