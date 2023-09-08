package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point11MapKeySetMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

//public class SearchInValuespt1 {
//    public static void main(String[] args) {
//        public static ArrayList<String> searchValue (Map < String, String > map, String s){
//            // Create an ArrayList to store the values that contain the substring
//            ArrayList<String> values = new ArrayList<String>();
//
//            // Iterate through the entries of the map
//            for (Map.Entry<String, String> entry : map.entrySet()) {
//                String ss = entry.getValue();  // Extract the value from the entry
//
//                // Check if the value (ss) contains the specified substring (s), ignoring case
//                if (ss.contains(s.toUpperCase()) || ss.contains(s.toLowerCase())) {
//                    values.add(ss);  // Add the value to the ArrayList if the condition is met
//                }
//            }
//
//            // Convert the ArrayList of values to a string and return
//            return Arrays.toString(values);
//        }
//    }

//
//        The method searchValue takes two parameters:<String, String > named map and a String named s (the
//        substring to search for).
//
//        Inside the method, an ArrayList<String> named values is created to store the values that contain the
//        specified substring.
//
//        A loop iterates through the entries of the map using a for -each loop with Map.Entry<String, String>.
//
//                Inside the loop, the value of each entry is extracted using entry.getValue() and stored in the
//        variable ss.
//
//        The condition checks whether the lowercase or uppercase version of ss contains the lowercase or uppercase
//        version of the substring s.If the condition is met, the value ss is added to the values ArrayList.
//
//        After iterating through all entries, the values ArrayList is converted to a string using Arrays.toString(values)
//        and returned.
//
//        In summary, the method searches through the values of the given map for occurrences of the specified substring s
//        (ignoring
//        case)and returns a string representation of the values that match the search criteria.
//