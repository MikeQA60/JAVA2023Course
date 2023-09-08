package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point23StringReplace;

public class RemoveASubstring {
    public static void main(String[] args) {

    }

    public static String removeSubstring(String sentence, String o) {
        //remove O with an empty no letter word
        return sentence.replace(o, "");
    }
}
