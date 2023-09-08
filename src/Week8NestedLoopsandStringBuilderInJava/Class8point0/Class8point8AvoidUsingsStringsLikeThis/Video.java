package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point8AvoidUsingsStringsLikeThis;

import java.util.Scanner;

public class Video {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);


        System.out.println("Enter your name: ");
        String userName = sc.nextLine();

        System.out.println("Enter your age: ");
        String age = sc.nextLine();

        System.out.println("Enter your phone number: ");
        String phonenumber = sc.nextLine();

        String db = userName + ", "+ age + ", " + phonenumber;
        System.out.println(db);
    }
}
