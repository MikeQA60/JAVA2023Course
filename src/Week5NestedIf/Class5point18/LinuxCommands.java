package Week5NestedIf.Class5point18;

import java.util.Scanner;

public class LinuxCommands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Linux Command:");
        String command = sc.nextLine();
        switch (command) {
            case "cd":
            case "pwd":
                System.out.println("\n" +command+ " is a navigation command");
                break;
            case "ls":
            case "cp":
            case "mv":
            case "mkdir":
                System.out.println("\n" +command+ " is a file management command");
                break;
            case "shutdown":
            case "restart":
                System.out.println("\n" +command+ " is a system management command");
                break;
            default:
                System.out.println("\nInvalid command. Please enter a valid command");
        }
    }
}

