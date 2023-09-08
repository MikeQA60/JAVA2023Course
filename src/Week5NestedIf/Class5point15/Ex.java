package Week5NestedIf.Class5point15;

import java.util.Scanner;
public class Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int num1=sc.nextInt();

        System.out.println("Please enter your operation:");
        String operator=sc.next();

        System.out.println("Please enter your second number:");
        int num2=sc.nextInt();

        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Please enter valid operator: add, sub, div, mult, mod.");

        }
    }

}