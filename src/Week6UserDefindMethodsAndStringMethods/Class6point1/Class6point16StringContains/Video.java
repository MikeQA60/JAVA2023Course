package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point16StringContains;

public class Video {

    public static void main(String[] args) {
        String str  = "Hello wedevxer!";

        //boolean contains (string str) --> it returns true of the original string contains the given substring
        //Hello --> lo --> return

        //"Go to Mars" --> Mars -->

        //"I want to go into politics" --> "politics" --> return true --> we ban this post

       boolean doesContainDevX =  str.contains("devx"); //true
        System.out.println("does contains Devx?" + doesContainDevX);

      boolean doesContainHello =  str.contains("Hello");
        System.out.println(doesContainHello);


     boolean doesContainAmazon =  str.contains("Amazon");
        System.out.println(doesContainAmazon);

//return false if devxer? or !devxer
        boolean doesContainsQuesktionMark = str.contains("devxer");
        System.out.println(doesContainsQuesktionMark);

    }
}
