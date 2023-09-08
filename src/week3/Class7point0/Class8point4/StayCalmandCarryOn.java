package week3.Class7point0.Class8point4;

import java.util.Scanner;

public class StayCalmandCarryOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stay Calm and ");
        String usersInput = scanner.nextLine();
        String correctInput = "Carry On";
        boolean isCorrect = usersInput.equals(correctInput);
        System.out.println("Stay Calm and " + usersInput);
        System.out.println("Correct answer: " + isCorrect);
    }
}
