package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point14MapListAsValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexSortingPt2 {
    public static void main(String[] args) {
        String input = "Sample input string";  // Replace with your input string

        // Call the method and store the result
        Map<String, List<String>> resultMap = sortWordsIntoCategories(input);

        // Print the result
        for (Map.Entry<String, List<String>> entry : resultMap.entrySet()) {
            String category = entry.getKey();
            List<String> words = entry.getValue();
            System.out.println(category + ": " + words);
        }
    }

    public static Map<String, List<String>> sortWordsIntoCategories(String str) {
        Map<String, List<String>> myMap = new HashMap<>();
        List<String> hasUpperCase = new ArrayList<>();
        List<String> allLowerCase = new ArrayList<>();
        List<String> hasSpecialChar = new ArrayList<>();
        List<String> hasDigit = new ArrayList<>();

        String[] words = str.split(" ");

        for (String word : words) {
            if (!word.equals(word.toLowerCase())) {
                hasUpperCase.add(word);
                myMap.put("Has Uppercase", hasUpperCase);
            }
            if (!word.matches("[a-zA-Z0-9]+")) {
                hasSpecialChar.add(word);
                myMap.put("Has Special Character", hasSpecialChar);
            }
            if (word.matches(".*\\d.*")) {
                hasDigit.add(word);
                myMap.put("Has Digit", hasDigit);
            }
            if (word.equals(word.toLowerCase())) {
                allLowerCase.add(word);
                myMap.put("All Lowercase", allLowerCase);
            }
        }

        return myMap;
    }
}
