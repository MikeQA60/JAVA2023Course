package week2point2.Class6point2;

//ex 1

/*
Lamborghini's corporate motto is "Passion for the Brand, Performance for the Road".

Ferrari's corporate motto is "Driven by Passion, Devoted to Performance".

Bugatti's corporate motto is "Art, Shape, Technology".

Write a program that will print out Lamborghini's corporate motto by declaring variables for the make, model, and moto of each supercar company.

___ lamborghini = ______;
___ ferrari = ______;
___ bugatti = ______;

___ lamborghiniMotto = ______;
___ ferrariMotto = ______;
___ bugattiMotto = ______;

//write system printf() statement to print out Lamborghini's corporate motto
//write system printf() statement to print out Ferrari's corporate motto
//write system printf() statement to print out Bugatti's corporate motto



Expected Output:

Lamborghini's corporate motto is "Passion for the Brand, Performance for the Road"
Ferrari's corporate motto is "Driven by Passion, Devoted to Performance"
Bugatti's corporate motto is "Art, Shape, Technology"
 */


public class PassforTheBrandPerffortheRoad {
    public static void main(String[] args) {
        String lamborghini = "Lamborghini" ;
        String ferrari = "Ferrari";
        String  bugatti = "Bugatti";

        String lamborghiniMotto = "Passion for the Brand, Performance for the Road";

        System.out.printf("%s's corporate motto is \"%s\"",lamborghini, lamborghiniMotto);
        String ferrariMotto = "Driven by Passion, Devoted to Performance";
        System.out.printf("\n%s's corporate motto is \"%s\"",ferrari, ferrariMotto);
        String bugattiMotto = "Art, Shape, Technology";
        System.out.printf("\n%s's corporate motto is \"%s\"",bugatti, bugattiMotto);

//write system printf() statement to print out Lamborghini's corporate motto
//write system printf() statement to print out Ferrari's corporate motto
//write system printf() statement to print out Bugatti's corporate motto



    }
}
