package practice;

import java.util.Scanner;

//nested if
/*
Write a Java program for a bank that allows users to withdraw or deposit money from their account.
 The program should ask the user for their account balance, and then ask them whether they want to withdraw or deposit money.
  If they choose to withdraw money, the program should ask them for the amount they want to withdraw and
  then display their new balance. If they choose to deposit money, the program should
  ask them for the amount they want to deposit and then display their new balance.
   The program should only allow users to withdraw money if their balance is greater than or equal
    to the amount they want to withdraw.
 */
public class March2pt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your account balance");
        double accountBalance = input.nextDouble();

        System.out.println("Do you want to withdraw (W) or deposit (D) ");
        char answer1 = input.next().charAt(0);

        if (answer1 == 'W') {
            System.out.println("How much would you want to withdrwraw?");
            double enterAmount = input.nextDouble();
            if (accountBalance >= enterAmount) {
                double updatedBalance = accountBalance - enterAmount;
                System.out.println("Your new balance is $" + updatedBalance);
            } else {
                System.out.println("you're broke");
            }
        } else if (answer1  == 'D') {

        System.out.println("How much would you want to deposit?");
        double enterAmount = input.nextDouble();
        double updatedBalance = accountBalance + enterAmount;
        System.out.println("Your new balance is $" + updatedBalance);
    } else {
            System.out.println("error");
        }

    }
}
