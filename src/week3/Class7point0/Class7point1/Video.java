package week3.Class7point0.Class7point1;

import java.util.Scanner;

public class Video {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age?");

        int age = sc.nextInt();

        System.out.println("Your age is " + age);

        System.out.println("How many cars do you have?");
        int cars = sc.nextInt();
        System.out.println("I have " + cars);

        //string with int
        //whenever you are using anything besides nextline() before using nextLine()
        //you have to eat the last line that methods like next(), nextInt() leave after themselves
        sc.nextLine();

        String name = sc.nextLine();
        System.out.printf("My name is: %s, I'm %d y.o, I have %d cars " , name, age, cars);
    }
}
