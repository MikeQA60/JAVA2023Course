package Week10WrapperClassListSetCollections.Class10point2WrapperClassInitialization;

public class SimpleMath {
    public static void main(String[] args) {

    }

    // Define a method named 'calculate' that takes an Integer, a Double, and a Boolean as inputs
    // and returns a double value.
    public static double calculate(Integer num1, Double num2, Boolean answer) {


        // Check if the 'answer' Boolean variable is true.
        if (answer) {


            // If 'answer' is true, return the sum of 'num1' and 'num2'.
            return num1 + num2;

            // If 'answer' is false...
        } else {


            // Return the result of subtracting 'num2' from 'num1'.
            return num1 - num2;

        }
    }
}
