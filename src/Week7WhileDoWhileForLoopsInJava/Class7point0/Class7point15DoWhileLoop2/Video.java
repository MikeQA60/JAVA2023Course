package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point15DoWhileLoop2;

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



        //take input from users
        Scanner sc = new Scanner(System.in);
        String username;
        String password; //has to be defined outside of loop
        // and variables once
        //execute once becuase inside on do while loop
        do {
            System.out.println("Please Enter your username: ");
            //take username and save in string
             username = sc.nextLine();

            System.out.println("Please Enter your password: ");
            password = sc.nextLine();

                //negate // user matches "hello@wedevx.co"
        } while(!username.equalsIgnoreCase("hello@wedevx.co") && !password.equals("abc123$$"));

        //username hello@google.com  ==> true
        //password abc123$$ => false
        //true && false

        //user name and pass wrong then repeats username && pass
        //false && false
        //true && true

        //do i really need both of them to be wrong

        //




    }
}
