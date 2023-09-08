package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point9WhileLoopWithBoolean;

import java.util.Scanner;

public class Video {

    //while loop can and should be used to run the loops
    //with underdefined number of iterations
    //each loop is called an iteration
    public static void main(String[] args) {

        //i want to write a program
        //that is going to print out superstar
        //as many times as the user wants to
        //i need to ask the user if he/she wants to see the message?

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to see the message? true/false");

        //take input from user
        boolean answer = sc.nextBoolean();

        //enter loop
        while (answer){ //if yes enter superstar

            //execute body
            System.out.println("Superstar");

            //ask the question //get input again
            System.out.println("Do you want to see the message? true/false");

            //get input again //deciding if loop is executed again
            answer = sc.nextBoolean();
        }


    }
}
