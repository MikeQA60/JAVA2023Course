package week3.Class7point0.Class9point2;

import java.util.Scanner;

public class EligibleforAnnualBonus {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    boolean hasCompanyReachedTheTarget = sc.nextBoolean();
    boolean hasEmployerPerformedAboveAndBeyond = sc.nextBoolean();
    boolean x = hasCompanyReachedTheTarget && hasEmployerPerformedAboveAndBeyond;

        System.out.println("Did the company reach it's target?");
        System.out.println("Did the employee perform above and beyond?");
        System.out.println("The employee is eligible for a 15% bonus: " + x);
}
}


