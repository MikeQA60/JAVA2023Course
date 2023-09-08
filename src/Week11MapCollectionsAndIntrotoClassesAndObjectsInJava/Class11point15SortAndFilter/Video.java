package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point15SortAndFilter;

import java.util.HashMap;
import java.util.Map;

public class Video {
    public static void main(String[] args) {

        //given a string(text) wrote a program
        //that prints the number of items each word occurs in the
        //text

        //ex: hello world hello askar askar adina
        //hello  = 2
        //world = 1
        //askar = 3
        //adina = 1

        String text = "hello world hello wedevx wedevx wedevx java";
        //hello = 2
        //world = 1
        //wedevx = 3
        //java = 1



        //1. split each word by space
        //2. I will have an array of String(word)
        //3. look through every element in string
        //4. there are 2 things I need to store - word and number of occurences
        //5. create a map of String keys and Integer values
        //6. put (word, 1 + 1)


        String[] words =  text.split(" ");

        Map<String, Integer> wordOccurences = new HashMap<>();
        for (String word : words) {

            Integer currentValue = 0;

            //check if the key exists
            if (wordOccurences.containsKey(word)) {



            //get method returns null if the word doesnt exist
             currentValue = wordOccurences.get(word);
        }


            wordOccurences.put(word,currentValue+1);

        }
        System.out.println(wordOccurences); //   {world=1, java=1, hello=1, wedevx=1}

        //{world=1, java=1, hello=2, wedevx=3}




    }
}
