package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point22BreakStatments2;

import java.util.Scanner;

public class Videopt2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
      //  System.out.println();

        int num2 = 0;

        do {

            System.out.println("Please enter a number");

            num2 = sc.nextInt(); //2
            if(num2 < 0) {
                System.out.println("Invalid number, please try again");
            }
            else {
                System.out.println(num2);
                break;
            }
            } while (true);


    }
}
