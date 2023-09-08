package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point3MapPutMethod;

import java.util.HashMap;
import java.util.Map;

public class Video {
    public static void main(String[] args) {

        //put --> adds a new key value pair
        //key - if the key already exists then put will update
        //the value of key
        //key - id
        //value - Name of Students
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Elon Musk");
        students.put(2,"Steve Jobs");
        students.put(121,"Stacy Rodriguez");
        students.put(4, "Julia Lopez");


        System.out.println(students); //{1=Elon Musk}
        //{1=Elon Musk, 2=Steve Jobs, 4=Julia Lopez, 121=Stacy Rodriguez}
        //{1=Elon Musk, 2=Steve Jobs, 121=Stacy Rodriguez}

        //here we are updating the value of key 1
        students.put(1, "Bill Gates");

        System.out.println(students); //{1=Bill Gates, 2=Steve Jobs, 4=Julia Lopez, 121=Stacy Rodriguez}

        //Key --> ssn as a String
        //Value --> income reported

        Map<String, Double> reportedIncome = new HashMap<>();
        reportedIncome.put("124-46-8957", 100000.00);
        reportedIncome.put("241-46-8758", 120000.00);
        reportedIncome.put("146-66-8023", 130000.00);

        System.out.println(reportedIncome); //{124-46-8957=100000.0, 146-66-8023=130000.0, 241-46-8758=120000.0}

    }

}

