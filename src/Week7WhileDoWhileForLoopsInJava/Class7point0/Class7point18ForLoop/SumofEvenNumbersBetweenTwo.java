package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point18ForLoop;

public class SumofEvenNumbersBetweenTwo {
    public static void main(String[] args) {

    }

    public static int sumOfEvenNumbers(int num1, int num2) {

        if (num1 > num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

    }

    int sumEven = 0;
    for(
    int i = num1 + 1;i<num2;i++)

    {
        if (i % 2 == 0) {
            sumEven += i;
        }
    }

    return sumEven;
}

}
