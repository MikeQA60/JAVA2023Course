package Week9ArraysInJava.Class9point8ArrayDataAnalysisPracitce;

public class SumThatisDivByFive {
    public static void main(String[] args) {

    }
    public static boolean isSumOfEvenDivisibleByFive(int[] array){

        if (array.length <=0){
            return false;
        }

        double sum = 0;

        for(int i = 0; i < array.length;i++){
            if(array[i]%2 == 0) {
                sum += array[i];
            }
        }
        if(sum % 5 == 0) {
            return true;
        }else {
            return false;
        }
    }
}
