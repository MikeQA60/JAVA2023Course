package Week10WrapperClassListSetCollections.Class10point23SetContainsMethod;

import java.util.HashSet;
import java.util.Set;

public class Videopt2 {
    public static void main(String[] args) {


        Set<String> usernames = new HashSet<>();
        usernames.add("elon@spacex.com");
        usernames.add("bill@microsoft.com");

        if (usernames.contains("alexa@microsoft.com")) {
            System.out.println("Contains"); //NA since alexa is not in the add

        }
        }
    }