package Week5NestedIf.Class5point11;

import java.util.Scanner;

public class GroupDetermiationBasedonGenandAgeJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your gender:");
        scanner.nextLine();


        System.out.println("Enter your age:");

        int age = scanner.nextInt();

     String gender = scanner.nextLine();

        String message = "";
      //  if (age >= 18) {
            //if ((((gender.equals("Boy") || gender.equals("Male")) || gender.equals("Girl") || gender.equals("Woman")))) {

                if(gender.equals("male")) {
                    if (age < 20 && age > 0) {
                        System.out.println("Boy");
                    } else if (age >= 20) {
                        System.out.println("Man");
                    } else {
                        System.out.println("Enter your gender:");
                    }
                }
                   else if(gender.equals("female")) {
                       if(age<20&&age>0) {
                           System.out.println("Girl");
                       }
                       else if(age>=20) {
                           System.out.println("Woman");
                       }
                           else {
                               System.out.println("Enter your age:");

                           }
                       }
                       else {
                           System.out.println("");
                       }
            }
        }


