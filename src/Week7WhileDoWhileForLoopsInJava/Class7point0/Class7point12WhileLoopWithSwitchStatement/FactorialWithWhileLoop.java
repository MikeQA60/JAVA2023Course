package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point12WhileLoopWithSwitchStatement;

public class FactorialWithWhileLoop {
    public static void main(String[] args) {

    }
    public static int calculateFactorial (int input) {
        if (input < 0) {
            return -1;

        }else if (input==0){
            return 1;
        }else {
            int result = 1;
            while (input > 0){
                switch (input) {
                    default:
                        result*=input;
                        input--;
                }
            }
            return result;
        }
    }
}
