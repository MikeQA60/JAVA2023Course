package week3.Class7point0.Class9point1;

import java.util.Scanner;

public class ReadyforMarket {

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        boolean finishWedevx = sc.nextBoolean();
        boolean hasStrongResume = sc.nextBoolean();
        boolean x = finishWedevx & hasStrongResume;

        System.out.println("Have you finished WeDevX?");
        System.out.println("Do you have a Strong Resume?");
        System.out.println("Candidate is eligible for senior-level position: " + x);
    }
}
