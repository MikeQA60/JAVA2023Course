package week2point2.Class5point2;

//example 5

/*
Write a program that calculates the total number of Tesla Model S cars produced in two years,
 given the production rate of 3,000 cars per week in the first year and 4,000 cars per week in the second year.

____ year1WeeklyProductionRate = ____;
____ year2WeeklyProductionRate = ____;
____ numberOfWeeksInYear = 52;

____ year1ProductionRate = ____;
____ year2ProductionRate = ____;


____ totalCars = _____;

System.out.println("Total number of Tesla Model S cars produced in two years: " + totalCars);
 */
public class TeslaProductionRate {
    public static void main(String[] args) {
        double year1WeeklyProductionRate = 3000;
        double year2WeeklyProductionRate = 4000;
        int numberOfWeeksInYear = 52;

        int year1ProductionRate = 156000;
        int year2ProductionRate = 208000;


        int totalCars = year1ProductionRate + year2ProductionRate;

        System.out.println("Total number of Tesla Model S cars produced in two years: " + totalCars);
    }
}
