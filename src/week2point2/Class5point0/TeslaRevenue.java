package week2point2.Class5point0;
//example 1

/*
Tesla's Revenue for the last 2 years was
2022 $81,462,000,000

2021 $53,823,000,000

Write a program that stores revenues in two variables, revenue2021 and revenue2022, with the most suitable data type and assign values from above. Then declare totalRevenueForLast2Years variable where the value is going to be the sum of revenue2021 and revenue2022. Then print out the value of totalRevenueForLast2Years;

___ revenue2021  = _____;
___ revenue2022  = _____;
___ totalRevenueForLast2Years  = _____;

System.out.println(totalRevenueForLast2Years);
 */
public class TeslaRevenue {
    public static void main(String[] args) {
        long revenue2021  = 53823000000l;
        long revenue2022  = 81462000000l;
         long totalRevenueForLast2Years  = revenue2021 + revenue2022;
        System.out.println(totalRevenueForLast2Years);
    }
}
