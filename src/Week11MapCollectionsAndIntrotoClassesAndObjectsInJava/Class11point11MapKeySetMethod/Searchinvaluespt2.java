package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point11MapKeySetMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Searchinvaluespt2 {
    public static void main(String[] args) {

    }
    public static String[] searchValue(Map<String, String> map, String value) {
        // Create a list to store the values that contain the specified value
        List<String> result = new ArrayList<String>();

        // Iterate through the values of the map using a for-each loop
        for (String val : map.values()) {
            // Check if the lowercase version of the value contains the lowercase version of the specified value
            if (val.toLowerCase().contains(value.toLowerCase())) {
                result.add(val);  // Add the value to the result list
            }
        }

        // Convert the result list to an array of strings and return
        return result.toArray(new String[0]);
    }

///    The method searchValue takes two parameters: a Map<String, String> named map and a String named value (the value to search for).
//
//    Inside the method, a List<String> named result is created to store the values that contain the specified value.
//
//    A loop iterates through the values of the map using a for-each loop with the type String.
//
//    Inside the loop, the condition checks whether the lowercase version of the current value (val)
//    contains the lowercase version of the specified value. This is done to perform a case-insensitive search.
//
//    If the condition is met, the value val is added to the result list.
//
//    After iterating through all values, the result list is converted to an array of strings
//    using result.toArray(new String[0]) and returned.
//
//    In summary, the method searches through the values of the given map for occurrences
//    of the specified value (case-insensitive) and returns an array of strings containing the values that match the search criteria.
}
