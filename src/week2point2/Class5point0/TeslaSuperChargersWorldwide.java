package week2point2.Class5point0;
//example 4

/*
In 2022 Tesla installed 19000 supercharger stations. In 2023 Tesla is planning to install 10000 more.
 How many Tesla supercharger stations are going to be there by the end of 2023?

___ numTeslaSuperchargers2022 = ____;
___ numTeslaSuperchargers2023 = ____;

___ total = ____;
System.out.println(total);
 */
public class TeslaSuperChargersWorldwide {
    public static void main(String[] args) {

        short numTeslaSuperchargers2022 = 19000;
        short numTeslaSuperchargers2023 = 10000;

        int total = numTeslaSuperchargers2022 + numTeslaSuperchargers2023;
        System.out.println(total);
    }
}
