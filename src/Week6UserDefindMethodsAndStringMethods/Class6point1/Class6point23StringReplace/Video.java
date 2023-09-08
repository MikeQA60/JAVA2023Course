package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point23StringReplace;

public class Video {

    //string replace (char oldchar char newchar) //returns new string by replacing all occurences of oldchar with newchar
    public static void main(String[] args) {
        //return string
        //String replace (char oldChar, char newChar)

        //replaces all occurences of old char to new char

        //and return a new string

        String str = "Hello WeDEVXEr!";

        //save in a string  //replace all 'e's to 'w's
    String str2  =  str.replace('e','w'); //only changes 'e' not E bc of case sensative
        System.out.println(str2);  //will print to "Hwllo WwDEVXEr!"

    }


}
