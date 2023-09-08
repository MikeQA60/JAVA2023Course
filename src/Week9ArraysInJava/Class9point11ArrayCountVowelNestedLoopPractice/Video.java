package Week9ArraysInJava.Class9point11ArrayCountVowelNestedLoopPractice;

public class Video {
    public static void main(String[] args) {

        //create a string array of ai concepts
        //(e.g, "neural networks", "deep learning" , "reinforcement learning" ,
        //print out the number of vowels in each concept in the array


        int counter = 0;
        String str = "neural networks";

        for(int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'y'
            || str.charAt(i) == 'u' || str.charAt(i) == 'i' || str.charAt(i) == 'o'){

                counter++;
            }
        }
        System.out.println(counter); //5
    }
}
