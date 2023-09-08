package week3.Class7point0.Class8point4;

import java.util.Scanner;

public class WhatAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is a String?");
        String y = "String is a non-primitive data type where the value is a sequence of characters";
        String x = sc.nextLine();
        System.out.println(x);
        boolean correctAnswer = y.equals(x);
        System.out.println("Correct Answer? " + correctAnswer);
    }
}


