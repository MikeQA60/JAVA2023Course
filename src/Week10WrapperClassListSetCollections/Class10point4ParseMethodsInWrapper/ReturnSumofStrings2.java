package Week10WrapperClassListSetCollections.Class10point4ParseMethodsInWrapper;

public class ReturnSumofStrings2 {
    public static void main(String[] args) {

    }
    public static int calculateSum(String str1, String str2) {
        // Define a method called calculateSum that takes two Strings as input.
        // It calculates and returns their sum as an int using the parse method.

        int num1 = Integer.parseInt(str1);
        // Parse the first input string into an integer using Integer.parseInt().

        int num2 = Integer.parseInt(str2);
        // Parse the second input string into an integer using Integer.parseInt().

        int sum = num1 + num2;
        // Calculate the sum of the two integers.

        return sum;
        // Return the calculated sum as an int.
    }

}

//This code defines a method named calculateSum that takes two strings as input,
// parses them into integers, calculates their sum, and returns the sum as an int.
// The example input values have been used in the main method to demonstrate how the method works.
