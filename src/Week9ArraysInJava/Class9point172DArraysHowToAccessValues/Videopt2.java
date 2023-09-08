package Week9ArraysInJava.Class9point172DArraysHowToAccessValues;

import java.util.Arrays;

public class Videopt2 {
    public static void main(String[] args) {

        int[][] arr2d = new int[3][2];

        System.out.println(Arrays.deepToString(arr2d));

        arr2d[0][0] = 42;

        System.out.println(Arrays.deepToString(arr2d)); //[[42, 0], [0, 0], [0, 0]]

    }

    }
