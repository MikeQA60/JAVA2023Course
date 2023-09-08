package Week12OOPInheritanceInJava.Class12point6EncpasulationSetterMethodInJava;

public class ComputerPt1 {
    public static void main(String[] args) {

    }
    // Define a class named "Computer"
    class Computer {

        // Private instance variables
        private String brand; // Represents the brand of the computer
        private String model; // Represents the model of the computer
        private int year;     // Represents the manufacturing year of the computer
        private double price; // Represents the price of the computer

        // Constructor to initialize all instance variables
        public Computer(String brand, String model, int year, double price){
           this.brand = brand;
           this.model = model;
           this.year = year;
           this.price = price;
        }

        // Getter methods for private variables
        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return  year;

        }

        public double getPrice() {
            return price;
        }


            // Setter methods for year and price
            public void setYear(int year) {
                this.year = year;
            }

            public void setPrice(double price) {
                this.price = price;


        }
    }
}
