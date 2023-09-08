package week2point2.Class6point1;

//example 1

/*
Lamborghini model and it's starting price include:

Lamborghini Huracan: $222k

Write a program that will print out the Lamborghini Model: price by declaring a make, model and price variables and using printf()

______ make = _____;
______ huracanModel = ____;
______ hurancanPrice = _____;


//add a system printf statement



Expected Output:

Lamborghini Huracan: $222k
 */
public class Lambo {
    public static void main(String[] args) {
        String make = "Lamborghini ";
        String  huracanModel = "Huracan";
        String hurancanPrice = "222k";
        System.out.printf("%s%s: $%s", make, huracanModel, hurancanPrice);

    }
}
