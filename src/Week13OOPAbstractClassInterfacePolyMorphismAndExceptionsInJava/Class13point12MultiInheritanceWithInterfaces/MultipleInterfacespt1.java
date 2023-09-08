package Week13OOPAbstractClassInterfacePolyMorphismAndExceptionsInJava.Class13point12MultiInheritanceWithInterfaces;

public class MultipleInterfacespt1 {
    public static void main(String[] args) {
        Product product = new OnlineProduct();
        Shipping product2 = new OnlineProduct();
        Payment product3 = new OnlineProduct();

        OnlineProduct product4 = new OnlineProduct();
        product4.displayInfo();

    }
}

interface Product {
    void displayInfo();
}

interface  Shipping {
    void calculateShipping();

}

interface Payment {
    void processPayment();

}


class OnlineProduct implements  Product, Shipping, Payment {

    @Override
    public void displayInfo() {

    }

    @Override
    public void calculateShipping() {

    }

    @Override
    public void processPayment() {

    }
}
