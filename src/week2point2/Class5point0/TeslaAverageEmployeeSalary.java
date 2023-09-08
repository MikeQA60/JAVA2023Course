package week2point2.Class5point0;
//example 3

/*
Software Engineers at Tesla Motors earn around $160,000/year as a Base Salary and $187,500/year in Stocks.

Write a program that will store the values of baseSalary and salaryInStocks in the most suitable data type. Then create a totalCompensation variable that will store the sum of base salary and salary in stocks. Print out the value of totalCompensation per year.

____ baseSalary = _____;
____ salaryInStocks = _____;
____ totalCompensation = ______;



Expected Output:

X/year

Where X is the result of totalCompensation
 */
public class TeslaAverageEmployeeSalary {
    public static void main(String[] args) {
        int baseSalary = 160000;
        int salaryInStocks = 187500;
        int totalCompensation = baseSalary + salaryInStocks;
        System.out.println(totalCompensation + "/year");
    }
}
