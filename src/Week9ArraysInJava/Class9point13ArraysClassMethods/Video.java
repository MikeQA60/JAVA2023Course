package Week9ArraysInJava.Class9point13ArraysClassMethods;

import java.util.Arrays;

public class Video {
    public static void main(String[] args) {

        //arays.CopyOf()


        int[] nums = {12,56,11,1,245};

        int[] nums2 = Arrays.copyOf(nums,3);

        System.out.println(Arrays.toString(nums2)); //12,56,11

        String[] fruits = {"banana", "apple", "pineapple", "watermelon"};
        String[] copyFruits = Arrays.copyOf(fruits,2);

        System.out.println(Arrays.toString(copyFruits)); //banana and apple
    }
}
