package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point14StringCharAt;

public class CreateInitials {
    public static String createInitials(String fristName, String lastName){

        //sting with variable printing out first letter from last name and first name
        return (String.valueOf(fristName.charAt(0)) + lastName.charAt(0));
    }
}
