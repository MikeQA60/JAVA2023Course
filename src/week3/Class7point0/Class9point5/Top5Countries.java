package week3.Class7point0.Class9point5;

import java.util.Scanner;

public class Top5Countries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which country are you traveling to?");
        String destinationCountry = scanner.nextLine();
        boolean isVisaRequired = destinationCountry.equals("China") || destinationCountry.equals("India") ||
                destinationCountry.equals("Russia") || destinationCountry.equals("Brazil") ||
                destinationCountry.equals("Vietnam");
        System.out.println("A visa is required for both tourist and business purposes in" + destinationCountry + ": " + isVisaRequired);

    }
}
