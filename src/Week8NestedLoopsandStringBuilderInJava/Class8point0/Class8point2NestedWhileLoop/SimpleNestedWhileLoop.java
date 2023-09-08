package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point2NestedWhileLoop;

/*
8.2.1 Simple nested while loop *

Easy

Description: Write a simple nested while loop which would print such pattern:



a12345b12345c12345



Note: use first while loop to go through string "abc", and second loop to count from 1 to 5


 */
public class SimpleNestedWhileLoop {
    public static void main(String[] args) {

        // This line creates a string variable named letters and initializes it with the value "abc".
        String letters = "abc";


        //: This line declares an integer variable named i and initializes it to 0.
        // This variable will be used as the index to access each character in the string letters.
        int i = 0;

//This starts a while loop that will run as long as the value of i is less than the length of the string letters.
// This loop is used to iterate through each character of the string letters
        while (i < letters.length()) {

            //gets the character at the current index i from the string letters and assigns it to the variable letter.
            char letter = letters.charAt(i);

            // prints the character stored in the variable letter,
            // effectively printing one of the characters from the string "abc" in each iteration.
            System.out.print(letter);

// This line declares and initializes an integer variable j to 1.
// This variable will be used as a counter to print numbers 1 to 5.
            int j = 1;

            //This starts another while loop that will run as long as the value of j is less than or equal to 5.
            while (j <= 5) {


                //prints the value of j, which is the current number in the range from 1 to 5.
                System.out.print(j);

                // increments the value of j by 1 in each iteration of the inner loop, effectively counting from 1 to 5
                j++;
            }

//After the inner while loop finishes, the control returns to the outer while loop and increments the value of i by 1 using i++.
// This moves to the next character in the string "abc".
            i++;


            //The outer while loop continues until all characters in the string letters
            // have been printed along with the numbers 1 to 5 for each character.
        }
// prints a newline after printing the entire pattern of characters and numbers,
// effectively moving to the next line for the next output.
        System.out.println();
    }
}

