package Week9ArraysInJava.Class9point4HowToAcessAnElementInArray;

public class SimpleArrayCalculation {
    public static void main(String[] args) {

    }
    public static int calculateArray(int[] arr) {
        int length = arr.length; // Get the length of the array

        // Check if the length of the array is less than or equal to 1
        if (length <= 1) {
            return 1; // Return 1 if the size of the array is less than or equal to 1
        }
        // Calculate the sum of the first and last elements of the array

        int sum = arr[0] + arr[length - 1]; // Sum of the first and last elements

        // Return the calculated sum

        return sum;
    }
}
