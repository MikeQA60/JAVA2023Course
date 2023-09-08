package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point10WhileLoopWithStrings;

import java.util.Scanner;

public class Video {

    //write a program that prints out Happy Career and Life!
    //as many times as user wants to
    //the prompt should "Do you want to see the message again? yes/no

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //message
        System.out.println("Do you want to see the message?");

        //yes or no
        String answer = sc.nextLine();
        //if yes          //yes or YES
        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Happy Carreer and Life!");

            //ask a a message again in yes then while loop executes again
            System.out.println("Do you want to see the message again?");
            //variable = new value
            answer = sc.nextLine();
        }
    }

}
