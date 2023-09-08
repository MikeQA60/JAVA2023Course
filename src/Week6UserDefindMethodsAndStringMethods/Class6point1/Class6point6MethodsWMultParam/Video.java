package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point6MethodsWMultParam;

public class Video {
    public static void main(String[] args) {


        printUserInfo("Miguel", 30);
        printUserInfo("Delfino", 50);

    }
    //write a method that print out the following user info
    //name and age

    //start from the body

    //                            parameter name and give some meaning to variable
    public static void printUserInfo(String name, int age) {
        System.out.println("Welcome " + name);
        System.out.println("Your age is " + age);
    }
}
