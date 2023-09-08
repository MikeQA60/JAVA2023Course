package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point17ForLoopIntro;

import java.util.Scanner;

public class PrintLettters {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int endPoint = sc.nextInt();


        System.out.print("Result: ");

        //
        if (endPoint >= 0 && endPoint < 26) {

            //
            for (int index = 0; index < endPoint; index++) {

                //
                System.out.print(letters.charAt(index));
            }
        } else {
            System.out.println("Error! Invalid number");
        }
    }
}
