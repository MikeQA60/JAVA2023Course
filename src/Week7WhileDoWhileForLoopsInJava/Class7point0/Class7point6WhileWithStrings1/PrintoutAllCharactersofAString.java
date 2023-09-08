package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point6WhileWithStrings1;

public class PrintoutAllCharactersofAString {
    public static void main(String[] args) {

    }
    public static void spltCharacters(String str) {
     str = "Wedevx!";
       System.out.println(str.charAt(7));
      System.out.println(str.charAt(6));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(4));
       System.out.println(str.charAt(3));
       System.out.println(str.charAt(2));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(0));

       int counter = 7;
        while (counter >= 0) {
            System.out.println(str.charAt(counter));
            counter--;
        }
    }
}
