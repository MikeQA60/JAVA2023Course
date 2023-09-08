package week4.Class12point.point0.Class12point3;

import java.util.Scanner;

public class AppointmentConfirmationCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have an appointment at 13:45, do you confirm it? Enter true/false");
        boolean isConfirmed = scanner.nextBoolean();
        if(isConfirmed) {
            System.out.println("Appointment status: Confirmed! See you Soon.");

        }
        if(!isConfirmed) {
            System.out.println("Appointment status: Not confirmed Please confirm your appointment as soon as possible.");
        }
    }
}
