package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point15StringConcat;

public class Videopt2 {

    public static void main(String[] args) {
         String str1 = "Hello";
         String str2 = "Superstars";

         //concat return a string

        //saved in finalstring         // Hello calls Superstars
       String finalString =  str1.concat(str2);

       //Calls hello superstars
        System.out.println(finalString);

        //methods     //result is opposite
        String finalStr2 = str2.concat(str1);
        System.out.println(finalStr2);


        //String is an immutable class/object
        //it means that the orignal value of a String can not be motifieid via methods
    }
}
