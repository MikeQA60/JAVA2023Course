package Week9ArraysInJava.Class9point9ArrayFindTheLargestValue;

public class Video {
    public static void main(String[] args) {
        //find the largest number in an array

        int[] nums = {33,55,10,5,77,22,10};

        int right = nums[1];
        int left = nums[0];

        for(int i = 0; i < nums.length; i++) {

            if(left>right) {
                right = nums[i];
            }
            else {
                left=right;
                right=nums[i];

            //if(nums[i]>nums[i+1]) {

                //i:0  if(33>55)
                //i:i if (55>10)
                //i:2 if 1(0>5)
                //i:3 if (5>77)
                //i:4 if (77>22)
                //i:5 if (22>10)
            }

            //i:0  if(33>55)
            //i:i if (55>10)
            //i:2 if 1(0>5)
            //i:3 if (5>77)
            //i:4 if (77>22)
            //i:5 if (22>10)
        }
        System.out.println(left);
    }
}
