package week3.Class7point0.Class8point1;

import java.util.Scanner;

public class PinNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please create a pin number:");
        int pin1 = sc.nextInt();
        System.out.println("Please repeat the pin number: ");
        int pin2 = sc.nextInt();
        boolean pin = pin1 != pin2;
        System.out.println("Pin Numbers do not match: " + pin);

    }
}

