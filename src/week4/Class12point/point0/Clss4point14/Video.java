package week4.Class12point.point0.Clss4point14;

import java.util.Scanner;

public class Video {
    public static void main(String[] args) {
        //write a program that prints out the sc0ore for a given grade
        //A - 100
        //B - 80
        //C --> 70
        // D --> 50
        //F --> 20

        Scanner sc = new Scanner(System.in);

        //          syntax to get char from a scanner
        char grade = sc.next().charAt(0);

        //5 conditions
        //one if then
        // 4 else
        if (grade == 'A') {
            System.out.println(100);
        } else if (grade == 'B') {
            System.out.println(80);

        } else if (grade == 'C') {
            System.out.println(70);


        } else if (grade == 'D') {
            System.out.println(60);


        } else if (grade == 'F') {
            System.out.println(20);
        }
    }
}