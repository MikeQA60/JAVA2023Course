package Week5NestedIf.Class5point2;

import java.util.Scanner;

public class MarathonProgram {
    public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your health status (good/bad):");
        String health = scanner.nextLine();

        if (health.equals("good") ){
            System.out.println("Enter your fitness level (high/medium/low): ");
        }else{

            String fitness = scanner.nextLine();
            if (health.equals("bad")){
                System.out.println("We recommend you to participate in the marathon by walking and running as much as you can");
            }else {
                System.out.println("Wrong entry for health status");
            }
        }
        String fitness = scanner.nextLine();
        if (fitness.equals("high")){
            System.out.println("We recommend you to prepare for a full marathon");
        }else{
            if (fitness.equals("medium")){
                System.out.println("We recommend you to prepare for a half marathon");
            }else if (fitness.equals("low")){
                System.out.println("We recommend you to prepare for a 5k run");
            }else {
                System.out.println("Wrong entry for fitness level");
            }
        }
    }
}
