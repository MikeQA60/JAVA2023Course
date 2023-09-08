package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point9MethodsWithIfStatementBooleanReturnType;

public class Pt3 {
    public static boolean posititveNumber(int numberChecked){
        boolean positiveNumber = false;
        if(numberChecked > 0){
            positiveNumber = true;
        } else{
            positiveNumber = false;
        }
        return positiveNumber ;
    }
}
