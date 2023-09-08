package Week10WrapperClassListSetCollections.Class10point21SetRemoveMethod;

import java.util.HashSet;
import java.util.Set;

public class Video {
    public static void main(String[] args) {

        Set<Integer> ids = new HashSet<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);

        System.out.println(ids); //[1, 2, 3, 4]


      boolean result1 =   ids.remove(3);
      boolean result2 =   ids.remove(10);
        System.out.println(result1); // true
        System.out.println(result2); // false
        System.out.println(ids); //[1, 2, 4]

        if(!ids.remove(12)){
            System.out.println("The user doesnt exit"); //The user doesnt exit
        }

    }
}
