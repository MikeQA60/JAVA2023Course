package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point12WhileLoopWithSwitchStatement;

public class FWWL2 {

    public static void main(String[] args) {

    }
    public static int calculateFactorial (int input){

        if(input < 0) {
            return -1; //neg input

        }

        int factorial = 1;

        //1 greater than
        while (input > 0) {

            switch (input){
                default:
                    factorial *= input;
                    break;
            }
            input--;
        }
        return factorial;
    }
}
