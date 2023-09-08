package Week10WrapperClassListSetCollections.Class10point10HowToInitializeAnArrayList;

import java.util.ArrayList;
import java.util.List;

/*
Description: Write a method called addToList() that takes a string as input.
The method should return the List of type String with the input string added.

Params: A string.

Return: A List of Strings.

Example:

addToList("Hello 123 World!") // Returns List that contains "Hello 123 World!" in it.

Note: If the input string is empty, the method should return an empty List. Also, no need to import anything.
 */
public class SimpleArrayListCreation {
    public static void main(String[] args) {

    }

    public static List<String> addToList(String input) {
        // Define a method called addToList that takes a string as input.
        // The method returns a List of type String with the input string added.

        List<String> list = new ArrayList<>();
        // Create a List of type String to store the input string.

        if (!input.isEmpty()) {
            list.add(input);
            // If the input string is not empty, add it to the List.
        }

        return list;
        // Return the List containing the input string or an empty List.
    }
}

//This code defines a method named addToList that takes a string as input
// . It creates a List of type String and adds the input string to it if the input string is not empty.
// The example input value has been used in the main method to demonstrate how the method works.