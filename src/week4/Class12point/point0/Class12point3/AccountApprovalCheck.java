package week4.Class12point.point0.Class12point3;

import java.util.Scanner;

public class AccountApprovalCheck {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Has your account been approved by an administrator? (true/false)");
        boolean isApproved = scanner.nextBoolean();
        if (isApproved) {
            System.out.println("Congratulations! Your account has been approved and is ready to use.");

        }
        if (!isApproved) {
            System.out.println("Sorry, your account has not been approved yet. Please check back later.");
        }
    }
}
