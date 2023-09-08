package Week10WrapperClassListSetCollections.Class10point7CHARCLASSMETHOD;

public class Video {

    public static void main(String[] args) {


        char a = 'h';
        char b = '2';
        char space = ' ';
        char upperCase = 'P';

        System.out.println(Character.isLetter(a)); //true
        System.out.println(Character.isLetter(b)); //false

        System.out.println(Character.isDigit(a));  //false
        System.out.println(Character.isDigit(b)); //true


        System.out.println(Character.isWhitespace(space)); //true
        System.out.println(Character.isWhitespace(a)); //false


        System.out.println(Character.toUpperCase(a)); //H
        System.out.println(Character.toLowerCase(upperCase)); //P

        String str = Character.toString(upperCase);
        System.out.println(str); //P
    }
}
