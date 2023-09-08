package week3.Class7point0.Class9point3;

import java.util.Scanner;

public class RealEstatePropSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many followers does the user have?");
        int followerCount = sc.nextInt();
        System.out.println("Is Email Verified?");
        boolean isEmailVerified = sc.nextBoolean();
        boolean x = followerCount >= 100000 && isEmailVerified;

        System.out.println("User is eligible for a verified blue icon: " + x);
    }
}
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int followerCount = 100000;
//        boolean isEmailVerified = sc.nextBoolean();
//        boolean x = followerCount >= 100000 && isEmailVerified;
//
//        System.out.println("How many followers does the user have?");
//        System.out.println("Is Email Verified?");
//        System.out.println("User is eligible for a verified blue icon:  " + x);
//    }
//}