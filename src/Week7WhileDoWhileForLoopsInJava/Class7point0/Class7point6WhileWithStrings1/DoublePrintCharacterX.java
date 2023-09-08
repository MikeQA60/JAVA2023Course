package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point6WhileWithStrings1;

public class DoublePrintCharacterX {
    public static String printStringWithX(String input) {
        int num = 0;            // Initialize a variable to keep track of the current index
        String output = "";     // Initialize an empty String to store the output

        while (num <= input.length() - 1) {   // Loop through each character in the input String
            char c = input.charAt(num);   // Get the character at the current index

            if (c == 'x') {     // Check if the character is 'x' or 'X'
                output += "x";           // If it is, add the letter 'X' twice to the output String
            }
            else if (c == 'X') {
                output += "X";

            }
            output += c;                 // Otherwise, just add the character to the output String
            num++;                       // Move to the next character
        }

        return output;     // Return the final output String
    }
}