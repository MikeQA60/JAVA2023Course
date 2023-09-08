package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point19StringEqualsAndIgnoreCase;

public class LoginCredentialsActual {
    public static void main(String[] args) {

    }
        public static boolean checkCredentials(String userName, String password) {

        //                 comparesStringtoanother string ignoring case considerations
            return userName.equalsIgnoreCase("superstar") && password.equals("Hardpassword!");
    }
}
