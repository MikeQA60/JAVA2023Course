package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point11MapKeySetMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Video {
    public static void main(String[] args) {

        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");

        //Set<Integer> keys =  keySet(); returns
       Set<Integer> countryCodeKeys = countryCodesEU.keySet();

        System.out.println(countryCodeKeys); // [33, 49, 44]

        //Map<String, String> demoMap = new HashMap<>();
       // Set<String> set = demoMap.keySet();

        for (Integer var : countryCodeKeys) {
            System.out.println(var); //33, 49, 44
        }


    }

}
