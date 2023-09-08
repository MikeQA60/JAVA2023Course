package Week12OOPInheritanceInJava.Class12point6EncpasulationSetterMethodInJava;

public class BankAccountPt1 {
    public static void main(String[] args) {

    }
    // Define the BankAccount class
    class BankAccount {

        // Private instance variables to store account information
        private String accountName;    // Name of the account holder
        private double initialDeposit; // Initial deposit amount
        private String openingDate;    // Opening date of the account

        // Constructor to initialize instance variables
        public BankAccount(String accountName, double initialDeposit, String openingDate) {
            // Initialize the instance variables using provided values
            this.accountName = accountName;
            this.initialDeposit = initialDeposit;
            this.openingDate = openingDate;
        }

        // Getter methods to access instance variables

        // Return the name of the account holder
        public String getAccountName() {
            return accountName;
        }

        // Return the initial deposit amount
        public double getInitialDeposit() {
            return initialDeposit;
        }

        // Return the opening date of the account
        public String getOpeningDate() {
            return openingDate;
        }

        // Setter methods with validation checks

        // Set the account name with validation for minimum length
        public void setAccountName(String accountName) {
            if (accountName.length() >= 3) {
                this.accountName = accountName;
            } else {
                System.out.println("Account name must be at least 3 characters long.");
            }
        }

        // Set the initial deposit amount with validation for minimum amount
        public void setInitialDeposit(double initialDeposit) {
            if (initialDeposit >= 25.00) {
                this.initialDeposit = initialDeposit;
            } else {
                System.out.println("Initial deposit must be at least $25.00.");
            }
        }

        // Set the opening date of the account (with a print statement)
        public void setOpeningDate(String openingDate) {
            this.openingDate = openingDate;
            System.out.println("Opening date cannot be earlier than January 1, 2020.");
        }
    }
    //In summary, this code defines a BankAccount class with private instance variables for account
    // information and provides methods to set and retrieve these variables.
    // It includes validation checks in the setter methods to ensure data integrity, and it prints appropriate messages if validation fails.
}
