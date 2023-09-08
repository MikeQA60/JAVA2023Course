package Week5NestedIf.Class5point26;

public class MethodsWithReturnTypeVideo {
    public static void main(String[] args) {
        //save in int variable
        int var = sum();
        System.out.println(var);


      int var2 =  sum1();
        System.out.println(var2);

     int var3  =  divide();
        System.out.println(var3);
        int var4 = divide();
        System.out.println(var4);
}
//i want to write a mthod funtion that returns sum of
    //10 and 5


public static int sum() {
    return 10 + 5;
}

//you can not have methods with same exact signature

public static int sum1() {
    int num1 = 20;
    int num2 = 50;

    return num1 * num2;

}
public static int divide() {
    System.out.println("I am a divide method and I am about to divide two numbers");

    //what are local varibles? are the variables that are defined inside a specific scope like, methods,
    //if , switch statments

    int num1 = 100;
    int num2 = 20;

return  num1/num2;
    }
}
