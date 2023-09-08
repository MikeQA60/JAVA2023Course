package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point11WordCounter;

import java.util.Scanner;

public class WordCounter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");

        String enterSentence = sc.nextLine();
        int wordCounter = 0;
        int counter = 0;


        while (counter <= enterSentence.length() -1) {

            if (enterSentence.charAt(counter) == ' ') {

                wordCounter++;
                counter++;

            }

            System.out.println("Number of words: " + (wordCounter + 1));
        }
    }
}
