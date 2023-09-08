package week3.Class7point0.Class8point1;

import java.util.Scanner;

public class VisaApprovalRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of visa applications they have submitted: ");
        int visasubmitted = sc.nextInt();
        System.out.println("Please enter the number of visa applications they have approved:");
        int visaaproval = sc.nextInt();

        boolean var = visasubmitted == visaaproval;
        System.out.printf("You have a $%s approval rate: ", visasubmitted,visaaproval,var);
    }
}
