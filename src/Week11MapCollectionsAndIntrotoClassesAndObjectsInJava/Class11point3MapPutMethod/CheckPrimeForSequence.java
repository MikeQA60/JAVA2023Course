package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point3MapPutMethod;

import java.util.Map;
import java.util.TreeMap;

public class CheckPrimeForSequence {
    public static void main(String[] args) {

    }
    public static Map<Integer, Boolean> checkPrimeNumbers(int nums) {
        // Define a method called checkPrimeNumbers that takes an integer as input and returns a Map.

        // Create a TreeMap named result to store numbers and their corresponding prime check results.
        Map<Integer, Boolean> result = new TreeMap<>();

        // Check if the input number is greater than 0.
        if (nums > 0) {
            // Iterate through numbers from 1 to nums.
            for (int c = 1; c <= nums; c++) {
                // Initialize a counter to count the factors of the current number.
                int counter = 0;

                // Check for factors of the current number by iterating from 1 to nums.
                for (int i = 1; i <= nums; i++) {
                    if (c % i == 0) {
                        counter++; // Increment the counter if a factor is found.
                    }
                }

                // Check if the counter is equal to 2 (prime numbers have only 2 factors: 1 and themselves).
                result.put(c, counter == 2);
            }
        } else if (nums < 0) {
            // Handle negative numbers: Iterate through numbers from nums to -1.
            for (int i = nums; i <= -1; i++) {
                // Initialize a counter to count the factors of the current number.
                int counter = 0;

                // Check for factors of the current number by iterating from -1 to i (negative range).
                for (int j = -1; j >= i; j--) {
                    if (i % j == 0) {
                        counter++; // Increment the counter if a factor is found.
                    }
                }

                // Check if the counter is equal to 2 (prime numbers have only 2 factors: 1 and themselves).
                result.put(i, counter == 2);
            }
        }

        // Return the map containing numbers and their corresponding prime check results.
        return result;
    }
    //In summary, this code defines a method that takes an integer as input and determines whether
    // each number in a specified range is prime or not. It stores the numbers and their corresponding prime check
    // results in a map, where the number is the key and the result (true for prime, false for non-prime) is the value.
    // The method then returns the map containing numbers and their prime check results.
}
