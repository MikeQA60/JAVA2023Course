package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point8MapSizeAndisEmptyMethods;

import java.util.HashMap;
import java.util.Map;

public class BinaryMap {
    public static void main(String[] args) {

    }
    public static Map<Integer, String> convertBinaryMap(String input) {
        // Initialize a map to store the result
        Map<Integer, String> resultMap = new HashMap<>();

        // Check if the input is empty or contains non-binary characters
        if (input.isEmpty() || !input.matches("[01]+")) {
            resultMap.put(0, "NO BOOLEAN");
            return resultMap;
        }

        // Initialize an index for the resultMap
        int index = 0;

        // Iterate through each binary digit in the input
        for (char digit : input.toCharArray()) {
            // Convert '1' to "true" and '0' to "false", and store in the resultMap
            resultMap.put(index, digit == '1' ? "true" : "false");
            index++;
        }

        // Check if the size of resultMap is odd
        if (resultMap.size() % 2 != 0) {
            // Add a "null" entry to make the size even
            resultMap.put(index, "null");
        }

        return resultMap;
    }

    //This code defines a method convertBinaryMap that takes a binary string as input and returns a map with converted boolean values.
  //  The map resultMap will store the converted values, where the keys are indices and the values are strings.
   // The first if condition checks if the input is empty or contains characters other than '0' and '1'.
   // If the input is invalid, a "NO BOOLEAN" entry is added to the resultMap and returned.
    // An index variable is used to keep track of the resultMap's keys.
    //The loop iterates through each character (digit) in the input binary string.
  //  For each digit, if it's '1', the value "true" is added to the resultMap; if it's '0', "false" is added.
   // After all conversions, the code checks if the size of the resultMap is odd.
   // If the size is odd, a "null" entry is added to the resultMap to make the size even.
   // The resultMap is then returned with the converted values.
         //   Note: The regular expression [01]+ is used to match strings containing only '0' and '1' characters, ensuring that the input is a valid binary string.
}
