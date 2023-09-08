package Week9ArraysInJava.Class9point14ForEachLoop;

public class Video {
    public static void main(String[] args) {

        int[] nums = {12,455,33,23};

        //limitation of for each loop
        // you can only start from the beginning and go till the end of
        //collection
        //if you need to use the indexes to the proble
        //then you need to use regualr for loop.


        for (int num : nums) {

            System.out.println(num); //12,455,33,23
        }

    }
}
