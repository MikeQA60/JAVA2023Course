package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point21ThrowVsThrowsKeyWordInJava;

public class ThrowVsThrowsPt1 {
    class Calculator {
        // Method to perform division of two numbers
        public int divide(int dividend, int divisor) throws ArithmeticException {
            if (divisor == 0) {
                // Using the "throw" keyword to throw an ArithmeticException with a specific message
                throw new ArithmeticException("Division by zero is not allowed");
            }
            // Return the result of division
            return dividend / divisor;
        }
    }
}
