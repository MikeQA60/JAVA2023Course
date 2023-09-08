package Week10WrapperClassListSetCollections.Class10point20SetAddMethod;

import java.util.HashSet;
import java.util.Set;

public class Videopt3 {
    public static void main(String[] args) {

        Set<String> usernames = new HashSet<>();
        usernames.add("elon@spacex.com");
        usernames.add("bill@microsoft.com");


    if(!usernames.add("elon@spacex.com")) {
            System.out.println("The username is already taken"); //The username is already taken

    }
    }
}
