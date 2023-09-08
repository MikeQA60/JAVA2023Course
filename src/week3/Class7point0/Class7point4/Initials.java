package week3.Class7point0.Class7point4;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter your first name:");
        char firstinitial = sc.nextLine().charAt(0);
        System.out.println("Please enter your last name:");
        char lastinitial = sc.nextLine().charAt(0);
        System.out.println(firstinitial + lastinitial);


    }
}
