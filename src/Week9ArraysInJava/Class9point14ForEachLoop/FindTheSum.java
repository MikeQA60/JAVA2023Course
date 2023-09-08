package Week9ArraysInJava.Class9point14ForEachLoop;

/*
Description: Write a method called calculateSum() that
takes an array of doubles and a double as input.
The method should loop through each element of the array and perform the following operation:
if the current element is less than the input double, subtract the current element from the running sum;
if the current element is greater than the input double, add the current element to the running sum.
 The method should then return the final sum.

Params: An array of doubles and a double.

Return: A double representing the calculated sum.

Example:

double[] nums = {1.2, 3.4, 5.6, 7.8, 9.0};

double num = 5.0;

calculateSum(nums, num); // Returns 17.8

double[] nums = {1.2, 3.4, 5.6, 7.8, 9.0};

double num = 2.3;

calculateSum(nums, num); // Returns 24.6

Note: If the input array is empty, return 0.0.

 */
public class FindTheSum {
    public static void main(String[] args) {

    }
    //. The calculateSum method takes an array of doubles and a double as input, and it calculates the sum
    // based on the conditions you described.
    public static double calculateSum(double[] nums, double num) {
        // Initialize a variable to keep track of the running sum
        double sum = 0.0;

        // Loop through each element in the array
        for (double value : nums) {
            // Check if the current element is less than the input double
            if (value < num) {
                // Subtract the current element from the running sum
                sum -= value;
            }
            // Check if the current element is greater than the input double
            else if (value > num) {
                // Add the current element to the running sum
                sum += value;
            }
            // If the current element is equal to the input double, do nothing
        }

        // Return the final calculated sum
        return sum;
    }
}
