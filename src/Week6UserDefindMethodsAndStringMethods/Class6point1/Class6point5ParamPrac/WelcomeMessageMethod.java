package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point5ParamPrac;

/*
Write a static method called welcomeMessage() with a String param for the company name and prints out a welcome
 message for the company's customers or clients, such as "Welcome to X, your home to level up your entire game!".

Expected output:

Welcome to X, your home to level up your entire game!


Where x is the value of the param in the wedevxMessage() method.

Note:
You don't need to create a Main class; jump right into implementing the method.
 The Main class and main method are handled in the backend. Once done implementing the method just go ahead to run and submit.
From now on, it will get hard to cheat on the exercises. :)
 */
public class WelcomeMessageMethod {

        public static void welcomeMessage(String company) {
            //write your code here
            System.out.println("Welcome to " + company + ", your home to level up your entire game!");
        }

        public static void Main (String[]args){
            welcomeMessage("wedevx.co");

        }

    }

