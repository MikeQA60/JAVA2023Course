package Week10WrapperClassListSetCollections.Class10point21SetRemoveMethod;

import java.util.LinkedHashSet;
import java.util.Set;

public class ClearSet {
    public static void main(String[] args) {

    }
    public static Set<String> removeSetElements(Set<String> set, String input) {
        // Define a method called removeSetElements that takes a Set of Strings and a String as input.
        // The method returns a new Set with elements removed that are found in the input String.

        Set<String> resultSet = new LinkedHashSet<>(set);
        // Create a new Set of Strings named 'resultSet' initialized with the elements from the input 'set'.
        // This creates a copy of the original set to work with.

        for (String element : set) {
            // Start a loop that iterates through each element in the input 'set'.

            if (input.contains(element)) {
                // Check if the current element is present in the input String 'input'.

                resultSet.remove(element);
                // Remove the current element from the 'resultSet' if it's found in the 'input'.
            }
        }

        return resultSet;
        // Return the modified 'resultSet' which contains elements removed based on their presence in the 'input'.
    }
}

//In summary, this code defines a method named removeSetElements that takes a Set of Strings and a String as input.
// It creates a new Set named resultSet initialized with the elements from the input Set.
// Then, it iterates through each element in the input Set and checks if the element is present in the input String.
// If an element is found in the input String, it's removed from the resultSet.
// The method returns the modified resultSet with elements removed based on their presence in the input String.