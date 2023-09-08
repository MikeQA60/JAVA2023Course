package Week5NestedIf.Class5point15;

import java.util.Scanner;

public class WhatDayisIt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7:");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("The corresponding day of the week is Sunday");
                break;
            case 2:
                System.out.println("The corresponding day of the week is Monday");
                break;
            case 3:
                System.out.println("The corresponding day of the week is Tuesday");
                break;
            case 4:
                System.out.println("The corresponding day of the week is Wednesday");
                break;

            case 5:
                System.out.println("The corresponding day of the week is Thursday");
                break;
            case 6:
                System.out.println("The corresponding day of the week is Friday");
                break;
            case 7:
                System.out.println("The corresponding day of the week is Saturday");
                break;
            default:
                System.out.println("The corresponding day of the week is");

        }
    }
}

