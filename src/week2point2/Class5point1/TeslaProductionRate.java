package week2point2.Class5point1;

//example 2

/*
Write a program that calculates the number of Tesla Model S cars remaining to be produced in a year; given 30,000 cars are produced and the target is to produce 156,000 cars in a year.

____ carsProduced = _____;
____ target = _____;
____ remaining = _____;

System.out.println(remaining);
 */
public class TeslaProductionRate {
    public static void main(String[] args) {
        int carsProduced = 30000;
        int target = 156000;
        int remaining = target - carsProduced;

        System.out.println(remaining);

    }
}
