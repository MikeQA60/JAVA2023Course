package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point0;

public class Test {
    public static double calculatePropertyTax(double assessedValue , double taxRate, double exemptions) {
        double taxableValue = assessedValue  - exemptions;

        double annualPropertyTax = taxableValue * taxRate / 100;

        return annualPropertyTax;
    }
}
