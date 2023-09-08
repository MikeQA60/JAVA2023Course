package Week10WrapperClassListSetCollections.Class10point29SetRemoveAllMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CompareSentences {
    public static void main(String[] args) {

    }

    public static String[] compareWordCollections(String input, String input2) {
        // Define a method called compareWordCollections that takes two input strings.

        // Split the first input string into an array of words using space as the delimiter.
        String[] str1 = input.split(" ");
        // Split the second input string into an array of words using space as the delimiter.
        String[] str2 = input2.split(" ");

        // Create a HashSet (set1) containing unique words from the first input array.
        Set<String> set1 = new HashSet<>(Arrays.asList(str1));
        // Create a HashSet (set2) containing unique words from the second input array.
        Set<String> set2 = new HashSet<>(Arrays.asList(str2));

        // Check if set1 contains all elements of set2.
        if (set1.containsAll(set2)) {
            // If set1 contains all elements of set2, return an empty array.
            return new String[0];
        }

        // Retain only the elements that exist in both set1 and set2, modifying set2.
        set2.retainAll(set1);

        // Convert the retained elements of set2 into a String array and return it.
        return set2.toArray(new String[0]);
    }
}
