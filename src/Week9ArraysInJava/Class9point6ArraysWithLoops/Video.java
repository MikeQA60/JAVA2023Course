package Week9ArraysInJava.Class9point6ArraysWithLoops;

public class Video {
    public static void main(String[] args) {


        int[] nums = {1,5,7,12,44,77};

        //nums
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);

      //the variable of an array offer
        //a property called length
        //length in array is property, not a metho
        //so it doesnt have a ()

        System.out.println("==========");
        System.out.println(nums.length);
        System.out.println("==============");
       // for (int i =0; i<6; i++){
            for (int i = 0; i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
