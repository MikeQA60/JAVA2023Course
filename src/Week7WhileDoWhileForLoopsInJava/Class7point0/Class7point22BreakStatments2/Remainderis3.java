package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point22BreakStatments2;

public class Remainderis3 {
    public static void main(String[] args) {

    }

    public static int findRemainder(int n) {
        if (n <= 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 3) {
                result = i;
                break;


            }
        }

        return result;
    }
}
