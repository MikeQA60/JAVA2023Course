package week2point2.Class6point3;

/*
Class 6.3 - %c Format Specifier
Discover the use of the %c format specifier in Java for formatting characters, including
how to use it with the printf method, placeholders, and more, in this comprehensive %c Format Specifier tutorial.
 */
public class Video {
    public static void main(String[] args) {
        //%c -- > format specifier for a character

        char grade = 'A';
        System.out.printf("Your grade for the last exam: %c",grade);

        char gender = 'F';
        System.out.printf("\nUser's gender: %c",gender);

        String name = "Minnie Mouse";

        //
        System.out.printf("\nName: (%s), Gender: %c, exam grade: %c", name,gender, grade);

    }
}
