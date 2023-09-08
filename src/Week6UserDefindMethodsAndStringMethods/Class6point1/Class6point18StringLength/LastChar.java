package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point18StringLength;

public class LastChar {
    public static void main(String[] args) {

    }
    public static char getLastCharacter(String str) {

        if(str.isEmpty()) {
            return '?';
        }
        return str.charAt((str.length()-1));
    }
}
