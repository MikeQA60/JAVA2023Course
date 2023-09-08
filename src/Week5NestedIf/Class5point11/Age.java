package Week5NestedIf.Class5point11;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender");
        char gender = scanner.nextLine().charAt(0);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age > 0)
        {
            if (gender == 'B' || gender == 'M')
            {
                if (age >= 20 && age <= 19)
                    System.out.println("if the user is younger than 20 and a male then print out Boy");
                else
                    System.out.println("if the user is younger than 20 and a female then print out Girl");
            }
            else if (gender == 'g' || gender == 'F')
            {
                if (age >=20 && age <= 19)
                    System.out.println("if the user is older than 19 and a male then print out Man");
                else
                    System.out.println("if the user is older than 19 and a female then print out Woman");
            }
        }
        else
            System.out.println("not valid age");
    }
}
