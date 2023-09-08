package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point12MapValuesMethod;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Video {
    public static void main(String[] args) {
        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");

   //save in collection     //collection<String>
        Collection<String> values = countryCodesEU.values();
        System.out.println(values); //[France, Germany, United Kingdom]

        for (String var : values) {
            System.out.println(var); // France, German, United Kingdom
        }




    }
}
