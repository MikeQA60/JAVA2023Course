package week2point2.Class4point1;
//example 5
/*
Write a program that generates an invoice for a product. The invoice should include the following information:

___ productName  = ____;
___ quantity = _____;
____ price = _____;

Use string concatenation to generate the invoice in the following format:

Invoice for: [Product Name]
Quantity: [Quantity]
Price: $[Price]
Total: $[Total Amount]


Expected Output:

Invoice for: Notebook
Quantity: 2
Price: $1500.0
Total: $3000.0
 */

public class CreateanInvoice {
    public static void main(String[] args) {

      String productName  = "Notebook";
        String quantity = "2";
        String price = "$1500.0";
        String Total = "$3000.0";

        String wrapitup = "Invoice for: " + productName + "\n" + "Quantity: " + quantity+ "\n" + "Price: " + price + "\n"
        + "Total: " + Total;

        System.out.println(wrapitup);
    }
}
