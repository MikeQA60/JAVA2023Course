package week3.Class7point0.Class7point1;

import java.util.Scanner;

public class Howmanygoalsdidyouachieve {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many goals did you close today?");
        int goals = sc.nextInt();

        System.out.println("Good job on closing " + goals +  " goals today");
    }
}
