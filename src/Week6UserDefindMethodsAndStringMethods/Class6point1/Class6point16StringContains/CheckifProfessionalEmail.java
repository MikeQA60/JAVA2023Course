package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point16StringContains;

public class CheckifProfessionalEmail {
    public static void main(String[] args) {

    }


    public static boolean isProfessionalEmail(String email) {
        if (email.contains("@gmail.com") || email.contains("yahoo.com") || email.contains("hotmail.com")) {
            System.out.println("Gmail, Yahoo, Hotmail.");
        } else {
           System.out.println("false");


        }
        return true;
    }
}