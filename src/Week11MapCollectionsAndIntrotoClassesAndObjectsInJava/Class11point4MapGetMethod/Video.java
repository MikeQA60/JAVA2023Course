package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point4MapGetMethod;

import java.util.HashMap;
import java.util.Map;

public class Video {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();



        students.put(1, "Elon Musk");
        students.put(2,"Steve Jobs");
        students.put(121,"Stacy Rodriguez");
        students.put(4, "Julia Lopez");

        //get method takes in the key value
        //return type of get method is dynamic
        //it return the data type which was set in the initialization
        //for the values
       String name1 = students.get(1); // Elon Musk
        System.out.println(name1);

        System.out.println(students.get(121)); // Stacy Rodriguez

        //if the key doesnt exist get method returns null
        System.out.println(students.get(5)); //null







    }

}
