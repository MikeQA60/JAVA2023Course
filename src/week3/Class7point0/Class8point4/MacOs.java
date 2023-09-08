package week3.Class7point0.Class8point4;

import java.util.Scanner;

public class MacOs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the brand of your computer hardware: ");

        String y = sc.nextLine();
        String x = "Macbook";

        //System.out.println(x);
        boolean MacOS = y.equals(x);

        System.out.println("macOs is compatible with Macbook: " +  MacOS);
    }
}
