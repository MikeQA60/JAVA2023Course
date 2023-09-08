package Week5NestedIf.Class5point16;

import java.util.Scanner;

public class Calcpt2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double firstNumber = sc.nextDouble();
        System.out.println("Enter second number:");
        double secondNumber = sc.nextDouble();
        System.out.println("Enter operator (+, -, *, /)");
        sc.nextLine();
        char operator = sc.nextLine().charAt(0);
        String result = "";
        switch(operator){
            case '+':
                result = "Result: " +(firstNumber + secondNumber);
                break;
            case '-':
                result ="Result: " + (firstNumber - secondNumber);
                break;
            case '*':
                result = "Result: " + (firstNumber * secondNumber);
                break;
            case '/':
                result = "Result: "+ (firstNumber/secondNumber);
                break;
            default:
                result = "Error: Invalid operator";
        }
        System.out.println(result);
    }
}