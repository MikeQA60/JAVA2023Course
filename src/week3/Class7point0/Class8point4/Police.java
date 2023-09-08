package week3.Class7point0.Class8point4;

import java.util.Scanner;

public class Police {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your plate number: ");
        String enterPlateNumber = sc.nextLine();
        String plateNumber = "123LA";
        boolean carNeedsToBeTowed = enterPlateNumber.equals(plateNumber);
        System.out.println("We will have to tow your car: " + carNeedsToBeTowed);
    }
}
