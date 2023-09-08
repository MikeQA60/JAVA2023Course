package week2point2.Class6point1;

/*
Class 6.1 - %s - Format Specifier
Learn about the use of the %s format specifier in Java for formatting string values, including how to use it
with the printf method, placeholders, and more, in this comprehensive %s Format Specifier tutorial.
 */
public class Video {
    public static void main(String[] args) {

        String hello = "Hello World!";

        //"%s" --> specifies that we want to replace this %s(specifer) with a String.
        // and the string that we specify is going to be replaced as is without any changes
        //or additions

        //prints out hello world
        System.out.printf("%s",hello);

        //print out tesla and xx

        String carMake = "Tesla";
        String carModel = "X";
        //replaced by one string and another string
        //  \n is to go to next line
        System.out.printf("\n%s %s",carMake, carModel);

        String carMake2 = "Rolls Royce";
        String carModel2 = "Cullianan";
        String price = "350k";

        System.out.printf("\n%s %s costs $%s",carMake2,carModel2,price);
        System.out.println("\n" + carMake2 + " " + carModel2 + " costs $" + price);

    }
}
