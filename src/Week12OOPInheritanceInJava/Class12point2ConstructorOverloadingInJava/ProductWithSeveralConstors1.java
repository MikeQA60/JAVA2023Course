package Week12OOPInheritanceInJava.Class12point2ConstructorOverloadingInJava;

public class ProductWithSeveralConstors1 {
    public static void main(String[] args) {

    }

    class Product {

        // Public instance variables to store product information
        public String name;
        public double price;
        public int quantity;

        // Default constructor
        public Product() {
            // Set the default name when a new Product object is created
            name = "Unknown";
        }

        // Constructor with two parameters
        public Product(String prodName, double prodPrice) {
            // Initialize the instance variables with provided values
            name = prodName;
            price = prodPrice;
        }

        // Constructor with three parameters
        public Product(String prodName, double prodPrice, int prodQuantity) {
            // Initialize the instance variables with provided values
            name = prodName;
            price = prodPrice;
            quantity = prodQuantity;
        }
    }
}


  //  class Product {: Defines a class named Product.

  //      Public instance variables:
//
//        public String name;: This variable will store the name of the product.
//        public double price;: This variable will store the price of the product.
//        public int quantity;: This variable will store the quantity of the product.
//        Default constructor:
//
//        public Product() {: This is a constructor method without any parameters. It gets executed when a new Product object is created without providing any values. It sets the default name of the product to "Unknown".
//                Constructor with two parameters:
//
//public Product(String prodName, double prodPrice) {: This constructor takes two parameters: prodName for the product name and prodPrice for the product price. It initializes the instance variables with the provided values.
//                    Constructor with three parameters:
//
//public Product(String prodName, double prodPrice, int prodQuantity) {: This constructor takes three parameters: prodName for the product name, prodPrice for the product price, and prodQuantity for the product quantity. It initializes the instance variables with the provided values.
//                        In summary, this code defines a Product class with constructors to create instances of products. The constructors allow creating objects with different combinations of name, price, and quantity. The default constructor sets the name to "Unknown" if no values are provided. The class has public instance variables to store the product information.