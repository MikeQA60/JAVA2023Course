package Week10WrapperClassListSetCollections.Class10point28SetAddAllMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Video {

    public static void main(String[] args) {

        Set<Double> nums = new HashSet<>(Arrays.asList(33.2,2.1,1.0,4.6));
        Set<Double> nums2 = new HashSet<>(Arrays.asList(2.2,1.1,0.0,44.6,2.1));

        System.out.println(nums);
        nums.addAll(nums2);
        System.out.println(nums2); //[0.0, 2.2, 1.1, 44.6] or [1.0, 4.6, 33.2, 2.1] &&[0.0, 2.2, 1.1, 44.6]



    }
}
