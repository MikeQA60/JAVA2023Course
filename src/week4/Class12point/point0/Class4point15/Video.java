package week4.Class12point.point0.Class4point15;

public class Video {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 50;

        //10, 20, 50 = 50 since large
        //50, 20 20 = 50

        //if the num1 is more than num2 and num3
        // if the num2 is more than num3 and num1

        //if num3 is more than num1 and num2

        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number");
        }

        if (num2 > num1 && num2>num3) {
            System.out.println(num2 + " is the largest number");

        }if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the largest number");
        }
    }
}
