package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point10WhileLoopWithStrings;

import java.util.Scanner;

public class EnterAValidName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");

        String name = "";

        while (name.trim().isEmpty()){

            name = scanner.nextLine().trim();
            if(name.isEmpty()){
                System.out.println("Invalid input. Please enter your name:");

            }
        }
        System.out.println("Welcome, " + name + "!");

    }
}

