package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point21StringStartsWithandEndWith;

public class CheckifPhoneNumberisAChicagoNumber {
    public static void main(String[] args) {

    }
    public static boolean isChicagoPhoneNum(String phone1) {
        if (phone1.startsWith("312") || phone1.startsWith("773")) {
            return true;
        }else{
            return false;
        }
    }
}
