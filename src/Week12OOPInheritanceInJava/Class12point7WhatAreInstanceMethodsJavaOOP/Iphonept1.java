package Week12OOPInheritanceInJava.Class12point7WhatAreInstanceMethodsJavaOOP;

public class Iphonept1 {
    public static void main(String[] args) {

    }
}

class Phone {
    // Private instance variables to store phone information
    private String brand;
    private String model;
    private int price;

    // Default constructor to initialize variables with default values
    public Phone() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0;
    }

    // Getter methods to access instance variable values
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    // Setter methods with validation checks for setting instance variable values
    public void setBrand(String brand) {
        // Method to set the brand of the phone

        if (brand != null && !brand.isEmpty()) {
            // Check if the provided 'brand' parameter is not null and not an empty string

            this.brand = brand;
            // Assign the value of the 'brand' parameter to the instance variable 'brand'
        }
    }

    public void setModel(String model) {
        // Method to set the model of the phone

        if (model != null && !model.isEmpty()) {
            // Check if the provided 'model' parameter is not null and not an empty string

            this.model = model;
            // Assign the value of the 'model' parameter to the instance variable 'model'

        }
    }
    public void setPrice(int price) {
        // Method to set the price of the phone

        if (price >= 0) {
            // Check if the provided 'price' parameter is greater than or equal to 0

            this.price = price;
            // Assign the value of the 'price' parameter to the instance variable 'price'
        }
    }

    // Method to display phone details
    public void displayPhoneDetails() {
        // Print a formatted string containing the brand, model, and price of the phone
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }

    // Method to simulate making a call
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    // Method to simulate sending a message
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending message to " + phoneNumber + ": " + message);
    }

    // Method to increase the price of the phone
    public void increasePrice(int amount) {
        // Method to increase the price of the phone by the specified amount

        if (amount >= 0) {
            // Check if the provided amount is non-negative (greater than or equal to 0)

            price += amount;
            // If the amount is valid, increase the price of the phone by the given amount

            System.out.println("Price increased by " + amount);
            // Print a message indicating that the price has been increased by the given amount
        } else {
            // If the provided amount is negative

            System.out.println("Invalid amount");
            // Print a message indicating that the provided amount is invalid (negative)
        }
    }
}

//

