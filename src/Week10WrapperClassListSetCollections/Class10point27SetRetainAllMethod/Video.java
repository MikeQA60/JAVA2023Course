package Week10WrapperClassListSetCollections.Class10point27SetRetainAllMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Video {
    public static void main(String[] args) {


        //Arrays.asList(arrVar)
        //int[] nums = {12,4,5,6,7
        //Arrays.asList(12,3,5,6,7)

        Set<Integer> nums1 = new HashSet<>(Arrays.asList(12, 3, 4, 5, 6, 7, 2));

        Set<Integer> num2 = new HashSet<>(Arrays.asList(2, 5));

        //containsAll(takesAnotherSet)
        // return true if set1Contains all elements in Set 2
        //return true if set1Contains all element in the Set 2

        boolean result = nums1.contains(num2);
        System.out.println(result); //false


        //conference
        //invited 5 speakers
        //Elon, Jeff, Steve, Michele
        //registered speakers

        //
        //Set<String> invitedSpeakers = new HashSet<>(Arrays.asList("Elon", "Jeff", "Steve" , "Michelle"));
        // Set<String> registeredSpeakers = new HashSet<>(Arrays.asList("Jeff, Michelle"));

        Set<String> invitedSpeakers = new HashSet<>();
        invitedSpeakers.add("Elon");
        invitedSpeakers.add("Steve");
        invitedSpeakers.add("Jeff");
        invitedSpeakers.add("Michelle");

        Set<String> registeredSpeakers = new HashSet<>();
        registeredSpeakers.add("Jeff");
        registeredSpeakers.add("Michelle");
        registeredSpeakers.add("Bill");

        if (invitedSpeakers.containsAll(registeredSpeakers)) {
            System.out.println("Ready to send all registered Speakers onboarding docs");

        } else {
            System.out.println("Someone is trying to sneak in ... please double check all registered speakers and remove the ones "
                    + "who are not invited");

            for (String var : registeredSpeakers) {
                if (!invitedSpeakers.contains(var)) {
                    System.out.println(var + " is trying to sneak in"); //bill is trying to sneak in
                    System.out.println("removing " + var); //removing bill
                    registeredSpeakers.remove(var); //michelle, jeff

                }
            }
        }

        System.out.println(registeredSpeakers);


        System.out.println("====================================================================");


        Set<String> invitedSpeakers2 = new HashSet<>();
        invitedSpeakers2.add("Elon");
        invitedSpeakers2.add("Steve");
        invitedSpeakers2.add("Jeff");
        invitedSpeakers2.add("Michelle");

        Set<String> registeredSpeakers2 = new HashSet<>();
        registeredSpeakers2.add("Jeff");
        registeredSpeakers2.add("Michelle");
        registeredSpeakers2.add("Bill");

        if (invitedSpeakers2.containsAll(registeredSpeakers2)) {
            System.out.println("2 - Ready to send all registered Speakers onboarding docs");
        }

        else {
            registeredSpeakers2.retainAll(invitedSpeakers2);
        }

        System.out.println(registeredSpeakers2); //[Michelle, Jeff]
    }
}
