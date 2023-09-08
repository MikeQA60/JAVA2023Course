package Week12OOPInheritanceInJava.Class12point7WhatAreInstanceMethodsJavaOOP;

public class Cryptopt1 {
    public static void main(String[] args) {

    }
}

class Crypto {
    // Private instance variables to store crypto information
    private String name;
    private String symbol;
    private double price;
    private long marketCap;
    private int rank;

    // Constructor to initialize crypto information
    public Crypto(String name, String symbol, double price, long marketCap, int rank) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.marketCap = marketCap;
        this.rank = rank;
    }

    // Getter methods to access instance variables
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public int getRank() {
        return rank;
    }

    // Setter methods with validation checks
    public void setName(String name) {
        // Validation: Name must be at least 3 characters long
        if (name.length() >= 3) {
            this.name = name;
        } else {
            //: This line prints out an error message indicating that the name must be at least 3 characters long.
            System.out.println("Name must be at least 3 characters long.");
        }
    }

    public void setSymbol(String symbol) {
        // Validation: Symbol must be between 3 and 5 characters, all capitalized
        if (symbol.length() >= 3 && symbol.length() <= 5) {
            this.symbol = symbol;
        } else {
            System.out.println("Symbol must be between 3 and 5 characters inclusive and have all letters capitalized.");
        }
    }

    public void setPrice(double price) {
        // Validation: Price cannot be negative
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setMarketCap(long marketCap) {
        // Validation: Market capitalization cannot be negative
        if (marketCap >= 0) {
            this.marketCap = marketCap;
        } else {
            System.out.println("Market capitalization cannot be negative.");
        }
    }

    public void setRank(int rank) {
        // Validation: Rank cannot be negative
        if (rank >= 0) {
            this.rank = rank;
        } else {
            System.out.println("Rank cannot be negative.");
        }
    }

    // Method to calculate the total value of a given quantity of crypto
    public double calculateTotalValue(double quantity) {
        if (quantity > 0) {
            quantity *= price;
            return quantity;
        } else {
            System.out.println("Quantity cannot be negative.");
            return 0.0;
        }
    }

    // Method to print crypto details
    public void printCryptoDetails() {

        System.out.println(name + " (" + symbol + ")" + " - Price: " + price + " USD, " + "Market Cap: " + marketCap + ", Rank: " + rank);
    }
}