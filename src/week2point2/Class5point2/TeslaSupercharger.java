package week2point2.Class5point2;

//example 4

/*
Write a program that calculates the total cost of charging a Tesla Model 3 car, given the cost of charging at a Tesla Supercharger is $0.50 per kWh, and the car requires 50 kWh to charge fully.

Declare the following variables.

____ pricePerKwh = ____;
____ fullChargeKwh = ___;
____ costForFullCharge = ____;

System.out.println(costForFullCharge);


Note: the result should be a double value.
 */
public class TeslaSupercharger {
    public static void main(String[] args) {

        double pricePerKwh = 0.50;
        double fullChargeKwh = 50;
        double costForFullCharge = pricePerKwh * fullChargeKwh;

        System.out.println(costForFullCharge);
    }
}
