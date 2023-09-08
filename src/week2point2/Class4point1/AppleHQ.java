package week2point2.Class4point1;

//example 1

/*
In this exercise, you will write a Java program that stores the address of Apple's headquarters in separate String variables and concatenates them to print the full address.

Requirements:

Declare the following String variables:

street and initialize it with "1 Infinite Loop"

city and initialize it with "Cupertino"

state and initialize it with "California"

zipCode and initialize it with "95014"

Write a program to concatenate all the variables and print the full address to the console.


Expected output:

1 Infinite Loop, Cupertino, California 95014
 */
public class AppleHQ {
    public static void main(String[] args) {



        String address = "1 Infinite Loop";
        String city = "Cupertino";
        String State = "California";
       // String country = "USA";
        String zipCode = "95014";

        String fullAddress= address + ", " + city + ", " + State +" " + zipCode;
        System.out.println(fullAddress);
    }
}
