package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point16StringContains;

public class IsRightDomain {
    public static void main(String[] args) {

    }
    public static boolean checkEmailDomain(String emailAddress) {
        return emailAddress.contains("devxschool.com") || emailAddress.contains("wedevx.co")
                || emailAddress.contains("wedevx.com");
    }
}
