package week4.Class12point.point0.Class4point15;

import java.util.Scanner;

public class MakeupLookSuggestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your eye color (blue, green, brown, or hazel): ");
        String eyeColor = sc.next();
        System.out.println("Enter your hair color (blonde, brown, black, or red): ");
        String hairColor = sc.next();
        if((eyeColor.equals("blue") || eyeColor.equals("green"))
                && (hairColor.equals("blonde") || hairColor.equals("brown"))){
            System.out.println("We suggest a natural makeup look");
        }else if((eyeColor.equals("blue") || eyeColor.equals("green"))
                && (hairColor.equals("red") || hairColor.equals("black"))){
            System.out.println("We suggest a bold lip look");
        } else if (eyeColor.equals("brown") || eyeColor.equals("hazel")) {
            System.out.println("We suggest a smokey eye look");
        }else{
            System.out.println("Sorry, we couldn't identify your eye color or hair color");
        }
    }
}
