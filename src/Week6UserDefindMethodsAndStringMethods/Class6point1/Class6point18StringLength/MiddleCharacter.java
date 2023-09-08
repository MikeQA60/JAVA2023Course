package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point18StringLength;

public class MiddleCharacter {

    public static void main(String[] args) {

    }
    public static String getMiddleChars(String string) {
       if(string.isEmpty())
           return "???";

       if (string.length() % 2 ==0) {
           return "" +
                   string.charAt(string.length()/2-1) +
       string.charAt(string.length()/2);

       } else return  "" +
               string.charAt(string.length()/2);
    }
}
