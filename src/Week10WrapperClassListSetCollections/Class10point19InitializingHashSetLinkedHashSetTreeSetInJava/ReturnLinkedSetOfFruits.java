package Week10WrapperClassListSetCollections.Class10point19InitializingHashSetLinkedHashSetTreeSetInJava;

/*
Description: Write a method called returnLinked() that takes an ArrayList of Strings.
The method should return the initialized LinkedHashSet from the list provided.

Params: An ArrayList Strings.

Return: The LinkedHashSet.

Example:

returnLinked([apple, banana, orange, banana, avocado]) //Returns [apple, banana, orange, avocado]
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReturnLinkedSetOfFruits {

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("orange");
        inputList.add("banana");
        inputList.add("avocado");

        Set<String> result = returnLinked(inputList);
        System.out.println(result);
    }

    public static Set<String> returnLinked(List<String> inputList) {
        // Define a method called returnLinked that takes an ArrayList of Strings as input.
        // The method returns the initialized LinkedHashSet from the list provided.

        Set<String> linkedHashSet = new LinkedHashSet<>(inputList);
        // Create a LinkedHashSet named 'linkedHashSet' and initialize it with the elements from the inputList.

        return linkedHashSet;
        // Return the initialized LinkedHashSet containing unique elements from the inputList.
    }
}


