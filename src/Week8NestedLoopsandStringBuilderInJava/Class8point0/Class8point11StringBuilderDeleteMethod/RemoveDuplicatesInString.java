package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point11StringBuilderDeleteMethod;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {

    }

    // Define a method named removeDuplicates that takes a string as input.
    public static StringBuilder removeDuplicates(String str){

        // Initialize a StringBuilder with the input string.
        StringBuilder sb = new StringBuilder(str);

        // Initialize a variable i to keep track of the current character position.

        int i = 0;

        // Start a loop that continues until the second-to-last character in the StringBuilder.
        while(i<sb.length()-1){ //once its at the last index it will skip the loop and return the modified string

            //will be the current char of the index i
            char currentChar = sb.charAt(i);

            //well be comparing the current character with the character after it
            //or // Check if the current character is the same as the next character.
            if(currentChar == sb.charAt(i+1)){

                //deletes current char since -> .delete(index, index -1) endIndex Exclusive

                sb.delete(i, i+1);

                //starts over at the current index
              //  continue; //then skips 1++ and continues the loop, comparing from the same index and forward

                // After deletion, no need to increment i, so set it to i.
                i = i;
                // Continue to the next iteration of the loop.

                continue;
            }
            //increments the loop
            i++;
        }
        //returns the modified String as a StringBuilder
        return sb;
    }
}
