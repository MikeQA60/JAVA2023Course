package Week8NestedLoopsandStringBuilderInJava.Class8point0.Class8point8AvoidUsingsStringsLikeThis;

import java.util.Scanner;

public class VideoPt2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        StringBuilder db = new StringBuilder();
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter your name: ");
            String userName = sc.nextLine();

            System.out.println("Enter your age: ");
            String age = sc.nextLine();

            System.out.println("Enter your phone number: ");
            String phonenumber = sc.nextLine();
            //+= compound operator to add concat and more info
            db.append(userName).append(", ").append(age).append(", ").append(phonenumber).append("\n");

            //append is a string method that adds a text to existing text
        }
        System.out.println(db);
    }
}
