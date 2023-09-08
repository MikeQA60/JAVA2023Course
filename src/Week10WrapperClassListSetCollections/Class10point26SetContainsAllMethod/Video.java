package Week10WrapperClassListSetCollections.Class10point26SetContainsAllMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Video {
    public static void main(String[] args) {

        //Arrays.asList(arrVar)
        //int[] nums = {12,4,5,6,7
        //Arrays.asList(12,3,5,6,7)

        Set<Integer> nums1 = new HashSet<>(Arrays.asList(12,3,4,5,6,7,2));

        Set<Integer> num2 = new HashSet<>(Arrays.asList(2,5));

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
        invitedSpeakers .add("Elon");
        invitedSpeakers .add("Steve");
        invitedSpeakers .add("Jeff");
        invitedSpeakers .add("Michelle");

        Set<String> registeredSpeakers = new HashSet<>();
        registeredSpeakers.add("Jeff");
        registeredSpeakers.add("Michelle");
        registeredSpeakers.add("Bill");

        if(invitedSpeakers.containsAll(registeredSpeakers)){
            System.out.println("Ready to send all registered Speakers onboarding docs");

        }

        else {
            System.out.println("Someone is trying to sneak in ... please double check all registered speakers and remove the ones "
                    + "who are not invited");
        }



    }
}

