package week2point2.Class5point3;

// example 2

/*
Tesla operating expenses for the twelve months ending December 31, 2022 were $67,806,000,000 ($67.806B)

Write a program that finds the daily cash burn rate at Tesla Inc. Given there are 365 days/year.

First store the values of totalYearlyExpenses and daysInYear in the most suitable data type.
 Then create a dailyCashBurnRate variable where the value is calculated based on the given facts. End the program by printing out the value of dailyCashBurnRate.

____ totalYearlyExpenses = _____;
____ daysInYear = ____;
____ dailyCashBurnRate = ______;

System.out.println(dailyCashBurnRate);
 */
public class TeslaOperationalExpenses2022 {
    public static void main(String[] args) {
        long totalYearlyExpenses = 67806000000l;
        short daysInYear = 365;
        long dailyCashBurnRate = totalYearlyExpenses / daysInYear;

        System.out.println(dailyCashBurnRate);

    }
}
