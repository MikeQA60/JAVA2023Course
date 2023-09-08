package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point16StringContains;

public class JobOpportunityColdEmail {

    public static void main(String[] args) {

    }

    public static void sendJobOpportunityAlert(String emailAddress) {

        //if statment
        if (!emailAddress.contains("gmail") && !emailAddress.contains("yahoo") && !emailAddress.contains("yahoo") && !emailAddress.contains("hotmail")) {
            System.out.println("Job Alert, $200k/year opportunity, apple now");
        } else {
            System.out.println("No open postions");
        }
    }
}
