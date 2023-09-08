package Week9ArraysInJava.Class9point8ArrayDataAnalysisPracitce;

public class Videopt4 {
    public static void main(String[] args) {


        //imagine we work for amazon
        //our task is to find what is the average daily revenue
        //how much do all users spend every day in average
        //                        literal values


        //                               data sets
        double[] dailyRevenueArr = {25.0, 10.2, 44.5, 14.7, 50.1};

        //average formula = sum of all numbers divied by count of number


        //when you are using = sign alone
        //it means you are overriding the old value
        double sum = 0;
        for (int i = 0; i < dailyRevenueArr.length; i++) {
            //give value 1 by 1
            sum += dailyRevenueArr[i];

            //i:0 => 0 + 25.0
            //i:1 => 25.0 + 10.2 = 35.2
            //i:2 => 35.2 + 44.5 = 79.7
            //i: 3 => 79.7 + 14.7 = 94.4
        }

        System.out.println(sum); //144.5


        double average = sum / dailyRevenueArr.length;


        System.out.println("The daily average revenue is: " + average); //The daily average revenue is: 28.9
    }
}