package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point10MultiLevelAbstraction;

public class MultiLevelAbstractionVideo {

    public static void main(String[] args) {
        Product phone =  new Electronics("Phone", 999.99, "Iphone 14");
        Books books =  new Books("American Dream", 9.99, "Walter Issacson");

        phone.getProductInfo();
        books.getProductInfo();

        System.out.println(phone.getProductType());
        System.out.println(books.getProductType());

        System.out.println(phone.calculateShippingCost());
        System.out.println(books.calculateShippingCost());
    }
}

abstract class ShippingProvider {
    public abstract  double calculateShippingCost();

}

abstract class Product extends ShippingProvider {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public abstract String getProductType();

    public void getProductInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

//concrete class means non abstract class
class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }




    @Override
    public double calculateShippingCost() {
    return 10.0;
}
@Override
public String getProductType() {
    return "Electronics";

  }
}

class Books extends Product{
    private String author;

    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public double calculateShippingCost() {
        return 3.0;
    }

    @Override
    public String getProductType() {
        return "Books";
    }
}

