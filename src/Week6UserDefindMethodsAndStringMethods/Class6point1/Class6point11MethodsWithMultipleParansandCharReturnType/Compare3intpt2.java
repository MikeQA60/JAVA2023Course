package Week6UserDefindMethodsAndStringMethods.Class6point1.Class6point11MethodsWithMultipleParansandCharReturnType;

public class Compare3intpt2 {

        public static char compareIntegers(int num1, int num2, int num3) {
            int sum = num1 + num2;
            if (sum > num3) {
                return 'P';
            } else if (sum < num3) {
                return 'N';
            } else {
                return 'E';
            }
        }

}
