package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point12WhileLoopWithSwitchStatement;

public class Video {

    //write a method that takes a string

    //and prints out all of the vowel char in that sring

    //method does return anything

    public static void main(String[] args) {

        vowel("Hello");
    }

    //take string
    public static void vowel(String str) {

        //str = "Hello";

        //compare if vowl

        // if(str.charAt(0) == 'a' &&  'e')

        switch (str.charAt(0)) {
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
            case 'y':

                System.out.println(str.charAt(0));
                break;


        }

        switch (str.charAt(1)) {
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
            case 'y':

                System.out.println(str.charAt(1));
                break;


        }
        switch (str.charAt(2)) {
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
            case 'y':

                System.out.println(str.charAt(2));
                break;

        }
        switch (str.charAt(3)) {
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
            case 'y':

                System.out.println(str.charAt(3));
                break;
        }
        switch (str.charAt(4)) {
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
            case 'y':

                System.out.println(str.charAt(4));
                break;


        }
    }
}



