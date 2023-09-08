package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point19ForLoopPractice;

public class ReplaceVowels {

    public static void main(String[] args) {


    }

    public static String replaceVowels(String str) {

        //starting
        char c = 0;

        //call trim to remove spaces and comparing if it is empty
        if (str.trim().isEmpty()) {
            return "";
        }
        //iterate

            //index counter & start from 0   // index less than trim and //increment
        for (int index = 0; index <= str.length() - 1; index++) {

            //getting index unitl last index
            //char at starting point ex. 0,1,2
            c = str.charAt(index);

            // if these character have these vowels
            if (c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u' || c == 'A' || c == 'E'
                    || c == 'I' || c == 'O' || c == 'U') {

                //take string and replace them with *
                str = str.replace(c, '*');
            }
        }

        //returning string
        return str;
    }
}

