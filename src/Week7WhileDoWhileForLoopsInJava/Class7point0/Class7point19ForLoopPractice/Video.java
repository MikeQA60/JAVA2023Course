package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point19ForLoopPractice;

public class Video {


    //write a method that returns int number and takes a String input
    //the method should count the number of words in a String.


    public static void main(String[] args) {



        //save in integer
       int result =  countWords("Hello Superstars Java is so awesome"); // the whole code works because of the words so 6
        System.out.println(result);

    }                             //parameters
    public static int countWords(String str) {

        //str = "hello world superstars java"

        //if the string is not empty and there are no space -then there is only 1 word
        //otherwise if there 1 or more spaces it means the number of words will ve number space + 1
        //if there is 1 space that means there is just one word


        int spaceCounter = 0;

           for(int index= 0; index <= str.length()-1; index++) {
               //' ' = a spaces
               if (str.charAt(index) == ' ') {
                   spaceCounter++;

               }

           }

           return spaceCounter +1;
    }
}
