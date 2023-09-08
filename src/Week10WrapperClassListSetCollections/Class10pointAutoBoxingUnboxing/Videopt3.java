package Week10WrapperClassListSetCollections.Class10pointAutoBoxingUnboxing;

public class Videopt3 {
    public static void main(String[] args) {

        String str3 = "10000";
        int num3 = Integer.parseInt(str3);
        System.out.println(num3*10);  //10000



        String str4 = "12.5";
        double d = Double.parseDouble(str4);
        System.out.println(d-0.5);  //12.0


        String str5 = "true";
        boolean c = Boolean.parseBoolean(str5);
        System.out.println(c); //true


        String str6 = "C";
        char a = str6.charAt(0); //true
    }
}
