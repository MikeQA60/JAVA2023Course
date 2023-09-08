package Week9ArraysInJava.Class9point13ArraysClassMethods;

import java.util.Arrays;

public class Videopt3 {
    public static void main(String[] args) {
        int[] numbers = {5,3,8,1,2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [1,2,3,5,8]


        //fill method
        int[] numbers2 = new int[5];
        Arrays.fill(numbers, 10);
        System.out.println(Arrays.toString(numbers)); //[10,10,10,10,10]

        int[] numbers4 = {1,2,3,4,5};
        int[] numbers5 = {1,2,3,4,5};


        //equal method
        boolean areEqual = Arrays.equals(numbers4, numbers5);
        System.out.println(areEqual); //true


    }
}
