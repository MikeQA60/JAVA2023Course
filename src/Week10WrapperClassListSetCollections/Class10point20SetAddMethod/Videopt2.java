package Week10WrapperClassListSetCollections.Class10point20SetAddMethod;

import java.util.HashSet;
import java.util.Set;

public class Videopt2 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        //public boolean add(Object o);
       boolean result1 =  names.add("Elon");
        boolean result2 = names.add("Steve");


        System.out.println(result1); //true
        System.out.println(result2); //true

        boolean result3 = names.add("Elon");
        System.out.println(result3); //false
   //command d to duplicate
        //unordered set
        System.out.println(names);  //[Steve, Elon]
    }
}

