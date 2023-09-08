package week2point2.Class5point2;

//example 3

/*
Tesla reported 5,038 car deliveries in a day in 2022. Given that there are 260 working days. How many cars in total did tesla deliver in 2022?



Write a program that stores the values of dailyVolume and workingDays in the most suitable data types. Then create a totalIn2022 variable where the value is calculated based on the given facts.



____ dailyVolume = _____;
____ workingDays = _____;

____ totalIn2022 = ______;

System.out.println(totalIn2022);

 */
public class TeslaProdVolume {
    public static void main(String[] args) {

        short dailyVolume = 5038;
        short  workingDays = 260;

        int totalIn2022 = dailyVolume * workingDays;

        System.out.println(totalIn2022);

    }
}
