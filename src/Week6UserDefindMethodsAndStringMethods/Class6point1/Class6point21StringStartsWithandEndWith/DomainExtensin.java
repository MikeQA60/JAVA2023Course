package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point21StringStartsWithandEndWith;

public class DomainExtensin {
    public static void main(String[] args) {

    }

    public static boolean checkDomain(String domain){
        //checking if strings input ends with .com etc
        if (domain.endsWith(".com") || domain.endsWith(".org") || domain.endsWith(".net")) {

            //if it is return true
            return true;

            //
        }else {

            //otherwise false
            return false;
        }
    }
}
