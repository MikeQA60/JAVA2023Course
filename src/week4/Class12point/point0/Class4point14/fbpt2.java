package week4.Class12point.point0.Class4point14;

import java.util.Scanner;

public class fbpt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of the match for team 1:");
        int scoreOfTeam1 = sc.nextInt();
        System.out.println("Enter the score of the match for team 2:");
        int scoreOfTeams2 = sc.nextInt();
        if (scoreOfTeam1 >= 0 && scoreOfTeams2 >= 0 && scoreOfTeam1 == scoreOfTeams2) {
            System.out.println("It's a draw");
        } else if (scoreOfTeam1 >= 0 && scoreOfTeams2 >= 0 && scoreOfTeam1 > scoreOfTeams2) {
            System.out.println("team 1 won");
        } else if (scoreOfTeam1 >= 0 && scoreOfTeams2 >= 0 && scoreOfTeams2 > scoreOfTeam1) {
            System.out.println("team 2 won");
        } else if (scoreOfTeam1 < 0 || scoreOfTeams2 < 0) {
            System.out.println("Invalid score");
        }
    }
}