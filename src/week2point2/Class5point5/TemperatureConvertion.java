package week2point2.Class5point5;

//example 2

import java.util.Scanner;

/*
In this exercise, you will convert a temperature from Celsius to Fahrenheit using arithmetic operations.



Given the positive 25.5 degrees in celsius.

Write a java program that will convert it to Fahrenheit;





Calculate the temperature in Fahrenheit using the following formula:

fahrenheit = (temperature * 9 / 5) + 32;


Expected output:

Temperature in Fahrenheit: X
Where X is the converted value of the temperature.


 */
public class TemperatureConvertion {
    public static void main(String[] args) {

       // double celsius = 25.5;
        double temperature = 25.5;

        double Farenheit = (temperature * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + Farenheit);

    }
}
