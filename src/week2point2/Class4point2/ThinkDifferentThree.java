package week2point2.Class4point2;

//example 5
/*
Write a program that declares a String that stores the following message on multiple lines:
using \n to break the line and include double quotes. Then prints out the value of the String.

____ apple = _____;
System.out.println(apple);

Expected Output:

Apple Inc.
"Think Different"
 */
public class ThinkDifferentThree {
    public static void main(String[] args) {
        String apple = "Apple Inc.\n" +
                "\"Think Different\"";
        System.out.println(apple);


    }
}
