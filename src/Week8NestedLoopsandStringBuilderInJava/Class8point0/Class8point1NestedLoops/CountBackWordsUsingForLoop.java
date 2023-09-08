package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point1NestedLoops;

public class CountBackWordsUsingForLoop {
    public static void main(String[] args) {

    }                 //define method           // that takes an integer parameter input
    public static void printBackwards(int input) {
        // Check if the input is less than or equal to 0
        if (input <= 0) {

            // If input is less than or equal to 0, print an error message
            System.out.println("Error! Number n can't be less than 1");

//if the condition in the if statement is false (input is greater than 0),
// the code inside the else block will be executed.
        } else {
            // If input is greater than 0, execute the following block of code

            // Outer loop: Iterate from 'input' down to 1
            for (int i = input; i >= 1; i--) {

                // Inner loop: Iterate from 'i' down to 1
                for (int j = i; j >= 1; j--) {

                    // Print the value of 'j' followed by a space
                    System.out.print(j + " ");
                }
                // After the inner loop finishes, print a newline to move to the next line

                System.out.println();
            }
        }
    }
}
