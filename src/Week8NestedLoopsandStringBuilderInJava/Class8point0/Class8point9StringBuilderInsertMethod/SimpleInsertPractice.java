package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point9StringBuilderInsertMethod;

public class SimpleInsertPractice {
    public static void main(String[] args) {

    }
    // Define a method named insertCharacters that takes a string and a character as parameters.
    public static String insertCharacters(String str, char character) {

        // Initialize a StringBuilder to construct the modified string.
        StringBuilder sb = new StringBuilder();
// Iterate through each character of the input string.
        for(int i = 0;i < str.length(); i++){

            // Check if the current character is the last character in the string.
            if (i== str.length()-1){

                // If it's the last character, append it to the StringBuilder.
                sb.append(str.charAt(i));
                // Exit the loop since there's no need to add the specified character after the last character.
                break;

            }
            // Append the current character and the specified character to the StringBuilder.
            sb.append(str.charAt(i)).append(character);
        }
        // Convert the contents of the StringBuilder to a string and return it as the result.
        return sb.toString();
    }

}
