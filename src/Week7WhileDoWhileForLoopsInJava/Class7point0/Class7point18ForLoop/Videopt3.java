package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point18ForLoop;

public class Videopt3 {

    //write a program that print out the String character from the end till beginning

    public static void main(String[] args) {

        String str = "Hello Superstar";

        //starting from last index
        for(int counter = str.length() -1; counter >=0; counter--){


            System.out.println(str.charAt(counter));

            //print out hello superstar to --> ratsrepus olleh

        }
    }
}
