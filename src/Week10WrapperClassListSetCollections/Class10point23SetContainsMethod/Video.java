package Week10WrapperClassListSetCollections.Class10point23SetContainsMethod;

import java.util.HashSet;
import java.util.Set;

public class Video {

    public static void main(String[] args) {


        Set<String> usernames = new HashSet<>();
        usernames.add("elon@spacex.com");
        usernames.add("bill@microsoft.com");

        if (usernames.contains("bill@microsoft.com")){
            System.out.println("Contains"); //Contains
        }
    }
}
