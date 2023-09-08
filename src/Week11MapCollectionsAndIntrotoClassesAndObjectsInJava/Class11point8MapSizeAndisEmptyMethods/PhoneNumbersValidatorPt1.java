package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point8MapSizeAndisEmptyMethods;

import java.util.Map;
import java.util.TreeMap;

public class PhoneNumbersValidatorPt1 {
    public static void main(String[] args) {

    }

    public static Map<String, String> validatePhoneNumbers(String phoneNumbers) {
        // Create a map to store valid phone numbers along with their original positions
        Map<String, String> validNumbers = new TreeMap<>();

        // Split the input string into an array of phone numbers
        String[] numbers = phoneNumbers.split(",");

        // Loop through each phone number and validate it
        for (int i = 0; i < numbers.length; i++) {
            // Get the current phone number
            String nums = numbers[i];
            // Remove dashes and trim whitespace from the phone number
            String number = nums.replace("-", "").trim();

            // Check if the phone number is valid (length is 10, starts with 0, and last digit is not 9)
            if (number.length() == 10 && number.charAt(0) == '0' && number.charAt(9) != '9') {
                // If valid, add it to the map along with its original position
                validNumbers.put(number, String.valueOf(i));
            }
        }

        // If no valid phone numbers were found, add an entry indicating an empty result
        if (validNumbers.isEmpty()) {
            validNumbers.put("0", "Empty");
        }

        // Return the map of valid phone numbers
        return validNumbers;
    }
}
