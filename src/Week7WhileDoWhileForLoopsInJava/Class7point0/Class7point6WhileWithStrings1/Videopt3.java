package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point6WhileWithStrings1;

public class Videopt3 {

    //write a program that prints out any String characters in a reversed order?

    public static void main(String[] args) {

        String str2 = "I love Java So Much";

        //starting point
                            // length index of last char
        int counter2 = str2.length()-1;
           //more than or = to
        while (counter2 >=0){

                        //give me count of characters index
            System.out.println(str2.charAt(counter2));

            counter2--;
        }


    }
}
