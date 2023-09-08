package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point17StringisEmpty;

public class Video {

    public static void main(String[] args) {

        //
        String str = "I love wedevx.co, it will take me to Mars!";

        //boolean isEmpty() ---> the method return true if the str is empty
        //in java we can have empty strings. strings with no char at all. not even a space
        //if youre String has a space then thats not an empty any more

        String str2 = ""; //"" true // " " false bc of space

        boolean isStrEmpty = str.isEmpty(); //false
        System.out.println(isStrEmpty);


       boolean isStr2Empty = str2.isEmpty(); //true
        System.out.println(isStr2Empty);

    }
}
