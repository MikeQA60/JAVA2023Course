package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point12MethodsWithMultipleParamsandDoubleReturnType;

public class MultiplyPostiveDoubles {


    //method since it is a dollar amount it double   //datatype
    public static double multiplyPositiveDoubles(double number1, double number2){

        //num1 greater than 0 //num2 greter than 0
        if(number1 > 0 && number2 > 0){

            //datatype and a datatype
            double multiplication = number1*number2;
            //return amount
            return multiplication;

            //if not multiplying //only have else if true or false still return else
        }else{

            //then it should be a neg number
            return -1;
        }
    }
}
