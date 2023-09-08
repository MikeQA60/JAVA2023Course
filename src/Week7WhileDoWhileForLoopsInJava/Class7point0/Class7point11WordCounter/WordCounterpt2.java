package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point11WordCounter;

//import java.util.Locale;
import java.util.Scanner;

public class WordCounterpt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");

        String enterSentence = sc.nextLine();

        enterSentence = enterSentence.trim();

        int numberOfWords = 1; //first space means the end of first owrd

        int index = 0;

        while (index <= enterSentence.length()-1){
            if (enterSentence.charAt(index) == ' '){
                numberOfWords++;
            }
            index++;
        }

        System.out.println("Number of words: " + numberOfWords);
    }
}
