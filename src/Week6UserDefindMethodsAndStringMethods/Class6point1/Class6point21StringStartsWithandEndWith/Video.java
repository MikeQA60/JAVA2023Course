package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point21StringStartsWithandEndWith;

public class Video {
    public static void main(String[] args) {

        //startsWithMethod() returns boolean and takes a string

        //boolean StartsWith(String str) --> if the Strings starts with the given String (param) then
        //it returns true. Case Sensitive
        //otherwise returns false

        String str = "Hello WeDevX";
       boolean doestrStartWithHello = str.startsWith("Hello"); //return true because string starts with true
        System.out.println(doestrStartWithHello);


        boolean doestrStartWithHello2 = str.startsWith("hello"); //return false bc of case sen
        System.out.println(doestrStartWithHello2);

    }
}
