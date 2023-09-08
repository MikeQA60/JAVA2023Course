package week2point2.Class5point3;

//example 4

/*
Write a program that calculates the monthly payment on a Tesla Model X car.
he car has a purchase price of $120,990 and a down payment of $4,000. The loan term is 36 months and no APR.
Print the result.

_____ purchasePrice = _____;
_____  downPayment = _____;

_____ loanTerm = _____;

_____ monthlyPayment = _____;

//print the value of monthlyPayment
 */
public class TeslaModelXCost {
    public static void main(String[] args) {
       double purchasePrice = 120990;
        int  downPayment = 4000;

        int  loanTerm = 36;

         double monthlyPayment = (purchasePrice - downPayment) / (loanTerm);
        System.out.printf("%.2f",monthlyPayment);

//print the value of monthlyPayment


    }
}
