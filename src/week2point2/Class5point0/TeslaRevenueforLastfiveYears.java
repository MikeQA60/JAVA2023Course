package week2point2.Class5point0;

//example 2

/*
Tesla's Revenue for the last 2 years was
2022 - $81,462,000,000

2021 - $53,823,000,000

2020 - $31,536,000,000

2019 - $24,578,000,000

2018 - $21,461,000,000

Write a program that stores each year's revenue in the most suitable data type. Then create a totalRevenenueForLast5Years variable where the value should be the sum of the last 5 years revenue.

____ year2018Revenue = ____;
____ year2019Revenue = ____;
____ year2020Revenue = ____;
____ year2021Revenue = ____;
____ year2022Revenue = ____;

____ totalRevenenueForLast5Years = _____;

System.out.println(totalRevenenueForLast5Years);
 */
public class TeslaRevenueforLastfiveYears {
    public static void main(String[] args) {
       long year2018Revenue = 21461000000l;
       long year2019Revenue = 24578000000l;
       long year2020Revenue = 31536000000l;
       long year2021Revenue = 53823000000l;
       long year2022Revenue = 81462000000l;

        long totalRevenenueForLast5Years = year2018Revenue + year2019Revenue + year2020Revenue + year2021Revenue + year2022Revenue;

        System.out.println(totalRevenenueForLast5Years);
    }
}
