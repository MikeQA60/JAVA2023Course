package week2point2.Class4point1;
//example 2

/*
In this exercise, you will write a Java program that uses String variables to store the names of several Apple products and concatenates them to print a list of all the products.


Requirements:

Declare a String variable company and initialize it with "Apple".

Declare a String variable iphone14 and initialize it with "iPhone 14".

Declare a String variable macbookPro and initialize it with "MacBook Pro".

Declare a String variable appleWatch and initialize it with "Apple Watch".

Declare a String variable ipad and initialize it with "iPad".

Write a program to concatenate all the product names and print the list of all the products to the console.

 */
public class AppleProducts {
    public static void main(String[] args) {

        String company = "Apple's product line includes: ";
        String iphone = "iphone 14";
        String macbookPro = "Macbook Pro";
        String appleWatch = "Apple Watch";
        String ipad = "Ipad.";

        String fullAddress= company + iphone + ", " + macbookPro +", " + appleWatch+ ", "+ ipad;

        System.out.println(fullAddress);
    }
}
