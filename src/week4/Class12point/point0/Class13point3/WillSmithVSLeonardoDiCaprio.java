package week4.Class12point.point0.Class13point3;

import java.util.Scanner;

public class WillSmithVSLeonardoDiCaprio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the salary of Will Smith?");
        double willSalary = scanner.nextDouble();

        System.out.println("What is the salary of Leonardo DiCaprio?");
        double leaonardoSalary = scanner.nextDouble();
        if((willSalary) > (leaonardoSalary)){
            System.out.println("Will Smith earns more per movie than Leonardo DiCaprio");

        }else{

            System.out.println("Leonardo DiCaprio earns more per movie than Will Smith");
        }
    }
}

