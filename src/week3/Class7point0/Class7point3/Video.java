package week3.Class7point0.Class7point3;

/*
Class 7.3 - Scanner nextBoolean()
Discover how to use the nextBoolean() method of the Scanner class in
 Java to read boolean input from the user, including how to handle exceptions and errors,
 in this comprehensive Scanner Class nextBoolean() tutorial.
 */
import java.util.Scanner;

public class Video {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("type true if satisfied or false if not false satisfied");
        boolean isSatisfied = input.nextBoolean();
        System.out.println("is customer satisfied? " + isSatisfied);

        System.out.println("reset iphone to default settings? ");
        boolean reset = input.nextBoolean();
        System.out.println("Iphone is reset to default settings " + reset);
    }
}
