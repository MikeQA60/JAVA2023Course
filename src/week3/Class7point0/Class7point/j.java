package week3.Class7point0.Class7point;

import java.util.Scanner;

//video
public class j {
    public static void main(String[] args) {

        //scammer class, comes from jdk
        //variable

        Scanner input = new Scanner(System.in);

        //input.next  only takes a single word string
        String name = input.nextLine();
        String address = input.nextLine();
        String company1 = input.nextLine();


        //input.nextline takes the whole string

        //3 inputs
        System.out.println("Welcome " + name);
        System.out.println("Your address is: " + address);
        System.out.println("CEO of " + company1);

    }
}
