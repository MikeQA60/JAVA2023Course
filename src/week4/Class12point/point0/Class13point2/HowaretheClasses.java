package week4.Class12point.point0.Class13point2;

import java.util.Scanner;

public class HowaretheClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are classes ready? true/false");
        boolean isEasy = scanner.nextBoolean();
        if(isEasy) {
            System.out.println("Don't get relaxed, get ready for the next challenges");

        }
        if(!isEasy) {
            System.out.println("Don't give up! You will succeed as long as you don't quit");
        }
    }
}



