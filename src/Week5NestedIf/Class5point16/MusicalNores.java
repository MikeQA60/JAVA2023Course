package Week5NestedIf.Class5point16;

import java.util.Scanner;

public class MusicalNores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number 1-7: ");
        int num = sc.nextInt();

        switch (num) {

            case 1:
                System.out.println("The corresponding musical note is do");
                break;
            case 2:
                System.out.println("The corresponding musical note is re");
                break;
            case 3:
                System.out.println("The corresponding musical note is mi");

            case 4:
                System.out.println("The corresponding musical note is fa");
                break;
            case 5:
                System.out.println("The corresponding musical note is sol");
                break;
            case 6:
                System.out.println("The corresponding musical note is la");
                break;
            case 7:
                System.out.println("The corresponding musical note is ti");
                break;
            default:
                System.out.println("Error: Invalid input. Please enter a number between 1 and 7");

        }
    }
}

