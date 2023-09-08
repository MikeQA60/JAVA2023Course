package week4.Class12point.point0.Class12point2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What the weather like?");
        int weather = input.nextInt();

        if (weather < 32) {
            System.out.println("it's freezing outside! Stay home");
        }

        if (weather >= 32 && weather < 42) {
            System.out.println("it's little chilly outside");
        }

        if (weather >= 42 && weather < 68) {
            System.out.println("it's a good weather outside. Go get some Fresh air.");
        }

        if (weather >= 68) {
            System.out.println("it's amazing outside. let's go to pool and vitamin D.");
        }


    }
}

