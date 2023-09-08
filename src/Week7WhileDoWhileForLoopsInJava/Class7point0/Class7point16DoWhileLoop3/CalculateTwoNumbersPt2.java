package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point16DoWhileLoop3;

import java.util.Scanner;

public class CalculateTwoNumbersPt2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number1, number2, result;
        String operator, answer;

        do {
            System.out.println("Enter the first number: ");

            number1 = sc.nextDouble();
            System.out.println("Enter the second number: ");

            number2 = sc.nextDouble();
            System.out.println("Enter operator(+, -, *, /):");


            sc.nextLine();
            operator = sc.nextLine();

            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;

                case "/":
                    result = number1 / number2;
                    break;

                default:
                    result = -9.9999;
            }
            if (result == 9.9999) {
                System.out.println("Invalid operator!");
            } else
                System.out.println("Result: " + result);

            System.out.println("Do you want to continue? (y/n)");
            System.out.println("      ");
            answer = sc.nextLine();

        }
        while (answer.equals("y"));
    }
}
