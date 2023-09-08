package Week5NestedIf.Class5point17;

import java.util.Scanner;

public class ProgLang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a programming language:");

        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Java is a compiled language");
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

