package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point9StringBuilderInsertMethod;

public class ConditionalInsert2 {
    // Define a method named manipulateString that takes an input string and an integer.
    public static String manipulateString(String inputString, int number) {

        // Initialize a StringBuilder to store the result.
        StringBuilder result = new StringBuilder();

        // Check if the number is negative.
        if (number < 0) {
            // Create a reversed version of the input string.
            String reversedString = new StringBuilder(inputString).reverse().toString();

            // Append the absolute value of the number and the reversed string to the result.
            result.append(Math.abs(number)).append(reversedString);
        } else {
            // Remove spaces from the input string.
            String stringWithoutSpaces = inputString.replace(" ", "");

            // Append the modified input string without spaces and the number to the result.
            result.append(stringWithoutSpaces).append(number);
        }

        // Convert the result StringBuilder to a string and return it.
        return result.toString();
    }

    // Main method where you can test the manipulateString method.
    public static void main(String[] args) {
        System.out.println(manipulateString("hello world", -5)); // Returns "5dlrowolleh"
        System.out.println(manipulateString("this is a test", 3)); // Returns "thisisatest3"
        System.out.println(manipulateString("", -2)); // Returns "2"
    }
}
