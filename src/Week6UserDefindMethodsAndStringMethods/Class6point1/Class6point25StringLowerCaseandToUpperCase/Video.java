package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point25StringLowerCaseandToUpperCase;

import java.util.Locale;

public class Video {

    //stringtoLowerCase(): converts all the chars in the string to lower case //HELLO to hello

    //stringtoUpperCase(): comverts all the chars in the string to upper case.Stringword 1 = Hello to HELLO
    public static void main(String[] args) {

        String str = "wedevx.co";
        String str2 = str.toUpperCase();
        System.out.println(str2); //WEDEVX.CO

        String str3 = "Spring Rolls";
      String str4 =  str3.toLowerCase();
        System.out.println(str4); //spring rolls



    }
}
