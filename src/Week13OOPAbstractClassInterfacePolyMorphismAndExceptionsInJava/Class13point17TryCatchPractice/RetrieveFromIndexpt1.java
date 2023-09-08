package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point17TryCatchPractice;

public class RetrieveFromIndexpt1 {
    public static void main(String[] args) {

    }
    // This method takes an array of booleans and an index as parameters.
// It attempts to retrieve the element at the specified index from the array.
// If the index is out of bounds, it catches the ArrayIndexOutOfBoundsException.
    public static boolean retrieveElement(boolean[] array, int index) {
        try {
            // Try to retrieve and return the element at the specified index.
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            // If an ArrayIndexOutOfBoundsException is caught, handle the exception.
            // Print an error message indicating that the index is out of bounds.
            System.out.println("Error: Index out of bounds.");
            // Return false to indicate that an error occurred.
            return false;
        }
    }
}

/*
public static boolean retrieveElement(boolean[] array, int index) {: This line declares the retrieveElement method,
which takes an array of booleans (array) and an integer index (index) as parameters and returns a boolean.

try {: This is the beginning of a try block, where the code inside it is attempted to be executed.

return array[index];: Inside the try block, this line attempts to retrieve and return the boolean element at
the specified index from the given array.

} catch (ArrayIndexOutOfBoundsException e) {: This line marks the beginning of a catch block,
 which is executed if an ArrayIndexOutOfBoundsException is thrown in the try block.

System.out.println("Error: Index out of bounds.");: Inside the catch block, this line prints an error message
indicating that the index is out of bounds.

return false;: This line returns false to indicate that an error occurred due to the index being out of bounds.

So, the method tries to retrieve an element from the array at the specified index.
If the index is within bounds, it returns the element. If the index is out of bounds,
it catches the exception, prints an error message, and returns false.
 */
