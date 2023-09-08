package Week11MapCollectionsAndIntrotoClassesAndObjectsInJava.Class11point19JavaOOPWhatIsAConstructor;

/*
Description: Create a class called "CreditCard" that represents a credit card.

The class should have five public instance variables: "cardNumber" (String), "cardHolderName" (String), "creditLimit" (double), "currentBalance" (double), and "isBlocked" (boolean).

Instance Variables:

cardNumber (String): Represents the credit card number.

cardHolderName (String): Represents the name of the cardholder.

creditLimit (double): Represents the maximum credit limit on the card.

currentBalance (double): Represents the current balance on the card.

isBlocked (boolean): Represents whether the card is blocked or not.

And a default no-param constructor that prints out "Hello from Constructor"
 */
public class CreateADefaultConstuctor {
    public static void main(String[] args) {

        class CreditCard {
            // Public instance variables
            public String cardNumber;
            public String cardHolderName;
            public double creditLimit;
            public double currentBalance;
            public boolean isBlocked;

            // Default constructor
            public CreditCard() {
                System.out.println("Hello from Constructor");
            }
        }
    }
}
