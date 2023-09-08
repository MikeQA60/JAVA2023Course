package Week10WrapperClassListSetCollections.Class10point20SetAddMethod;

import java.util.HashSet;
import java.util.Set;

public class Video {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        //public boolean add(Object o);
        names.add("Elon");
        names.add("Steve");

        //unordered set
        System.out.println(names);  //[Steve, Elon]
    }
}
