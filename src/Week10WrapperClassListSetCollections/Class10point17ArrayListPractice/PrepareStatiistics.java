package Week10WrapperClassListSetCollections.Class10point17ArrayListPractice;

import java.util.ArrayList;

public class PrepareStatiistics {
    public static void main(String[] args) {
    }
    public static int[] calculateStatistics(ArrayList<Integer> scores) {
        // Define a method named calculateStatistics that takes an ArrayList of Integer objects (scores) as input.
        // The method calculates the average score, finds the highest score, and finds the lowest score.

        int[] result = new int[3]; // Initialize an array to store the calculated values.

        if (scores.isEmpty()) {
            // Check if the input ArrayList is empty.

            result[0] = 0; // Set average to 0.
            result[1] = 0; // Set highest score to 0.
            result[2] = 0; // Set lowest score to 0.

            return result; // Return the array with all values set to 0.
        }

        int sum = 0; // Initialize the sum of scores.
        int highest = Integer.MIN_VALUE; // Initialize the highest score.
        int lowest = Integer.MAX_VALUE; // Initialize the lowest score.

        for (Integer score : scores) {
            // Iterate through each score in the ArrayList.

            sum += score; // Add the score to the sum.

            if (score > highest) {
                highest = score; // Update the highest score if needed.
            }

            if (score < lowest) {
                lowest = score; // Update the lowest score if needed.
            }
        }

        int average = sum / scores.size(); // Calculate the average score.

        result[0] = average; // Set the average score in the result array.
        result[1] = highest; // Set the highest score in the result array.
        result[2] = lowest; // Set the lowest score in the result array.

        return result; // Return the array with calculated values.

    }
}
    //This code defines a method calculateStatistics that takes an ArrayList of Integer objects (scores) as input. It calculates the average score, finds the highest score, and finds the lowest score from the list. The provided main method demonstrates how to use the calculateStatistics method with an example input and prints the calculated average, highest, and lowest scores. If the input ArrayList is empty, the method sets all values in the result array to 0.



