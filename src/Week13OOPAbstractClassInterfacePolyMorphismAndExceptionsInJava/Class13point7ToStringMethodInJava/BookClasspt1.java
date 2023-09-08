package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point7ToStringMethodInJava;

public class BookClasspt1 {
    public static void main(String[] args) {

    }
}
// Defining the class "Book"
class Book {
    // Private instance variables for the Book class
    private String title; //An instance variable to store the title of the book.
    private String author; //An instance variable to store the author of the book.
    private int year; // An instance variable to store the publication year of the book.
    private String genre; //An instance variable to store the genre of the book.

    //This constructor initializes the attributes of the Book objects.
    // It takes in the title, author, year, and genre as parameters and assigns them to the corresponding instance variables.
    // Constructor for initializing Book objects
    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author +
                "\nPublication Year: " + year +
                "\nGenre: " + genre + "\n";
    }
}




//   Overall, this code defines a class Book with attributes and methods to represent a book.
//   The toString() method provides a nicely formatted representation of the object for display purposes.
