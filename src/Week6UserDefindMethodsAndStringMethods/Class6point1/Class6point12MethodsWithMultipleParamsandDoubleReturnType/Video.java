package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point12MethodsWithMultipleParamsandDoubleReturnType;

public class Video {
    public static void main(String[] args) {

        //
      double amount =  calculateTax(100000,true);
        double amount2 =  calculateTax(100000,false);
        System.out.println(amount);
        System.out.println(amount2);
    }


    //write a method that takes users salary and whether the user is married or not?
    //if the user makes less than 100k and married ==> 5%
    //if the user is not married and makes less than  100l ==> 8%

    //if the user is married and makes over 100k than the tax is 10%


    //if the user not married and makes over $100l then the tax is 15%
    //method should return the tax amount to be paid



    public static double calculateTax(double salary, boolean isMarried) {

        if (salary < 100000 && isMarried) {
            return salary * 0.05;
            //
        } else if (salary < 100000 && !isMarried) {
            return salary * 0.08;

        } else if (salary >= 100000 && isMarried) {
            return salary * 0.1;

        } else if (salary >= 100000 && !isMarried) {
            return salary * 0.15;
// if not statements are true
        }else {

            return 0;
        }

    }
}
