package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point11MethodsWithMultipleParansandCharReturnType;

public class Test {


    public static String createInitials(String firstName, String lastName){
        char firstNameCharacter = firstName.charAt(0);
        char lastNameCharacter = lastName.charAt(0);

        String initials = String.format("%c%c, firstNameCharacter, lastNameCharacter");
        return initials;
    }
}
