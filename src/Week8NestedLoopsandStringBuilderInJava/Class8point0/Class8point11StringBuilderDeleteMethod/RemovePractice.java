package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point11StringBuilderDeleteMethod;

public class RemovePractice {

    public static void main(String[] args) {

    }
    // Define a method named removeSubstrings that takes two parameters: a string (sentence) and another string (word).
    public static StringBuilder removeSubstrings(String sentence, String word){

        // Calculate the length of the word to be removed.
        int lengthWord = word.length();

        // Initialize a StringBuilder with the content of the input sentence.

        StringBuilder sb = new StringBuilder(sentence);
        // Start a loop that continues as long as the index of the word is found in the StringBuilder.
        while(sb.indexOf(word)>=0) {

            // Find the index of the first occurrence of the word in the StringBuilder.
            int firstoccurence = sb.indexOf(word);

            // Delete the substring from the first occurrence index to the end of the word's length.
            sb.delete(firstoccurence, firstoccurence + lengthWord);

        }
        // After all occurrences are removed, return the modified StringBuilder.
        return sb;
    }
}
