package week4.Class12point.point0.Class12point3;

import java.util.Scanner;

public class DelieveryTrackingStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Has the package been delivered? Enter true/false");
        boolean isConfirmed = scanner.nextBoolean();
        if(isConfirmed) {
            System.out.println("The package has been delivered to its destination.");

        }
        if(!isConfirmed) {
            System.out.println("The package has not yet been delivered. Please check back later for updates");
        }
    }
}

