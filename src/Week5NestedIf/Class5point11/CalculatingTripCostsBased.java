package Week5NestedIf.Class5point11;

import java.util.Scanner;

/*
Write a Java program that calculates the total cost of a trip based on the user's input
for the distance traveled and the mode of transportation used.

If the user chooses to drive, the program should calculate the cost of the trip as $0.50 per mile.

If the user chooses to fly, the program should calculate the cost of the trip as $100 per hour of flight time.

Additionally, if the user selects the first-class option, an extra $50 should be added to the total cost.

Required Variables:

distanceTraveled: the distance traveled, entered by the user.

modeOfTransport: the mode of transportation used (drive/fly), entered by the user.

isFirstClass: a boolean variable indicating whether or not the user selected first-class option.

The program should perform the following steps:

Prompt the user to enter the distance traveled and mode of transportation.

Calculate the total cost of the trip based on the distance traveled and mode of transportation.

If the user selects to fly first class, add $50 to the total cost.

Display the total cost of the trip.

Assume the following:

The cost of driving is $0.50 per mile.

The cost of flying is $100 per hour of flight time.

The speed of the flight is 500 miles per hour.

The user selects first-class option by entering 'yes' for yes and 'no' for no.

Note: The program does not need to take into account other costs associated with travel, such as food, lodging, or rental cars.

Expected Output:

Test Case 1:

200

drive

Please enter the distance of the trip in miles:
Please enter the mode of transportation (drive/fly):
The cost of the trip is $100.00

Test Case 2:

500

fly

no

Please enter the distance of the trip in miles:
Please enter the mode of transportation (drive/fly):
Do you want to fly first class (yes/no)?
The cost of the trip is $100.00

Test Case 3:

500

fly

yes

Please enter the distance of the trip in miles:
Please enter the mode of transportation (drive/fly):
Do you want to fly first class (yes/no)?
The cost of the trip is $150.00

Test Case 4:

-100

fly

yes

Please enter the distance of the trip in miles:
Please enter the mode of transportation (drive/fly):
Do you want to fly first class (yes/no)?
Invalid distance value, please enter a positive value.

Test Case 5:

100

walk

Please enter the distance of the trip in miles:
Please enter the mode of transportation (drive/fly):
Invalid mode of transportation!
 */

public class CalculatingTripCostsBased {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the distance of the trip in miles:");
        double distanceTraveled = scanner.nextDouble();

        System.out.println("Please enter the mode of transportation (drive/fly):");
        scanner.nextLine(); // Consume newline character

        String modeOfTransport = scanner.nextLine();
        double totalCost = 0.0;

        if (modeOfTransport.equalsIgnoreCase("drive")) {
            totalCost = distanceTraveled * 0.50;

        } else if (modeOfTransport.equalsIgnoreCase("fly")) {


            System.out.println("Do you want to fly first class (yes/no)?");
            String isFirstClassInput = scanner.nextLine();
            boolean isFirstClass = isFirstClassInput.equalsIgnoreCase("yes");

            double flightTime = distanceTraveled / 500.0;
            totalCost = flightTime * 100.0;
            if (isFirstClass) {
                totalCost += 50.0;
            }
        } else {
            System.out.println("Invalid mode of transportation!");
            return; // Terminate the program
        }
        if (distanceTraveled < 0) {
            System.out.println("Invalid distance value, please enter a positive value.");
        } else {
            System.out.printf("The cost of the trip is $%.2f%n", totalCost);
        }
    }
}