package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point5ParamPrac;

import java.util.Scanner;

public class Video {
    public static void main(String[] args) {

        //take input from user
      //  Scanner sc = new Scanner(System.in);
        //i want to take a name/ take input from user
     //   System.out.println("What is your name?");

        //saving      take
     //   String var = sc.nextLine();

    //call methods
    printUsersName("Elon");

    //
        printUsersName("Miguel");

}
//methods are actions

    //void method

    //give a parameter(what type of info im expecting)
    //string dt                      string value
    public static void printUsersName(String var){
        //
      //  String name = "Miguel";      //print var (b/c string value)

        //designed method to be dynamic
        System.out.println("Welcome " + var);

//        What is your name?
//        Jon
//        Welcome Miguel

    }
}
