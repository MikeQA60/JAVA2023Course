package week2point2.Class5point5;

/*
Class 5.5 - Arithmetic Operators Practice
Practice and reinforce your understanding of arithmetic operations in Java, including the use of operators such as plus, minus,
multiply, divide, and modulo, through a series of hands-on exercises and challenges in this Arithmetic Operator Practice tutorial.
 */
public class video {
    public static void main(String[] args) {

       double iPhone24price = 15000;
       double quantity = 6;
       double total = iPhone24price * quantity;
       double discount = 0.15;
       double finalPrice = total - (total * discount);
       double tax = 0.15;
       double finalTotal = finalPrice + (finalPrice * tax);

        System.out.println("Iphone 24 price: $" + iPhone24price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total before discount: $" + total);
        System.out.println("discount: " + discount);
        System.out.println("Final price after discount: $" + finalPrice);
        System.out.println("Tax %:" + tax);
        System.out.println("Final Total: $" + finalTotal);


    }
}
