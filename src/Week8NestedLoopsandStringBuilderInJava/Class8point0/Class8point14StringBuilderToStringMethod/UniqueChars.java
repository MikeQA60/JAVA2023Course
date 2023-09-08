package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point14StringBuilderToStringMethod;

public class UniqueChars {
    public static void main(String[] args) {

    }
    public static boolean uniqueCharacters(String input) {
        // Check if the input string is null or empty
        if (input == null || input.isEmpty()) {
            return true; // Return true for empty or null strings (considered to have unique characters)
        }

        // Create a StringBuilder to work with the input string in a case-insensitive manner
        StringBuilder sb = new StringBuilder(input.toLowerCase());

        // Iterate through each character in the modified input string
        for (int i = 0; i < sb.length(); i++) {
            // Get the current character at index i
            char currentChar = sb.charAt(i);

            // Search for the same character later in the string (starting from i + 1)
            int charIndex = sb.indexOf(Character.toString(currentChar), i + 1);

            // If the character is found later in the string, it's not unique, so return false
            if (charIndex != -1) {
                return false;
            }
        }

        // If the loop completes without finding repeating characters, all characters are unique
        return true;
    }

}
