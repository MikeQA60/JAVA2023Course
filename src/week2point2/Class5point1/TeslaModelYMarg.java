package week2point2.Class5point1;

//example 1

/*
Recent data compiled by Reuters shows that Tesla’s margins are significantly higher than those of its rivals, both in terms of gross and net profit.

Tesla Model Y's price tag starts at $41,190 The average cost of production is $31,616. What is the profit margin Tesla makes on each Model Y?

Write a program that stores the values of modelYPrice and costOfProduction in the most suitable data type.
 Then create a netProfit variable where the value is the difference between price and the cost. End the program with printing out the value of netProfit.

____ modelYPrice = ____;
____ costOfProduction = _____;
____ netProfit = ______;

System.out.println(netProfit);
 */
public class TeslaModelYMarg {
    public static void main(String[] args) {
        int modelYPrice = 41190;
        int costOfProduction = 31616;
        int netProfit = modelYPrice - costOfProduction;

        System.out.println(netProfit);
    }
}
