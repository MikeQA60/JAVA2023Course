package Week10WrapperClassListSetCollections.Class10point25SetPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Video {
    public static void main(String[] args) {
        //unique word counter:
        //create a program that converts array of words and counts the number of unique words using a hashset
        //ignore punctuation and covert all words to lowercase for accurate counting

        String[] words = {"apple", "car", "apple", "orange", "blue", "pink", "java", "java", "java", "hello" };
        //new word counter = 0;
        //String encounteredWods = "";
        //apple => counter++; String
        //car => if(encounteredWords.contains("car")
        //counter++;  encounteredWords+="car";
        //applecarorange

        //String[] encounteredWords = new String[words.length]
        //ArrayList add

        //Arrays.asList(arrVar); => converts your array to A List
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println(uniqueWords); //[orange, apple, pink, java, blue, car, hello]


        System.out.println(uniqueWords.size()); //7


    }
}
