package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point16StringContains;

public class profemailpt2 {
    public static void main(String[] args) {

    }
    public static boolean isProfessionalEmail(String emailAddress) {
        return !emailAddress.contains("@gmail.com") && !emailAddress.contains("@yahoo.com")
                && !emailAddress.contains("@hotmail.com");
    }
}