package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point14StringBuilderToStringMethod;

public class EncodeTheString {
    public static void main(String[] args) {

    }

    public static String encodeString(String input) {
        // Check if the input is null or empty
        if (input == null || input.isEmpty()) {
            // If input is null or empty, return an empty string
            return "";
        }

        // Create a StringBuilder named "encoded" to build the encoded string
        StringBuilder encoded = new StringBuilder();

        // Initialize variables to keep track of the current character and its count
        char currentChar = input.charAt(0); // Get the first character of the input
        int count = 1; // Initialize count to 1 since we've seen one occurrence of the character

        // Iterate through the input string, starting from the second character
        for (int i = 1; i < input.length(); i++) {
            // Compare the current character with the next character
            if (input.charAt(i) == currentChar) {
                count++; // If they are the same, increment the count
            } else {
                // Append the current character to the encoded string
                encoded.append(currentChar);

                // Append the count if it's greater than 1, indicating repetition
                if (count > 1) {
                    encoded.append(count);
                }

                // Update currentChar to the new character and reset the count
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        // Append the last character to the encoded string
        encoded.append(currentChar);

        // Append the count of the last character if it's greater than 1
        if (count > 1) {
            encoded.append(count);
        }

        // Convert the StringBuilder to a regular string using toString() and return
        return encoded.toString();
    }

}
