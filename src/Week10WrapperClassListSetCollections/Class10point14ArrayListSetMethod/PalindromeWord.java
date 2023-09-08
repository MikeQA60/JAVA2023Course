package Week10WrapperClassListSetCollections.Class10point14ArrayListSetMethod;

import java.util.ArrayList;
import java.util.List;

public class PalindromeWord {
    public static void main(String[] args) {

    }
    public static List<Boolean> checkPalindromeWords(ArrayList<String> words) {
        // Define a method called checkPalindromeWords that takes an ArrayList of strings (words) as input.
        // The method returns a new List of booleans indicating whether each word in the input list is a palindrome.

        List<Boolean> palindromeList = new ArrayList<>();
        // Create a new List of booleans named 'palindromeList' to store whether each word is a palindrome.

        for (String word : words) {
            // Start a loop that iterates through each element (word) in the input list (words).

            palindromeList.add(isPalindrome(word));
            // Add the result of the isPalindrome method for the current word to the 'palindromeList'.
        }

        return palindromeList;
        // Return the 'palindromeList' containing boolean values indicating if each word is a palindrome.
    }

    private static boolean isPalindrome(String word) {
        // Define a private helper method named isPalindrome that takes a string (word) as input.
        // This method checks if the input word is a palindrome and returns a boolean value.

        int left = 0;
        int right = word.length() - 1;
        // Initialize two pointers, 'left' and 'right', pointing to the beginning and end of the word.

        while (left < right) {
            // Start a loop that continues as long as the 'left' pointer is less than the 'right' pointer.

            if (word.charAt(left) != word.charAt(right)) {
                // Compare the characters at the 'left' and 'right' pointers.

                return false;
                // If the characters are not equal, the word is not a palindrome. Return false.
            }

            left++;
            right--;
            // Move the 'left' pointer to the right and the 'right' pointer to the left.
        }

        return true;
        // If the loop completes without finding unequal characters, the word is a palindrome. Return true.
    }
//    In summary, this code defines a method named checkPalindromeWords that takes an ArrayList of strings as input.
//    It iterates through each word in the list and uses the helper method isPalindrome to determine whether the word is a palindrome.
//    The isPalindrome method checks if a given word reads the same forwards and backwards. The results (true or false)
//    are added to a new list (palindromeList) which is then returned.
}
