package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point7MethodsWithMulParaandIntReturnType;

public class Video2 {
    public static void main(String[] args) {


        int var = multiply(30,42);
        System.out.println(var);


        //save in var    //call method
     int average =   calculateAverage(10,40,55,66);
        System.out.println(average);
    }

    public static int multiply(int num1, int num2) {
        return  num1*num2;
    }

        //create a method that takes 4 int values and returns the average of those values

        public static int calculateAverage(int num1, int num2, int num3, int num4) {

            //create an interger
            int average = (num1+num2+num3+num4)/4;

         return average;
        }
    }
