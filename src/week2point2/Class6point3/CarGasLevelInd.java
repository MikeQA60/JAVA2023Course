package week2point2.Class6point3;

//example 2
/*
Let's build a program that describes the Car Gas Level Indicator.


Expected Output

E - means an empty tank
H - means a half tank
F - means a full tank

Write a program that prints out the above by using the %c format specifier to print out E, H, F, and %s to print out descriptions.

___ e = ____;
___ h = ____;
___ f = ____;

//prinf() statement for e
//prinf() statement for h
//prinf() statement for f
 */
public class CarGasLevelInd {
    public static void main(String[] args) {
        char e = 'E' ;
        char h = 'H';
        char f = 'F';

        System.out.printf(" %c -means an empty tank", e);
        System.out.printf("\n %c -means a half tank", h);
        System.out.printf("\n %c -means a full tank", f);
//prinf() statement for e
//prinf() statement for h
//prinf() statement for f

    }
}
