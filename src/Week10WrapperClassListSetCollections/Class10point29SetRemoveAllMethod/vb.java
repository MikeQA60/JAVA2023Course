package Week10WrapperClassListSetCollections.Class10point29SetRemoveAllMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class vb {
    public static void main(String[] args) {

        Set<Double> nums = new HashSet<>(Arrays.asList(33.2,2.1,1.0,4.6));
        Set<Double> nums2 = new HashSet<>(Arrays.asList(2.2,1.1,0.0,44.6,2.1));

        System.out.println(nums); //[1.0, 4.6, 33.2, 2.1]
        //removeAll --> removes all matching elements between 2 collections
        nums.removeAll(nums2);
        System.out.println(nums); //[1.0, 4.6, 33.2]
        System.out.println(nums2); //[0.0, 2.2, 1.1, 44.6, 2.1]



    }
}
