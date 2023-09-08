package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point24StringSubtstring;

public class ExtractSubstringBetween2words {
    public static void main(String[] args) {

    }
    public static String extractBetween2Words(String sentence, String startingWord, String endingWord){

        //finding the end of starting word

        int startingWordIndex = sentence.indexOf(startingWord);

        //index plus length a
        int startingWordLength = startingWord.length();

        //add them up
        int firstWordEnd = startingWordIndex + startingWordLength;

        //get to the end of the word
        int endingWordIndex = sentence.indexOf(endingWord);

        //if statement v(for cases when not having starting, ending or both )
        if(!sentence.contains(startingWord) && !sentence.contains(endingWord)) {

            return "Invalid input, starting word and ending words not found";


            //else if
        }else if(!sentence.contains(startingWord)) {
            return sentence.substring(0, endingWordIndex);
        }else if(!sentence.contains(endingWord)){
            return sentence.substring(firstWordEnd);
        }else {

            return sentence.substring(firstWordEnd, endingWordIndex);
        }
    }
    }

