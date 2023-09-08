package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point8HashCodeAndEqaulsMethodsOverridingInJava;

import java.util.Objects;

public class BookComparisonpt1 {
    public static void main(String[] args) {

    }
}
// Defining the class "Book"
class Book {
    // Static variable shared across all instances
    public static int lastId;

    // Instance variables for the Book class
    public int id;          // Unique identifier for each book
    public String title;    // Title of the book
    public String author;   // Author of the book
    public int year;        // Publication year of the book
    public String genre;    // Genre of the book

    // Constructor for initializing Book objects
    public Book(String title, String author, int year, String genre) {
        // Convert title, author, and genre to lowercase
        this.title = title.toLowerCase();
        this.author = author.toLowerCase();
        this.year = year;
        this.genre = genre.toLowerCase();

        lastId++; // Increment lastId for the next object
        id = lastId; // Assign the current lastId to the id
    }

    // Override the hashCode method for custom hashing
    @Override
    public int hashCode() {
        return Objects.hash(title, author, genre, year);
    }

    // Override the equals method for custom equality comparison
    @Override
    public boolean equals(Object obj) {
        // Check if both objects refer to the same memory location
        if (this == obj) {
            return true;
        }

        // Check if the provided object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Since the previous checks passed, we cast the object to a Book type
        Book book = (Book) obj;

        // Perform attribute-wise comparison using the equalsIgnoreCase method
        return title.equalsIgnoreCase(book.title) && //compares the titles while ignoring case.
                author.equalsIgnoreCase(book.author) && //compares the authors while ignoring case.
                genre.equalsIgnoreCase(book.genre) && //   compares the genres while ignoring case.
                year == book.year; // compares the publication years directly.

    }
}
