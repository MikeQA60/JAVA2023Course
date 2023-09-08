package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point8MethodsWithMultParamsAndDoubleReturnType;

public class PropertyTaxCalculator {
    public static double calculatePropertyTax(double assedValue, double taxRate, double exemptions) {
        double taxableValue = assedValue - exemptions;

        double calculatePropertyTax = taxableValue * taxRate / 100;

        return calculatePropertyTax;
    }
}