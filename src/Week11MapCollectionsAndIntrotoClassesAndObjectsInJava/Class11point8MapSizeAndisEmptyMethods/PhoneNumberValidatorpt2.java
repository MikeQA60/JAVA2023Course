package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point8MapSizeAndisEmptyMethods;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberValidatorpt2 {
    public static void main(String[] args) {

    }
    public static Map<String, String> validatePhoneNumbers(String input) {
        // Initialize a map to store valid phone numbers
        Map<String, String> resultMap = new HashMap<>();

        // Split the input by comma to get individual phone numbers
        String[] phoneNumbers = input.split(",");

        // Iterate through the phone numbers
        for (int i = 0; i < phoneNumbers.length; i++) {
            // Get the original phone number and remove extra spaces
            String originalPhoneNumber = phoneNumbers[i].trim();

            // Remove all non-digit characters from the phone number
            String phoneNumber = originalPhoneNumber.replaceAll("[^0-9]", "");

            // Check if the cleaned phone number is valid
            if (isValidPhoneNumber(phoneNumber)) {
                // Store the original phone number as the key and its index as the value
                resultMap.put(originalPhoneNumber, String.valueOf(i));
            }
        }

        // If no valid phone numbers were found, add a default entry to the map
        if (resultMap.isEmpty()) {
            resultMap.put("0", "EMPTY");
        }

        return resultMap;
    }

    // Check if a phone number is valid
    private static boolean isValidPhoneNumber(String phoneNumber) {
        // A valid phone number should have 10 digits, start with '0', and not end with '9'
        return phoneNumber.length() == 10 && phoneNumber.startsWith("0") && phoneNumber.charAt(9) != '9';
    }
}
