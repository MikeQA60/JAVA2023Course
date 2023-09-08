package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point3MapPutMethod;

import java.util.HashMap;
import java.util.Map;

public class CheckLengthOfWord {
    public static void main(String[] args) {

    }
    public static Map<String, Boolean> checkWordLength(String input) {
        // Define a method called checkWordLength that takes a string as input and returns a Map.

        // Split the input string into an array of words using space as the delimiter.
        String[] split = input.split(" ");

        // Initialize a Boolean variable answer as false.
        Boolean answer = false;

        // Create a HashMap named map to store words and their corresponding Boolean values.
        Map<String, Boolean> map = new HashMap<>();

        // Iterate through the array of words.
        for (int i = 0; i < split.length; i++) {
            // Check if the length of the current word is even.
            if (split[i].length() % 2 == 0) {
                // If the length is even, set answer to true.
                answer = true;
            } else {
                // If the length is odd, set answer to false.
                answer = false;
            }

            // Add the current word and its corresponding answer to the map.
            map.put(split[i], answer);
        }

        // Return the map containing words and their corresponding Boolean values.
        return map;
    }
  //  In summary, this code defines a method that takes a string as input, splits it into words,
    //  and checks the length of each word. For each word, it determines whether the length is even or odd and
    //  stores the result in a map with the word as the key and the Boolean answer as the value. The method then returns the map containing words and their corresponding Boolean values.
}
