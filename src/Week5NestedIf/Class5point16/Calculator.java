package Week5NestedIf.Class5point16;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter operator (+, -, *, /)");
        String operation = scanner.next();

        switch (operation.toLowerCase()) {          //lower case
            case "add":
            case "+":
                System.out.println(num1 + num2);
                break;

            case "sub":
            case "-":
                System.out.println(num1 - num2);
                break;

            case "mul":
            case "*":
                System.out.println(num1 * num2);
                break;

            case "div":
            case "/":
                System.out.println(num1 / num2);
                break;

            case "mod":
            case "%":
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("Error");

        }
    }
}
