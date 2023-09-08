package Week10WrapperClassListSetCollections.Class10point19InitializingHashSetLinkedHashSetTreeSetInJava;

/*
Description: Write a method called returnHash() that takes an ArrayList of Strings.
The method should return the initialized HashSet from the list provided.

Params: An ArrayList Strings.

Return: The HashSet.

Example:

returnHash([apple, banana, orange, banana, avocado]) //Returns [apple, orange, banana, avocado]
 */
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReturnSetOfFruits {
    public static void main(String[] args) {

    }
    public static Set<String> returnHash(List<String> inputList) {
        // Define a method called returnHash that takes an ArrayList of Strings as input.
        // The method returns the initialized HashSet from the list provided.

        Set<String> hashSet = new HashSet<>(inputList);
        // Create a HashSet named 'hashSet' and initialize it with the elements from the inputList.

        return hashSet;
        // Return the initialized HashSet containing unique elements from the inputList.
    }
}
