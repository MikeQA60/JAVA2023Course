package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point6MapRemoveMethod;

import java.util.HashMap;
import java.util.Map;

public class Video {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();



        students.put(1, "Elon Musk");
        students.put(2,"Steve Jobs");
        students.put(121,"Stacy Rodriguez");
        students.put(4, "Julia Lopez");

     //save in string
       String removedValue =  students.remove(2);
        System.out.println("Removed : " + removedValue); //Removed : Steve Jobs

        System.out.println(students); //{1=Elon Musk, 4=Julia Lopez, 121=Stacy Rodriguez}


        //removing a key that doesnt exist in the map return null
        System.out.println(students.remove(11)); //null


        System.out.println(students); //{1=Elon Musk, 4=Julia Lopez, 121=Stacy Rodriguez}
    }

}
