package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point17TryCatchPractice;

public class ZeroDivision {
    public static void main(String[] args) {

    }

    public static int divideNums(int a, int b) {
        // Start of the method definition: a method named "divideNums" that takes two int parameters a and b

        try {
            // Start of the try block: this is where the code that might throw an exception is placed

            int result = a / b;
            // This line calculates the result of dividing a by b and assigns it to the variable "result"

            return result;
            // If the division operation is successful (no exception is thrown), the "result" is returned

        } catch (ArithmeticException e) {
            // Start of the catch block: this block is executed if an ArithmeticException is caught

            System.out.println("Error: Division by zero occurred.");
            // This line prints an error message indicating that a division by zero occurred

            return 0;
            // Since division by zero occurred, returning 0 as a default value

        }
        // End of the try-catch block

    }
}

  //  In summary, this code defines a method called divideNums that takes two integer parameters a and b.
//  Inside the method, there's a try-catch block to handle the division operation. If the division is successful,
//  the result is returned. If a division by zero occurs, an ArithmeticException is caught, an error message is printed,
//  and the method returns 0 as a default value.