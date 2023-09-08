package Week9ArraysInJava.Class9point13ArraysClassMethods;

import java.util.Arrays;

public class Videopt2 {

    public static void main(String[] args) {

        String[] fruits = {"banana", "apple", "pineapple", "watermelon"};
        String[] copyFruits = Arrays.copyOf(fruits,2);

        int[] numbers = {5,3,8,1,2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [1,2,3,5,8]


        //sort method
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits)); //"banana", "apple", "pineapple", "watermelon"
    }
}
