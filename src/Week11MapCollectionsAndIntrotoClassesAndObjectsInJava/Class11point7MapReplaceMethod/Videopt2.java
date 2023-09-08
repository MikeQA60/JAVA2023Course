package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point7MapReplaceMethod;

import java.util.HashMap;
import java.util.Map;

public class Videopt2 {
    public static void main(String[] args) {


        Map<Integer, String> students = new HashMap<>();


        System.out.println(students.size()); //0

        //isEmpty() --> return true if the map has no enteries, false if there is at least
        //one entry

        //returns true or false
        System.out.println(students.isEmpty()); //true

    }

}