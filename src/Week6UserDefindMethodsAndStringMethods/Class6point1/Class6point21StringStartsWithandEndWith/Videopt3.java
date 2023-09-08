package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point21StringStartsWithandEndWith;

public class Videopt3 {

    //boolean endsWith(String str) ==> returns true if the String ends with the given String
    //otherwise it returns false
    public static void main(String[] args) {


        String str5 = "Apple is the Biggest Company.";
        boolean b5 = str5.endsWith("Company");//true
        System.out.println(b5);

      boolean b6 =  str5.endsWith("Apple"); //false
        System.out.println(b6);
    }

}
