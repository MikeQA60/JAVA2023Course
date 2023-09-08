package week2point2.Class5point3;

//example 3

/*
Write a program that calculates the remaining charging time required for a Tesla Model 3 car;
 given the car is currently at 35 kWh, it requires 50 kWh to charge fully, and the charging rate is 5 kWh per hour.

____ currentKwh = ____;
____ fullKwh = ____;
____ ratePerHour = ____;

___ remainingChargingTime = ____;

System.out.println(remainingChargingTime);
 */
public class TeslaModel3CharingRate {
    public static void main(String[] args) {

        int currentKwh = 35;
        int fullKwh = 50;
        int ratePerHour = 5;

        int remainingChargingTime = fullKwh/currentKwh;

        System.out.println(remainingChargingTime);
    }
}
