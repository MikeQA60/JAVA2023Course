package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point13MapEntrySetMethod;

import java.util.HashMap;
import java.util.Map;

public class Video {
    public static void main(String[] args) {

        //
        //
        //map.entrySet()

        //store one key value pair
        //Map.Entry<String, String> entry


        //a single key value pair is called "Entry" in java
        //datatype key value of map pairs, collections
        //Map<String, String>

        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");

        //   deal with entry                                loop through map
        for (Map.Entry<Integer, String> var : countryCodesEU.entrySet()) {

            System.out.println(var.getKey()); //loop through all keys 33, 49, 44


            System.out.println(var.getValue()); // 33 France
            // 49 Germany
            // 44 United Kingdom


        }

    }
}
