package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point13MapEntrySetMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BiggerThanResuleOfDivision {
    public static void main(String[] args) {

            // Create a sample map
            Map<String, Integer> inputMap = new HashMap<>();
            inputMap.put("Apple", 10);
            inputMap.put("Banana", 20);
            inputMap.put("Orange", 15);
            inputMap.put("Grapes", 30);


            Double divisionValue = 2.0;
            String[] result = getKeysGreaterThanDivision(inputMap, divisionValue);


            System.out.println("Keys greater than division value:");
            for (String key : result) {
                System.out.println(key);
            }

    }

    public static String[] getKeysGreaterThanDivision(Map<String, Integer> inputMap, Double divisionValue) {
        // Define a method called getKeysGreaterThanDivision that takes a Map and a Double value.

        // Calculate the sum of all values in the inputMap using stream operations.
        int sum = inputMap.values().stream().mapToInt(Integer::intValue).sum();

        // Create a List to store the keys that meet the condition.
        List<String> keys = new ArrayList<>();

        // Check if divisionValue is 0.
        if (divisionValue == 0) {
            // If divisionValue is 0, add all keys to the keys list.
            keys.addAll(inputMap.keySet());
        } else {
            // If divisionValue is not 0, iterate through the entries of the inputMap.
            for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
                // Compare the value of the current entry with the sum divided by divisionValue.
                if (entry.getValue() > sum / divisionValue) {
                    // If the value is greater than the calculated division, add the key to the list.
                    keys.add(entry.getKey());
                }
            }
        }

        // Convert the keys list to a String array and return it.
        return keys.toArray(new String[0]);
    }
}
   // In summary, this code defines a method that takes a Map of strings and integers, and a division value.
// It calculates the sum of the values in the map, and then checks if the value associated with each key is greater
// than the sum divided by the division value. If the division value is 0, all keys are added to the result.
// The keys that meet the condition are added to a List, which is then converted to a String array and returned.

