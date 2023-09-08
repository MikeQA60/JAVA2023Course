package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point16StringContains;

public class ColdEmailpt2 {
    public static void main(String[] args) {

    }
    public static void sendJobOpportunityAlert(String email) {
        if (email.contains("gmail") || email.contains("yahoo") || email.contains("hotmail")) {
            System.out.println("No open positions");
        } else {
            System.out.println("Job Alert, $200k/year opportunity, apply now");
        }
    }
}
