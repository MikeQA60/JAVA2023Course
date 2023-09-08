package Week9ArraysInJava.Class9point4HowToAcessAnElementInArray;

public class PowerOfTwoArray {
    public static void main(String[] args) {


    }
    //This line defines a method named powerOfTwo that takes an integer array arr as input.
    public static void powerOfTwo(int[] arr) {
        // Check if the input array has less than or equal to 2 elements
        if (arr.length <= 2) {
            // If there's not enough data, print this message
            System.out.println("Not enough data");

           // If the array length is greater than 2, the code proceeds to this block.
        } else {
            // If there are more than 2 elements in the array
            // Check if the square of the first element is greater than or equal to the sum of the second and third elements
            if (arr[0] * arr[0] >= arr[1] + arr[2]) {
                // If the condition is met, print this message
                System.out.println("First is the greatest");
            } else {
                // If the condition is not met, print this message
                System.out.println("There is no power in first");
            }
        }
    }
}
