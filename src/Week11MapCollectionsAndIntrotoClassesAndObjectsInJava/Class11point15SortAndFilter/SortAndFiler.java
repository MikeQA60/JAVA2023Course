package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point15SortAndFilter;

import java.util.*;

public class SortAndFiler {
    public static void main(String[] args) {

    }
    public static Map<String, List<Integer>> sortAndFilterMap(Map<String, List <Integer>> inputMap){

         // Create a new map to store the sorted and filtered values
        Map<String, List <Integer>> result = new HashMap<>();


        // Iterate through each entry in the input map
        for (Map.Entry<String, List<Integer>> entry : inputMap.entrySet()) {

            // Get the key and values of the current entry
            String key = entry.getKey();
            List<Integer> values = entry.getValue();

            // Create a list to store the filtered values
            List<Integer> filteredValues = new ArrayList<>();

            // Iterate through each value in the list
            for (Integer value : values) {

                // Check if the value is not divisible by 3
                if (value % 3 != 0) {

                    // If not divisible by 3, add it to the filtered values list
                    filteredValues.add(value);


                }
            }

            // Sort the filtered values list
            Collections.sort(filteredValues);

            // Put the key and the sorted filtered values list into the result map

            result.put(key, filteredValues);
        }

        // Return the map with sorted and filtered values
        return result;

    }


}
