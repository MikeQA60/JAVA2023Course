package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point14MapListAsValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Video {
    public static void main(String[] args) {

        //Manager name --> list of employess names Mapping
        //String is datatype of key in map
        Map<String, List<String>> managersAndEmployees = new HashMap<>();

        //Elon --> [Steve, Alice, Bill, Jane]

        List<String> elonEmployees = new ArrayList<>();
        elonEmployees.add("Steve");
        elonEmployees.add("Alice");
        elonEmployees.add("Bill");
        elonEmployees.add("Jane");


        managersAndEmployees.put("Elon", elonEmployees);

        System.out.println(managersAndEmployees); //{Elon=[Steve, Alice, Bill, Jane]}

        //Askar ---> Chirag, Paurush, Akmaral, Aika
        //for every entry create a new list
        List<String> askarEmployees = new ArrayList<>();
        askarEmployees.add("Chirag");
        askarEmployees.add("Paurush");
        askarEmployees.add("Akmara");
        askarEmployees.add("Aika");

        managersAndEmployees.put("Askar", askarEmployees); //{Askar=[Chirag, Paurush, Akmara, Aika],
        System.out.println(managersAndEmployees); //Elon=[Steve, Alice, Bill, Jane]}

    }
}
