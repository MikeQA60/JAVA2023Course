package Week9ArraysInJava.Class9point14ForEachLoop;

public class Videopt2 {
    public static void main(String[] args) {


        int[] nums = {12,455,2,33,23};

        //limitation of for each loop
        // you can only start from the beginning and go till the end of
        //collection
        //if you need to use the indexes to the proble
        //then you need to use regualr for loop.


        for (int num : nums) {

            System.out.println(num); //12,455,33,23
        }

        //start
        int smallest = nums[0];

        for (int num : nums) {

            if(smallest>num) {
                smallest = num;
            }
        }

        System.out.println(smallest);
    }
}
