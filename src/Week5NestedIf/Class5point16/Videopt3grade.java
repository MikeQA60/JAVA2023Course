package Week5NestedIf.Class5point16;

public class Videopt3grade {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent Work!");
            break;
            case 'B':
                System.out.println("Good Work!");
                break;
            case 'C':
                System.out.println("Average Work!");
                break;
            case 'D':
                System.out.println("Bad Work!");
                break;
            case 'F':
                System.out.println("Failed Work!");
                break;

                //default handles all options provided from cases
            default:
                System.out.println("Invalid Input");

        }
    }
}
