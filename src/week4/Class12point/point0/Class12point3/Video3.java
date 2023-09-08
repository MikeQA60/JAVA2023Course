package week4.Class12point.point0.Class12point3;

import java.util.Scanner;

public class Video3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you a loyalty program member?");
        //enters true or false
        boolean isLoyal = sc.nextBoolean();
        System.out.println("Enter total amount");
        //take input from user
        double total = sc.nextDouble();

        if(isLoyal) {
            //10 percent
            //body of if statement
            //decimal has to be double
          total -=(total * 0.1);
            System.out.println(total);
        }
        if(!isLoyal) {
            System.out.println(total);
        }
    }
}
