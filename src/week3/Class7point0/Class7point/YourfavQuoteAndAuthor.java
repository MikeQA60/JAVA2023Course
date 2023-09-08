package week3.Class7point0.Class7point;

import java.util.Scanner;

public class YourfavQuoteAndAuthor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String favoritequote  = input.nextLine();
        String author = input.nextLine();

        System.out.println("What is your favorite quote? ");
        System.out.println("Who is the author? ");
        System.out.println('"' + favoritequote + '"' + " - "+author);

    }
}
