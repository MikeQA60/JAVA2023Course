package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point21ThrowVsThrowsKeyWordInJava;

public class AgeIdentifierPt1 {
    //public static void main(String[] args) {

    }
    class AgeVerifier {
        // Defining a static method named verifyAge that takes an integer parameter 'age'
        public static void verifyAge(int age) {
            // Checking if the age is negative
            if (age < 0) {
                // Throwing an IllegalArgumentException with an error message if age is negative
                throw new IllegalArgumentException("Age cannot be negative");
            }
            // Checking if the age is less than 18
            else if (age < 18) {
                // Throwing an IllegalArgumentException with an error message if age is less than 18
                throw new IllegalArgumentException("Age must be at least 18");
            }
            // If age passes both checks
            else {
                // Printing a success message if age verification is successful
                System.out.println("Age verification successful");
            }
        }
    }
