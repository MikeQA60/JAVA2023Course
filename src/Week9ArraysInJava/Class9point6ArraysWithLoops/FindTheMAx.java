package Week9ArraysInJava.Class9point6ArraysWithLoops;

public class FindTheMAx {
    public static void main(String[] args) {

    }
    //The method findMax takes an integer array (array) as a parameter.
    //It declares a variable max to store the maximum value.
    public static int findMax(int [] array){
        int max; // Declare a variable to store the maximum value

        // Check if the array is empty // if so, it returns 0 (since there is no maximum value in an empty array
        if (array.length == 0) {
            return 0; // Return 0 if the array is empty
        } else {
            // Initialize the max variable with the first element of the array
            max = array[0];

            // Iterate through the array to find the maximum value
            for (int i = 1; i < array.length; i++) {
                // Compare the current element with the max value
                if (max < array[i]) {
                    max = array[i]; // Update max if the current element is greater
                }
            }
            return max; // Return the maximum value
        }
    }
}
