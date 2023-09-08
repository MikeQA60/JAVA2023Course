package Week10WrapperClassListSetCollections.Class10point14ArrayListSetMethod;

/*
Description: Write a method called manipulateIntegers() that takes an ArrayList of Integers as input.
The method should double the value of even numbers and halve the value of odd numbers.
It should then remove any numbers that are divisible by 5 and return the updated list.



Params: An ArrayList of Integers.

Return: An ArrayList of Integers with the required manipulations.



Example:

manipulateIntegers([2,4,66,80,45,-90,42,0,8]) // Return [4, 8, 132, 22, 84, 16]




Ex1

Input: 15 -3 7 92 0 -17 63 42 5

Return: [7, -1, 3, 184, -8, 31, 84, 2]


Ex2

Input: 10 23 -5 42 7 18 -12 36 0

Return: [11, -2, 84, 3, 36, -24, 72]


Ex3

Input: -8 15 6 31 -4 27 10 52 19

Return: [-16, 7, 12, -8, 13, 104, 9]
 */
import java.util.ArrayList;
import java.util.List;

public class ManipulateList {
    public static void main(String[] args) {

    }
    public static List<Integer> manipulateIntegers(List<Integer> nums) {
        // Define a method called manipulateIntegers that takes a List of integers (nums) as input.
        // The method returns a new List of integers after performing certain manipulations.

        List<Integer> updatedList = new ArrayList<>();
        // Create a new List of integers named 'updatedList' to store the manipulated numbers.

        for (int number : nums) {
            // Start a loop that iterates through each element (number) in the input list (nums).

            int manipulatedNumber; // Declare a variable to store the manipulated number.

            if (number % 2 == 0) {
                manipulatedNumber = number * 2;
                // If the current number is even, double it and assign the result to manipulatedNumber.
            } else {
                manipulatedNumber = number / 2;
                // If the current number is odd, divide it by 2 and assign the result to manipulatedNumber.
            }

            if (manipulatedNumber % 5 != 0) {
                updatedList.add(manipulatedNumber);
                // Check if the manipulated number is not divisible by 5.
                // If true, add the manipulated number to the 'updatedList'.
            }
        }

        return updatedList;
        // Return the 'updatedList' containing manipulated numbers based on the specified conditions.
    }
   // In summary, this code defines a method named manipulateIntegers that takes a List of integers (nums) as input.
    // It iterates through each number in the list, performs manipulations based on whether the number is even or odd,
    // and adds the manipulated number to the updatedList if it's not divisible by 5. The result is a new list
    // containing manipulated numbers.
}
