package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point6MethodsWMultParam;

/*
Create a Java program that includes a static method named calculateGDP().
 The method should take four doubles as params - consumption (C), investment (I), governmentSpending (G), and netExports (NX)
  in the same exact order - and calculate the Gross domestic product (GDP) using the formula Y = consumption + investment + governmentSpending
   + netExports. The method should have a void return type, which means it does not return a value but simply
   performs the calculation and prints the result to the console.

Expected Output:

consumption (C): 2000.0 investment (I): 1000.0 government spending (G): 1500.0 net exports (NX): 500.0

5000.0


 */
public class GPD {

        public static void calculateGDP(double consumption, double investment, double governmentSpending, double netExports){
            double GDP = consumption + investment + governmentSpending + netExports;
            System.out.println(GDP);
        }
    }

