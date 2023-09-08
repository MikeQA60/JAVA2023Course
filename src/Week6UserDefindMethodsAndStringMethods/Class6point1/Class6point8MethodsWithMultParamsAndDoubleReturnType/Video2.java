package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point8MethodsWithMultParamsAndDoubleReturnType;

public class Video2 {
    public static void main(String[] args) {

        //create a class obj  = new classs
        //call method

        Video2 obj = new Video2();

  //call method and save in double      //obj with method name
       double taxAmount =  obj.calculateTax(100000,10);
        //print out
        System.out.println(taxAmount);

        double taxAmount2 = obj.calculateTax(500000, 15);
        System.out.println(taxAmount2);
    }
        //create a method that takes users salary and tax percentand we return a taz amound
        //the user need pay

        //instance method

        public double calculateTax(double salary, int percent){
     //100000 * (10/100)
            //10/100 ==> 0.1
            //10l

            //100k *  0.1
            return salary * (percent/100.0); //0.1
        }
    }

