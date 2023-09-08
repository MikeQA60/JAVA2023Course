package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point24StringSubtstring;

public class ExtractSubstringAfterWord {
    public static void main(String[] args) {

    }

    public static String extractSubstringAfterWord(String sentence, String extract) {
        if(sentence.contains(extract)) {
            int extractIndex = sentence.indexOf(extract);

            return sentence.substring(extractIndex + extract.length());
        }else{
            return "";
        }
    }
}
