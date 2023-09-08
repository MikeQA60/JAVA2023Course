package Week5NestedIf.Class5point16;

import java.util.Scanner;

public class ProgrammingLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a programming language:");
        //   int num = sc.nextInt();
        String interpreted = sc.nextLine();
       // String compiled = sc.nextLine();

        // String type = sc.nextLine();


        switch (interpreted) {

            case "compiled":

            case "Java":
                System.out.println("Java is a compiled language");
                break;
            case "C++":
                System.out.println("C++ is a compiled language");
                break;
            case "C#":
                System.out.println("C# is a compiled language");
                break;
            case "Objective-C":
                System.out.println("Objective-C is a compiled language");
                break;

          //  switch (interpreted) {
                case "interpreted":
                case "Swift":
                    System.out.println("Swift is a compiled language");
                    break;
                case "Python":
                    System.out.println("Python is an interpreted language");
                    break;
                case "Ruby":
                    System.out.println("Ruby is an interpreted language");
                    break;
                case "Perl":
                    System.out.println("Perl is an interpreted language");
                    break;
                case "JavaScript":
                    System.out.println("Javascript is an interpreted language");
                    break;
                default:
                    System.out.println("Error: Invalid programming language. Please enter a valid programming language");

            }
        }
    }
