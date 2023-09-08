package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point18StringLength;

public class Videopt3 {
    public static void main(String[] args) {

        String str3 = "Hello wedvx superstar, lets keep building our bright future together!";

        int str3Length = str3.length(); //71
        System.out.println(str3Length);


        //charAt() --> an index, start countring from 0
        //length - return the number of characters, start counting from 1
 //                       //last char          returns 71 -1
        char lastChar = str3.charAt(str3.length()-1);
        System.out.println(lastChar);




    }
}
