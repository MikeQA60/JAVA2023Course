package week3.Class7point0.Class8point3;


import java.util.Scanner;

public class Video {
    public static void main(String[] args) {
        System.out.println("Please enter the maximum wind speed in your region: ");


        Scanner scanner = new Scanner(System.in);
        int averageRainfall = 40;
        int minimumRainfall = scanner.nextInt();
        boolean rainFall = minimumRainfall >= averageRainfall;
        System.out.println(" System.out.println(\"Please enter the maximum wind speed in your region: \")");
        System.out.println("Does it meet the minimum requirement? " + rainFall);
    }
}

//        int rainfall = 40;
//        boolean israinfall = rainfall >= 50;

//        int wmph = 30;
//        int apitree = 50;
//
//        boolean mwph = wmph <= apitree;
//
//
//        System.out.println("You can grow apricot: " + mwph);

