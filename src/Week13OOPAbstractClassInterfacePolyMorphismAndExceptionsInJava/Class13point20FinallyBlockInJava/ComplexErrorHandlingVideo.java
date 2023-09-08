package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point20FinallyBlockInJava;

import java.util.ArrayList;

public class ComplexErrorHandlingVideo {
    public static void main(String[] args) {

    }
    public static ArrayList<Object> filterGreaterValues(Object[] arrayObj, double threshold) {
        // Create a new ArrayList to store the filtered results
        ArrayList<Object> filteredResult = new ArrayList<>();

        try {
            // Iterate through each object in the array
            for (Object obj : arrayObj) {
                // Check if the object can be cast to a Double and if its value is greater than the threshold
                if ((Double) obj > threshold) {
                    filteredResult.add(obj); // Add the object to the filtered result list
                } else {
                    filteredResult.add(0); // If the value is not greater than the threshold, add 0 to the list
                }
            }
            return filteredResult; // Return the filtered result list
        } catch (Exception e) {
            // Handle any exceptions that occur during the filtering process
            System.out.println("Filtered Result: " + filteredResult); // Print the current filtered result
            return null; // Return null to indicate an error occurred
        } finally {
            // Code in the finally block will be executed regardless of exceptions
            System.out.println("Resetting static result variable to default.");
        }
    }
}
