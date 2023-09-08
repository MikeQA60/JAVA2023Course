package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point19MultipleCatchBlocksInJavaExceptions;

public class ObjectInMethodPt1 {
    public static void main(String[] args) {

    }

    public static void performObjectOperations(Object obj) {
        try {
            // Attempt to perform division on the integer value of obj
            int result = (Integer) obj / 0;
            // Print the result of division
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catch block for ArithmeticException
            System.out.println("Error: ArithmeticException - Division by zero.");
        } catch (NullPointerException e) {
            // Catch block for NullPointerException
            System.out.println("Error: NullPointerException - Object is null.");
        } catch (ClassCastException e) {
            // Catch block for ClassCastException
            System.out.println("Error: ClassCastException - Invalid type casting.");
        }
    }
}

//    public static void performObjectOperations(Object obj) {: This is the method signature. It declares a method named performObjectOperations that takes an Object parameter named obj.
//
//        try {: The beginning of the try block. This block contains the code that might throw exceptions.
//
//            int result = (Integer) obj / 0;: An attempt to perform division by zero on the integer value of the obj. It casts the obj to an Integer and then tries to divide it by zero.
//
//                    System.out.println("Result of division: " + result);: If the division is successful, it prints the result of the division.
//
//        } catch (ArithmeticException e) {: This is the start of the first catch block, which handles the ArithmeticException that might occur if division by zero is attempted.
//
//                System.out.println("Error: ArithmeticException - Division by zero.");: In case of an ArithmeticException, this line prints an error message indicating that division by zero occurred.
//
//        } catch (NullPointerException e) {: This is the start of the second catch block, which handles the NullPointerException that might occur if obj is null.
//
//                System.out.println("Error: NullPointerException - Object is null.");: In case of a NullPointerException, this line prints an error message indicating that the object is null.
//
//        } catch (ClassCastException e) {: This is the start of the third catch block, which handles the ClassCastException that might occur if invalid type casting is attempted.
//
//                System.out.println("Error: ClassCastException - Invalid type casting.");: In case of a ClassCastException, this line prints an error message indicating that the type casting is invalid.
//
//        }: The end of the catch block.
//
//                So, the code tries to perform division by zero and handles potential exceptions using different catch blocks for different types of exceptions.
//}
