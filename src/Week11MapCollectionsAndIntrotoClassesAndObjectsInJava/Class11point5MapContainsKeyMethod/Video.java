package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point5MapContainsKeyMethod;

import java.util.HashMap;
import java.util.Map;

public class Video {
    public static void main(String[] args) {


        Map<Integer, String> students = new HashMap<>();



        students.put(1, "Elon Musk");
        students.put(2,"Steve Jobs");
        students.put(121,"Stacy Rodriguez");
        students.put(4, "Julia Lopez");

        //avoiding getting nulls
        if(students.containsKey(4)) { //5
            System.out.println("The Map Contains key 4");
            System.out.println(students.get(4)); //Julia Lopez
           // System.out.println(students.get(5)); //null

        }
    }
}
