package week2point2.Class6point2;

/*
Class 6.2 - %s Format Specifier Practice
Practice and reinforce your understanding of the %s format specifier in Java, including how to use it for
 formatting string values,
through a series of hands-on exercises and challenges in this %s Format Specifier Practice tutorial.
 */
public class Video {
    public static void main(String[] args) {

        String firstName = "Elon";
        String lastName = "Musk";
        System.out.printf("First: %s Second: %s", firstName, lastName);

        String quote = "I dont give a damn about your diploma";
        // next line,escape char for quote, format specifier for string, another double quote
        System.out.printf("\n\"%s\"",quote);


    }
}
