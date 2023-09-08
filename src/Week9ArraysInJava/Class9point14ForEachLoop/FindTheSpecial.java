package Week9ArraysInJava.Class9point14ForEachLoop;

/*
Description: Write a method called findStringsContainingSpecialChars()
that takes an array of Strings as input. The method should loop through each element of the array and
 check if it contains any of the special characters specified below. If the element contains any of the special characters,
  add it to a new array. The method should then return the new array.

(',', '.', '!', '?', ';', ':', '-', "&", "#")

Params: An array of Strings.

Return: An array of Strings containing elements from the input array that contain special characters.

Example:

String[] inputArray = {"Hello!", "This is a test", "1234", "#$%^&*", "Goodbye!"};

findStringsContainingSpecialChars(inputArray); // Returns {"Hello!", "#$%^&*", "Goodbye!"}

Note: If the input array is empty or does not contain any elements that contain special characters, return an empty array.
 */
public class FindTheSpecial {

    public static void main(String[] args) {

    }
    //In summary, this code defines a method named findStringsContainingSpecialChars which takes an array of strings as input
    public static String[] findStringsContainingSpecialChars(String[] str) {
        // Define a method that takes an array of strings as input and returns an array of strings.

        int count = 0;
        // Initialize a variable 'count' to keep track of the number of strings containing special characters.

        for (String element : str) {
            // Loop through each element (string) in the input array 'str'.

            if (element.matches(".*[,.!\\?;:\\-&#].*")) {
                // If the current element (string) matches the specified regular expression pattern...
                // The pattern "[,.!\\?;:\\-&#]" matches strings containing any of the listed special characters.

                count++;
                // Increment the 'count' variable.
            }
        }

        String[] resultArray = new String[count];
        // Create a new array of strings with the size equal to 'count'.

        int index = 0;
        // Initialize an index variable to keep track of the current position in the 'resultArray'.

        for (String element : str) {
            // Loop through each element (string) in the input array 'str' again.

            if (element.matches(".*[,.!\\?;:\\-&#].*")) {
                // If the current element (string) matches the specified regular expression pattern...

                resultArray[index++] = element;
                // Assign the current element to the 'resultArray' and increment the index.
            }
        }

        return resultArray;
        // Return the 'resultArray' containing strings with special characters.
    }



}
