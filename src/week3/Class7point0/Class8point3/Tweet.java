package week3.Class7point0.Class8point3;

import java.util.Scanner;
public class Tweet {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of words you want to tweet: ");
//        int rainfall = 40;
//        boolean israinfall = rainfall >= 50;

        int tweets = scanner.nextInt();
        double h = 280;

        boolean twitter = tweets <= h;

        System.out.println("Tweeted: " + twitter);

    }
}

