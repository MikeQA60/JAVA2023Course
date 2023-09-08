package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point17StringisEmpty;

public class PasswordValidation {
    public static void main(String[] args) {

    }
    public static void login(String userName, String  password) {
        //
        if (!userName.isEmpty() || !password.isEmpty()) {

            //
            if (userName.isEmpty())
                System.out.println("Username is empty");

            //
            else if (password.isEmpty())
                System.out.println( "Password is empty");
            //
            else if (userName.equals("superstar") && password.equals("password123"))
                System.out.println("Logging in");

            //
            else
                System.out.println("Invalid credentials");
        }
    }
}