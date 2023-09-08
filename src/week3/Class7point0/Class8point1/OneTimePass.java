package week3.Class7point0.Class8point1;

import java.util.Scanner;

public class OneTimePass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please generate OTP number to log in: ");
        int otp1 = sc.nextInt();
        System.out.println("Please repeat the OTP number: ");
        int otp2 = sc.nextInt();
        boolean otp = otp1 == otp2;
        System.out.println("OTP matched: " + otp);

    }
}