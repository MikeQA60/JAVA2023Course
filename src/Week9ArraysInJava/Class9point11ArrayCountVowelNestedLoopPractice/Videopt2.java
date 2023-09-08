package Week9ArraysInJava.Class9point11ArrayCountVowelNestedLoopPractice;

public class Videopt2 {
    public static void main(String[] args) {
        //create a string array of ai concepts
        //(e.g, "neural networks", "deep learning" , "reinforcement learning" , "artificial general intelligence"
        //print out the number of vowels in each concept in the array


        String[] aiArray = {"neural networks", "deep learning", "reinforcement learning", "artificial general intelligence"};

        for (int x = 0; x < aiArray.length; x++) {

            int counter = 0;
            String str = aiArray[x];

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'y'
                        || str.charAt(i) == 'u' || str.charAt(i) == 'i' || str.charAt(i) == 'o') {

                    counter++;
                }
            }
            System.out.println(str+ " has " + counter + " vowels "); //5 , 5, 8, 13
        }
    }
}
