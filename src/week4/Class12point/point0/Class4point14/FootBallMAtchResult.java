package week4.Class12point.point0.Class4point14;

import java.util.Scanner;

public class FootBallMAtchResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the score of the match for team 1:");
        int scoreOfTeam1 = sc.nextInt();

        System.out.println("Enter the score of the match for team 2:");
        double scoreOfTeams2 = sc.nextDouble();

        if (scoreOfTeam1 >= 0 && scoreOfTeams2 >= 0 && scoreOfTeam1 == scoreOfTeams2) {
            System.out.println("It's a draw");

            if (scoreOfTeam1 >= 3 && scoreOfTeams2 >= 5 && scoreOfTeam1 == scoreOfTeams2) {
                System.out.println("team 2 won");

                if (scoreOfTeam1 >= 4 && scoreOfTeams2 >= 1 && scoreOfTeam1 == scoreOfTeams2) {
                    System.out.println("team 1 won");

                    if (scoreOfTeam1 >= -2 && scoreOfTeams2 >= -11 && scoreOfTeam1 == scoreOfTeams2) {
                        System.out.println("invalid score");


                    }

                }
            }
        }
    }
}