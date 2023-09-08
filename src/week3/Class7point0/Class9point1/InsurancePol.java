package week3.Class7point0.Class9point1;

import java.util.Scanner;

public class InsurancePol {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        boolean hasLifeCoverage = sc.nextBoolean();
        boolean hasAutoCoverage = sc.nextBoolean();
        boolean x = hasLifeCoverage & hasAutoCoverage;

        System.out.println("Do you have life insurance?");
        System.out.println("Do you have auto insurance?");
        System.out.println("Is user eligible for a 20% discount? " + x);
    }
}

