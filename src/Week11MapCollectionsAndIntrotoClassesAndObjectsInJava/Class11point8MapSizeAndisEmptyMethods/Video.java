package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point8MapSizeAndisEmptyMethods;

import java.util.HashMap;
import java.util.Map;

public class Video {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Elon Musk");
        students.put(2,"Steve Jobs");
        students.put(121,"Stacy Rodriguez");
        students.put(4, "Julia Lopez");

        System.out.println(students); // {1=Elon Musk, 2=Steve Jobs, 4=Julia Lopez, 121=Stacy Rodriguez}


        students.clear();
        System.out.println(students); //{}

    }
}
