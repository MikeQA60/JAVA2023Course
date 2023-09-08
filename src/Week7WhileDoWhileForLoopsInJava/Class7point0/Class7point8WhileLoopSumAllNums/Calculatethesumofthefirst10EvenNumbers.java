package Week7WhileDoWhileForLoopsInJava.Class7point0.Class7point8WhileLoopSumAllNums;

public class Calculatethesumofthefirst10EvenNumbers {
    public static void main(String[] args) {
        int num = 2;

        int sum = 0;

        int count = 0;

        while (count < 10){
            sum += num;
            System.out.println("Sum so far: " +sum);
            num +=2;
            count++;
        }

        System.out.println("Sum of the first 10 even numbers: " + sum);

    }
}
