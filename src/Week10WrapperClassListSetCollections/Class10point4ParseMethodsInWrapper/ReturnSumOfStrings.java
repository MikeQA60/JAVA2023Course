package Week10WrapperClassListSetCollections.Class10point4ParseMethodsInWrapper;

public class ReturnSumOfStrings {
    public static void main(String[] args) {

    }

    public static int sumEvenNumbers(String input) {
        // Define a method called sumEvenNumbers that takes a String as input.
        // The method calculates and returns the sum of even numbers in the input string.

        int sum = 0;
        // Initialize a variable 'sum' to keep track of the sum of even numbers.

        if (input.isEmpty()) {
            // Check if the input string is empty.

            return sum;
            // If the input is empty, directly return 0 as there are no numbers to sum.
        }

        String[] numbers = input.split(" ");
        // Split the input string into an array of substrings using space as the delimiter.

        for (String number : numbers) {
            // Start a loop that iterates through each substring (number) in the 'numbers' array.

            int num = Integer.parseInt(number);
            // Convert the current substring (number) into an integer using Integer.parseInt().

            if (num % 2 == 0) {
                // Check if the current number is even by checking if its remainder when divided by 2 is 0.

                sum += num;
                // If the current number is even, add it to the 'sum'.
            }
        }

        return sum;
        // Return the calculated sum of even numbers.
    }
}

//In summary, this code defines a method named sumEvenNumbers that takes a String as input.
// It processes the input string to find even numbers (by converting them to integers) and calculates their sum
// . The sum is returned as an int value.
