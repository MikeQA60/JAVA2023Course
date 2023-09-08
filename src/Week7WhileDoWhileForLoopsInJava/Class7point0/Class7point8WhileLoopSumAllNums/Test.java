package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point8WhileLoopSumAllNums;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int number, i = 1, exponent;
        long po = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        number = sc.nextInt();

        System.out.print(" Please Enter the Exponent Value : ");
        exponent = sc.nextInt();
        while (i <= exponent) {
            po = po * number;
            i++;
        }
    }
}


