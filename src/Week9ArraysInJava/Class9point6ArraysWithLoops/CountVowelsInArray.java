package Week9ArraysInJava.Class9point6ArraysWithLoops;

public class CountVowelsInArray {
    public static void main(String[] args) {


    }


    //The method countVowels takes a String arra, array as a parameter.

    public static int[] countVowels(String[] array) {
        // Check if the array is empty
        if (array.length == 0) {
            // Create an integer array with one element and assign -1 to it
            int[] iArray = new int[1];
            iArray[0] = -1;
            return iArray; // Return the array with -1
        } else {
            // Create an integer array to store vowel counts for each string
            int[] intArray = new int[array.length];

            // Iterate through each string in the array
            for (int i = 0; i < array.length; i++) {
                // Get the current string
                String myString = array[i];

                // Convert the string to lowercase to make the check case-insensitive
                myString = myString.toLowerCase();

                // Initialize a variable to count the number of vowels in the string
                int vowelCount = 0;

                // Iterate through each character in the string
                for (int j = 0; j < myString.length(); j++) {
                    // Check if the character is a vowel (a, e, i, o, u)
                    if (myString.charAt(j) == 'a' || myString.charAt(j) == 'e' ||
                            myString.charAt(j) == 'i' || myString.charAt(j) == 'o' ||
                            myString.charAt(j) == 'u') {
                        ++vowelCount; // Increment vowel count if a vowel is found
                    }
                    // Store the vowel count in the intArray for the current string
                    intArray[i] = vowelCount;
                }
            }
            return intArray; // Return the array with vowel counts
        }
    }
}

