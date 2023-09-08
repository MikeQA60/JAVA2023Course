package Week9ArraysInJava.Class9point4HowToAcessAnElementInArray;

public class ConditionalSubtraction {
    public static void main(String[] args) {

    }
    public static int subtractFromArray(int[] arr) {
        // Check if the array length is 1 or less
        if (arr.length <= 1) {
            return 777; // If so, return 777
        }

        // Store the first element of the array in a variable named 'first'
        int first = arr[0];

        // Store the second element of the array in a variable named 'second'
        int second = arr[1];

        // Compare the values of 'first' and 'second'
        if (first > second) {
            return first - second; // If 'first' is greater, return the subtraction result
        } else if (second > first) {
            return second - first; // If 'second' is greater, return the subtraction result
        } else {
            return 777; // If they are equal, return 777
        }
    }
}
