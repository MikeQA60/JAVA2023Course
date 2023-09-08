package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point11WordCounter;

public class CounttheOccurencesofASpecificCharacter {
    public static void main(String[] args) {

    }

    public static int countCharOccurrences(String str, char ch) {

        //starting point
        int index = 0;
//starting poing
        int counter = 0;

        //counter less length of word
        while (index < str.length()) {

            //if  // Get the character at the current index
            if (str.charAt(index) == ch) {

                //increment both times
                counter++;
                index++;

            }
            index++;
        }
            if (counter == 0) {
                return -1;
            }
            return counter;

        }
}
