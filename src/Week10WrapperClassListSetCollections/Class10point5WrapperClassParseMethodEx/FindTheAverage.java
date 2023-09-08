package Week10WrapperClassListSetCollections.Class10point5WrapperClassParseMethodEx;

/*
Description: Write a method called calculateAverage()
that takes an array of integers as input and returns the average value of the array as a double.

Params: An array of integers.

Return: A double representing the average value of the array.

Example:

calculateAverage([1, 2, 3, 4, 5]) // Returns 3.0

calculateAverage([10, 25]) // Returns 17.5

calculateAverage([-5, 0, 5]) // Returns 0.0

Note: Use wrapper methods to perform arithmetic operations, and do not convert the array elements to primitive types.
 */
public class FindTheAverage {

    public static double calculateAverage(Integer[] nums) {
        // Define a method called calculateAverage that takes an array of Integers as input.
        // It calculates the average of the numbers in the array and returns the result as a double.

        int sum = 0;
        // Initialize a variable 'sum' to keep track of the sum of numbers in the array.

        for (int num : nums) {
            // Start a loop that iterates through each element (num) in the 'nums' array.

            sum += num;
            // Add the current number (num) to the 'sum'.
        }

        double average = (double) sum / nums.length;
        // Calculate the average by dividing the sum by the length of the array.
        // The (double) cast is used to ensure floating-point division.

        return average;
        // Return the calculated average as a double.
    }

}
/*
In summary, this code defines a method named calculateAverage that takes an array of Integer
 objects as input. It calculates the sum of all the numbers in the array and then divides
 that sum by the number of elements in the array to calculate the average. The average is returned as a double value.
 */
