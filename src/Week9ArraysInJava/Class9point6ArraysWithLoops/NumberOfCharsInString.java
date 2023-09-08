package Week9ArraysInJava.Class9point6ArraysWithLoops;

public class NumberOfCharsInString {
    public static void main(String[] args) {

    }

    //The method countChar takes a String array array and a char letter as parameters.
    public static int[] countChar(String[] array, char letter) {
        // Check if the array is empty
        if (array.length == 0) {
            // Create an integer array with one element and assign -1 to it
            int[] iArray = new int[1];
            iArray[0] = -1;
            return iArray; // Return the array with -1
        } else {
            // Create an integer array to store character counts for each string
            int[] intArray = new int[array.length];

            // Iterate through each string in the array
            for (int i = 0; i < array.length; i++) {
                // Get the current string
                String myString = array[i];

                // Convert the string to lowercase to make the check case-insensitive
                myString = myString.toLowerCase();

                // Initialize a variable to count the number of occurrences of the given letter
                int count = 0;

                // Iterate through each character in the string
                for (int j = 0; j < myString.length(); j++) {
                    // Check if the character matches the given letter
                    if (myString.charAt(j) == letter) {
                        ++count; // Increment count if the letter is found
                    }
                    // Store the count in the intArray for the current string
                    intArray[i] = count;
                }
            }
            return intArray; // Return the array with character counts
        }
    }
}