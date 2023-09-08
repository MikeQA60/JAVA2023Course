package week3.Class7point0.Class10point2;


/*
Write a program that applies sales tax to a sale amount.
The program should prompt the user to enter the sales amount and tax rate and then calculate the total amount due (including tax).

___ total = ____;
___ tax = ____;
total __ ____;



Expected result:

Please enter the sale amount:
Please enter the tax rate:
X.XX

Where X.XX is a double value.
 */
import java.util.Scanner;

public class SalesTax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sale amount: \nPlease enter the tax rate:");

        double total = sc.nextDouble();
        double tax = sc.nextDouble();
        tax /= 100;
        tax *= total;
        total += tax;
    }
}
