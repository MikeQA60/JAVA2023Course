package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point13MethodsWithSwtichStatement;

public class Video {
    public static void main(String[] args) {

        //
     boolean var1  =   doesNeedAVisa("USA");
        System.out.println(var1);
        boolean var2  =   doesNeedAVisa("France");
        System.out.println(var2);
    }

//write a method that takes a String for a country of citizenship
//and return true if the country is USA or Canada
//otherwise retrun true;
//true --> means user needs a visa
//false user doesnt need a visa

    public static boolean doesNeedAVisa(String countryOfResidence) {


        switch (countryOfResidence) {
            case "USA":
            case "Canada":
                return false;
            default:
                return true;
        }

    }
}