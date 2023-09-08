package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point18PrintOutExceptionMessageAndPrintStackTraceInJava;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class NoMoreElementspt1 {
    public static void main(String[] args) {

    }
    // This method takes a Scanner object as a parameter and attempts to read the next element from it.
    public static String readNextElement(Scanner scanner) {
        try {
            // Try to read the next element from the scanner and return it as a string.
            String element = scanner.next();
            return element;
        } catch (NoSuchElementException e) {
            // If a NoSuchElementException is caught, handle the exception.
            // Print an error message indicating that there are no more elements to read.
            System.out.println("Error: No more elements to read.");
            // Return an empty string to indicate that no more elements are available.
            return "";
        }
    }

}
