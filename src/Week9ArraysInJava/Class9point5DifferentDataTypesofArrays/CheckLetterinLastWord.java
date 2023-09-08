package Week9ArraysInJava.Class9point5DifferentDataTypesofArrays;

import java.util.Locale;

public class CheckLetterinLastWord {
    public static void main(String[] args) {

    }
    public static boolean checkLetter(String[] input, char letter){

       // This line starts an if statement to check whether the input array is empty or null
        if (input.length==0 || input == null){

            //If the input array is empty or null, the method immediately returns false.
            return false;
        }
        //This line declares a new String variable named lastWord and assigns it the value
        // of the last element in the input array, converted to lowercase.
        String lastWord = input[input.length-1].toLowerCase();

        //This line starts an if statement to check if the lastWord contains the lowercase version of the given letter.
        if(lastWord.contains(Character.toLowerCase(letter)+"")){

            //If the condition in the previous line is true, the method returns true.
            return true;

            //If the condition in line 5 is false, the code inside this block will be executed.
        }else{

            //This line returns false, indicating that the lastWord does not contain the lowercase version of the given letter.
            return false;
        }
    }
}
