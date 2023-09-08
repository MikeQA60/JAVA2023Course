package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point24StringSubtstring;

public class Videopt2 {
    public static void main(String[] args) {

        String str5 = "Hello Java Superstars, Java is Hard, but it's fun!";

      String str6 =  str5.substring(23);
        System.out.println(str6);//Java is Hard, but it's fun!

        str5.substring(-2); //stringoutofbounds exception

    }
}
