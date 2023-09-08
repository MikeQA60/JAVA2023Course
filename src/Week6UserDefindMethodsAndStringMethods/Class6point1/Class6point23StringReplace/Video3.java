package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point23StringReplace;

public class Video3 {



            //takes string
    //replaceFirst(String old, String new)
    //it only replaces the first occurrence

    public static void main(String[] args) {

        String str7 = "Hello World, DevX, WeDevX";
//save in a string
     String str =  str7.replaceFirst("DexX", "WeDevX");

                               //relaces only first occurence from ""Hello World, DevX, WeDevX"" to
        System.out.println(str); //Hello World, DevX, WeDevX

    }
}
