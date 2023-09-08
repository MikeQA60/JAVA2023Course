package week2point2.Class5point2;

//example 1

/*
The range of a Tesla Model Y on 1% battery can vary based on several factors such as driving conditions, speed, weather, and the vehicle's battery capacity.

According to Tesla's official website, the Long Range Model Y has an estimated range of 326 miles.

So, based on these estimates, a Model Y should be able to drive 3.15 on 1% of its battery.

I have 42% on battery life on my Tesla Model Y. Write a program that will store the values of myCurrentBatteryLifePercentage and milesPer1Percent in the most suitable data types. Then create a totalDistanceRange variable where the value is the multiplication of myCurrentBatteryLifePercentage and milesPer1Percent. End the program by printing out the value of totalDistanceRange.

_____ myCurrentBatteryLifePercentage = _______;
_____ milesPer1Percent = _______;
_____ totalDistanceRange = _______;

System.out.println(totalDistanceRange);
 */
public class TeslaRunRange {
    public static void main(String[] args) {

        double myCurrentBatteryLifePercentage = 42;
        double milesPer1Percent = 3.15;
        double totalDistanceRange = myCurrentBatteryLifePercentage * milesPer1Percent;

        System.out.println(totalDistanceRange);

    }
}
