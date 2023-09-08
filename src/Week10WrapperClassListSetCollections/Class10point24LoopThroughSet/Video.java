package Week10WrapperClassListSetCollections.Class10point24LoopThroughSet;

import java.util.HashSet;
import java.util.Set;

public class Video {
    public static void main(String[] args) {
        // The starting point of the program, where the execution begins.

        Set<String> usernames = new HashSet<>();
        // Create a new Set (a collection of unique elements) to store usernames (email addresses).

        usernames.add("abc@apple.com");
        // Add the username "abc@apple.com" to the usernames Set.

        usernames.add("bcd@google.com");
        // Add the username "bcd@google.com" to the usernames Set.

        usernames.add("oab@amazon.com");
        // Add the username "oab@amazon.com" to the usernames Set.

        for (String var : usernames) {
            // Start a loop that iterates through each element (username) in the usernames Set.

            System.out.println(var);
            // Print (output) the current username to the console.
            //oab@amazon.com, bcd@google.com, abc@apple.com
        }
    }
}
