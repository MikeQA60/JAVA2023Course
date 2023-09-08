package week2point2.Class5point3;

//example 1

/*

Breakig News:

Tesla reports 1310000 deliveries in 2022, growth of 40% over last year.



Write a program that will store the value of total2022Deliveries in the most suitable data type.
 Then create an averageDeliveryPerQuarter where the value is calculated based on the given facts.

Note: there are 4 Quarters in a year. Q1, Q2, Q3, Q4.



____ total2022Deliveries = _____;
_____ numOfQuarters = _____;
_____ averageDeliveryPerQuarter = ____;

System.out.println(averageDeliveryPerQuarter);
 */
public class TeslaProdVolumeByQuart {
    public static void main(String[] args) {
        int total2022Deliveries = 13100000;
        int numOfQuarters = 40;
        int averageDeliveryPerQuarter = total2022Deliveries / numOfQuarters;

        System.out.println(averageDeliveryPerQuarter);
    }
}
