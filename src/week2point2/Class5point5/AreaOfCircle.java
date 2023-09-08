package week2point2.Class5point5;

//example 1

/*
Area of a Circle:
Given the radius of a circle is 5 cm, write a program to calculate the area of a circle given its radius using the multiplication and the value of pi.

1. Declare a variable for a radius
2. Declare a variable for a pi

3. Declare a variable for the area.

The formula for the area of a circle is:

area = pi * radius  * radius

You can use the value of pi as 3.14159

Expected output:

The area of the circle with radius X cm is: Y


Where X is the value of the radius

and Y is the value of the area.
 */
public class AreaOfCircle {
    public static void main(String[] args) {
         double pi = 3.14159;
         double radius = 5;
         double area = pi * radius * radius;

        System.out.println("The area of the circle with radius 5 cm is: " + area);


    }
}
