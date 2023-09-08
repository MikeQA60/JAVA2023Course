package Week9ArraysInJava.Class9point13ArraysClassMethods;

import java.util.Arrays;

public class Videopt4 {

    public static void main(String[] args) {


        //equal method
        String[] strArr1 = {"hello", "superstar"};
        String[] strArr2 = {"hello", "superstar"};

        boolean isEqual = Arrays.equals(strArr1, strArr2);
        System.out.println(isEqual); //returns true becuase of literal values being same
    }

}