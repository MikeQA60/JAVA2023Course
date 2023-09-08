package week3.Class7point0.Class7point4;

import java.util.Scanner;

public class GoogleJobOffer {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String fullName = input.nextLine();
    String  jobTitle = input.nextLine();
    String salary = input.nextLine();

    System.out.printf("Dear %s,\nWelcome to Google!\nWe are delighted to have you as a %s. Your starting salary is $%s\n\nSincerely,\nGoogle HR Representative", fullName, jobTitle, salary);
  }
}
