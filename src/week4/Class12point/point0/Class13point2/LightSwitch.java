package week4.Class12point.point0.Class13point2;

import java.util.Scanner;

public class LightSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter true or false to indicate whether the light is on or off:");
        boolean isConfirmed = scanner.nextBoolean();
        if(isConfirmed) {
            System.out.println("Light is on");

        }
        if(!isConfirmed) {
            System.out.println("Light is off");
        }
    }
}


