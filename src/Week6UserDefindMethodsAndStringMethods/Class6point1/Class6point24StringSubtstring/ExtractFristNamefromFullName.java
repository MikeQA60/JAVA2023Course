package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point24StringSubtstring;

public class ExtractFristNamefromFullName {
    public static void main(String[] args) {

    }

    public static String extractFirstName(String wholeName) {
        int indexOfFirstName = wholeName.indexOf(" ");
        return wholeName.substring(0, wholeName.indexOf(" "));
    }
}
