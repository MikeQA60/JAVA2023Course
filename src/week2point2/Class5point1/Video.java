package week2point2.Class5point1;

/*
Class 5.1 - Arithmetic Operators Subtraction
Discover the use of the minus (-) operator in Java for subtraction,
its precedence, associativity, and how to use it in expressions, in this comprehensive Minus Arithmetic Operator tutorial.
 */
public class Video {
    public static void main(String[] args) {
       //can work with ints, write a program to store balance
        double balance = 185000;
        double amountSpent = 120000;
        double updatedBalance = balance - amountSpent;

        System.out.println("Your current balance: $" + updatedBalance);
        System.out.println(updatedBalance);

        //have to add () so it can run again
        System.out.println("Your current balace: $" + (balance-amountSpent));



    }
}
