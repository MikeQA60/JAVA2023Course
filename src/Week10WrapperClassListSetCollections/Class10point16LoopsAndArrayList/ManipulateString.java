package Week10WrapperClassListSetCollections.Class10point16LoopsAndArrayList;

import java.util.List;

/*
Description: Write a method called manipulateStrings() that takes an ArrayList of Strings as input.
The method should iterate through each string in the list and perform a specific operation based on the length of the string
. The operations are as follows:

For strings with length less than 5, convert them to uppercase.

For strings with length between 5 and 10 (inclusive), reverse the string.

For strings with length greater than 10, remove the vowels from the string.

The method should return the updated ArrayList with the manipulated strings.



Params: An ArrayList of Strings.

Return: An ArrayList of Strings with the specified operations applied.



Example:

ArrayList<String> words = {"air", "world", "programming", "java", "openai"};

manipulateStrings(words) //Returns ["AIR", "dlrow", "prgrmmng", "JAVA", "ianepo"];



Note:

You can assume that the input ArrayList will not be null.

The operations are applied in the order described above.




Ex1

Input: cat programming open apple dog java elephant car banana computer

Output: [CAT, prgrmmng, OPEN, elppa, DOG, JAVA, tnahpele, CAR, ananab, retupmoc]


Ex2

Input: house elephant apple programming car dog java computer banana open cat

Output: [esuoh, tnahpele, elppa, prgrmmng, CAR, DOG, JAVA, retupmoc, ananab, OPEN, CAT]


Ex3

Input: OpenAI 1234 programming! Dog 5678 cat@ Elephant Apple car banana Java house

Output: [IAnepO, 1234, prgrmmng!, DOG, 5678, CAT@, tnahpelE, elppA, CAR, ananab, JAVA, esuoh]
 */
public class ManipulateString {
    public static void main(String[] args) {

    }
    public static List<String> manipulateStrings(List<String> words) {
        // Define a method called manipulateStrings that takes a List of strings (words) as input.
        // The method returns a modified List based on the lengths of the words.

        for (int i = 0; i < words.size(); i++) {
            // Start a loop that iterates through each index in the List.

            String word = words.get(i);
            // Get the word at the current index.

            if (word.length() < 5) {
                // Check if the length of the word is less than 5 characters.

                words.set(i, word.toUpperCase());
                // Convert the word to uppercase and update it in the List.

            } else if (word.length() >= 5 && word.length() <= 10) {
                // Check if the length of the word is between 5 and 10 characters.

                words.set(i, new StringBuilder(word).reverse().toString());
                // Reverse the characters in the word and update it in the List.

            } else {
                // If the word length is greater than 10 characters.

                words.set(i, word.replaceAll("[aouei]", ""));
                // Remove any lowercase vowels (a, o, u, e, i) from the word and update it in the List.
            }
        }

        return words;
        // Return the modified List of strings.
    }
   // In summary, this code defines a method named manipulateStrings that takes a List of strings (words) as input. It iterates through each word in the List and performs different operations based on the word length:

    //If the word length is less than 5 characters, the word is converted to uppercase.
   // If the word length is between 5 and 10 characters, the word is reversed.
   // If the word length is greater than 10 characters, all lowercase vowels are removed from the word.
   // The words are updated in the List based on the conditions, and the modified List is returned.
}
