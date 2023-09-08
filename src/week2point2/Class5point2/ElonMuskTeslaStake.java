package week2point2.Class5point2;

//example 2

/*
Elon Musk remains Tesla's biggest shareholder with a 13.4% stake, according to financial market data provider Refinitiv.

As of Feb 7th, 2023 Tesla Market Capitalization was 610,270,000,000.

Write a program that finds Elon Musk’s stake converted to $ amount.

First store the value of elonMuskTeslaStakePercentage and teslaMarketCap in
the most suitable data types. Then create a variable with elonMuskStakeInDollars and calculate the value based on the numbers above. End the program with printing the value of elonMuskStakeInDollars;

______ elonMuskTeslaStakePercentage = _____;
______ teslaMarketCap = _______;

______ elonMuskStakeInDollars = ______;

System.out.println(elonMuskStakeInDollars);




When you run your calculation, you might see something like 8.177618E10.
That's totally fine bc in Java, the double the data type is used to represent floating-point numbers.
Floating-point numbers are numbers that have a decimal point. However, sometimes the size of the number can be so large or so small that it is difficult to represent it in a readable format.

To overcome this issue, scientific notation is used to represent large or small numbers in a compact and
 readable format. In scientific notation, a number is represented as a mantissa (a number between 1 and 10) multiplied by 10 raised to a power.

For example, 8.177618E10 represents 8.177618 * 10^10, which is equal to 817,761,800,000. In this notation,
 the mantissa is 8.177618, and the power of 10 is 10. The letter "E" is used to represent "x10^".

In Java, when a floating-point number is very large or very small, it is often represented in scientific notation,
 like 8.177618E10, to make it easier to read and understand.
 */
public class ElonMuskTeslaStake {
    public static void main(String[] args) {
        double elonMuskTeslaStakePercentage = 13.4;
        long teslaMarketCap = 610270000000l;

       double elonMuskStakeInDollars = elonMuskTeslaStakePercentage * teslaMarketCap;

        System.out.println(elonMuskStakeInDollars);
    }
}
