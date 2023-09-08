package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point9WhileLoopWithBoolean;

import java.util.Scanner;

public class BuildinhmyFuturewithwedevx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm building my bright future with WeDevX");

        System.out.println("Do you want to see this message again? (true/false)");
        boolean answer = scanner.nextBoolean();

        while (answer) {
            System.out.println("I'm building my bright future with WeDevX");
            System.out.println("Do you want to see this message again? (true/false)");

            answer = scanner.nextBoolean();
        }
    }
}
