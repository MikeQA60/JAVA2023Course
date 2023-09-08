package week4.Class12point.point0.Class4point15;

public class pt3 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 20;
        int num3 = 70;

        //10, 20, 50 = 50 since large
        //50, 20 20 = 50

        //if 50,50,50
        //all same

        //if 60,60,50 then its a bug

        //if the num1 is more than num2 and num3
        // if the num2 is more than num3 and num1

        //if num3 is more than num1 and num2

        //with if , else if, else if trys to find first boolean

        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number");
        }

        else  if (num2 > num1 && num2>num3) {
            System.out.println(num2 + " is the largest number");

        }

        //if, else, else = with this

        ////if, else, else = with this
        else   {
            System.out.println(num3 + " is the largest number");
        }
    }
}


