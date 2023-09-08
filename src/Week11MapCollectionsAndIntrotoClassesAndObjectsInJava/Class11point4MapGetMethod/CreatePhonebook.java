package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point4MapGetMethod;

import java.util.*;

public class CreatePhonebook {
    public static void main(String[] args) {

    }
    // Method to create a contact list mapping names to phone numbers
    public static Map<String, String> createContactList(String names, String phoneNumbers) {
        // Initialize a LinkedHashMap to maintain insertion order of contacts
        Map<String, String> contactMap = new LinkedHashMap<>();

        // Split input strings into arrays using whitespace as separator

        //names: This is a variable that holds a string. It seems like this string contains multiple names separated
        // by whitespace characters.
        //split("\\s+"): The split method is a method available on the String class in Java.
        // It's used to split a string into an array of substrings based on a specified delimiter.
        // In this case, the delimiter is "\\s+", which is a regular expression that matches one or
        // more whitespace characters (spaces, tabs, etc.).
        //String[] nameArray = ...: The result of the split method is an array of strings,
        // where each element of the array corresponds to a portion of the original string that was separated by the delimiter.
        // In this line, the result of the split operation is assigned to the nameArray variable, which is declared as an array of strings.
        String[] nameArray = names.split("\\s+");
        String[] phoneNumberArray = phoneNumbers.split("\\s+");

        // Get counts of names and phone numbers
        int namesCount = nameArray.length;
        int phoneNumbersCount = phoneNumberArray.length;

        // Remove duplicate names and phone numbers by using Sets
        Set<String> uniqueNames = new LinkedHashSet<>(Arrays.asList(nameArray));
        Set<String> uniquePhoneNumbers = new LinkedHashSet<>(Arrays.asList(phoneNumberArray));

        // Create iterators for unique names and phone numbers

        // This line creates an Iterator for the set of unique names (uniqueNames).
        // The iterator() method is called on the set, which returns an iterator that can be used
        // to sequentially access the elements in the set.
        Iterator<String> nameIterator = uniqueNames.iterator();

        //: This line creates an Iterator for the set of unique phone numbers (uniquePhoneNumbers).
        // Similarly, the iterator() method is called on the set of phone numbers to create an iterator for iterating
        // through the phone numbers.
        Iterator<String> phoneNumberIterator = uniquePhoneNumbers.iterator();

        // Populate contact map with unique names and phone numbers
        while (nameIterator.hasNext()) {
            String name = nameIterator.next();

            if (phoneNumberIterator.hasNext()) {
                String phoneNumber = phoneNumberIterator.next();
                contactMap.put(name, phoneNumber);
            } else {
                // If no more phone numbers, map name to "-1"
                contactMap.put(name, "-1");
            }
        }

        // Handle extra phone numbers and assign them to "unknownX" names
        int extraPhoneNumbers = phoneNumbersCount - namesCount;
        int unknownCounter = 1;

//This line retrieves the next available phone number from the phoneNumberIterator.
// The iterator iterates over the set of unique phone numbers.
        while (extraPhoneNumbers > 0 && phoneNumberIterator.hasNext()) {



            //: This line retrieves the next available phone number from the phoneNumberIterator.
            // The iterator iterates over the set of unique phone numbers.
            String phoneNumber = phoneNumberIterator.next();


//: This line creates a unique name for the phone number. It combines the string "unknown" with the value of unknownCounter.
// This ensures that each additional phone number gets a unique "unknown" name.
            String unknownName = "unknown" + unknownCounter;

            //: This line adds a new entry to the contactMap using the unknownName as the key and the retrieved phoneNumber
            // as the value. This essentially associates the unknown name with the extra phone number.
            contactMap.put(unknownName, phoneNumber);

            // This increments the unknownCounter by 1, ensuring that the next unknown name will have a different number.
            unknownCounter++;

            //: This decrements the extraPhoneNumbers by 1, indicating that one extra phone number has been assigned to an unknown name.
            extraPhoneNumbers--;
        }

        return contactMap; // Return the created contact map
    }


    //This code defines a method createContactList that takes two input strings: names and phoneNumbers, and returns a map that associates names with phone numbers. It uses a LinkedHashMap to maintain the order of contacts, and employs Sets to ensure uniqueness of both names and phone numbers. The main method demonstrates how to call this method with sample names and phone numbers and then prints the resulting contact list.
}
