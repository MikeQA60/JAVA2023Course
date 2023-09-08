package Week9ArraysInJava.Class9point8ArrayDataAnalysisPracitce;

public class Video {
    public static void main(String[] args) {

        //imagine we work for amazon
        //our task is to find what is the average daily revenue
        //how much do all users spend every day in average
     //                        literal values
        double[] dailyRevenueArr = {25.0, 10.2, 44.5, 14.7};

        //average formula = sum of all numbers divied by count of number


        //when you are using = sign alone
        //it means you are overriding the old value
        for (int i = 0; i < dailyRevenueArr.length; i++){
            //give value 1 by 1
        double sum =  dailyRevenueArr[i];

            //i:0 => 25.0
            //i:1 => 10.2
            //i:2 => 44.5
            //i: 3 => 14.7

            System.out.println(sum); //25.0, 10.2, 44.5, 14.7
        }
    }
}
