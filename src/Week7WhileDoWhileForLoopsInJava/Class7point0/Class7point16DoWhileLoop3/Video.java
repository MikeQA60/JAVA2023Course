package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point16DoWhileLoop3;

import java.util.Scanner;

public class Video {

    //write a program that takes the input from the user for username
    // and password
    //if username matches "hello@wedex.co"
    //and if the password matches "abc123$$"

    //then say welcome username

    //other tell the user to enter the credentials again

    //ex output:

    //please enter your login: hello@tesla.com
    //please enter your username: abc123

    //invalid credentials
    //please enter your login: hello@tesla.com
    //please enter your username: abc123
    public static void main(String[] args) {

        //take user
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        //ask user
        String username = sc.nextLine();




        System.out.println("Please enter your password: ");
        String password = sc.nextLine();

        if (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$")) {
            System.out.println("Invalid Credentials");
        }

        //String username = "";
        // String password = "";

        while (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$")) {

            System.out.println("Please enter your username: ");
            username = sc.nextLine();


            System.out.println("Please enter your password: ");
            password = sc.nextLine();

            if (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$")) {


            }

        }
        System.out.println("Invalid Credentials");
    }
}
