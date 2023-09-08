package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point14DoWhileLoop1;

public class Videopt3 {


    //write a program that prints out all characters in any given string using do while
    //from the beginning till the end
    public static void main(String[] args) {


        ;
        String str = "Im a do while superstar";
        int index = 0;

        do {
            System.out.println(str.charAt(index++));
              //0 more then length of word
            // 0 more than 20 - 1 // = I


            //0 less than length of words
        } while (index <= str.length()-1);

    }
}
