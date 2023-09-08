package week2point2.Class5point0;

//example 5

/*
Tesla's production rate per quarter is 125,000 vehicles. Write a program that finds the production rate per 4 quarters.



____ q1 = ____;
____ q2 = ____;
____ q3 = ____;
____ q4 = ____;

___ yearly = ____;

System.out.println(yearly);

 */
public class TeslaProductionRate {
    public static void main(String[] args) {
        int q1 = 125000;
        int q2 = 125000;
        int q3 = 125000;
        int q4 = 125000;

        int yearly = q1 + q2 + q3 + q4;

        System.out.println(yearly);
    }
}
