package Week10WrapperClassListSetCollections.Class10point17ArrayListPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Video {
    public static void main(String[] args) {

        //requirements
        //create a task managment app
        //the program should ask the user
        //'' what do you want to do?
        //1) add a task
        //2) complete a task
        //3) print all task
        //4) quit

        //when user enter a task or 1
        //then user should be asked
        //enter your task: learn java collection
        //then go back to the main screen

        //when user enter a task or 2
        //then user should be asked
        //enter your the task you completed: learn java collection
        //then go back to the main screen


        //when user enter print all task or 3
        //then user should be asked
        //[learn java collection, read for 10 pages, record an interview on Agile]
        //then go back to the main screen

        //when user enters quit or 4
        //program should stop

        Scanner sc = new Scanner(System.in);
        List<String> taskList = new ArrayList<>();

        boolean isRunning = true;

        do {
            System.out.println("What do you want to do?");
            System.out.println("1) add a task");
            System.out.println("2) complete a task");
            System.out.println("3) print all task");
            System.out.println("4) quit");

            String input = sc.nextLine();

            if (input.equalsIgnoreCase("add a task") || input.equalsIgnoreCase("1")) {

                System.out.println("enter your task: ");
                String task = sc.nextLine();
                taskList.add(task);

            } else if (input.equalsIgnoreCase("complete a task") || input.equalsIgnoreCase("2")) {
                System.out.println("enter the task you completed: ");
                String taskCompleted = sc.nextLine();

                //remove (int index)
                //remove(element)
                // taskList.remove(taskCompleted);
                for (int i = 0; i < taskList.size(); i++) {
                    if (taskList.get(i).equalsIgnoreCase(taskCompleted)) {
                        taskList.remove(i);
                    }
                }


            } else if (input.equalsIgnoreCase("print all tasks") || input.equalsIgnoreCase("3")) {
                System.out.println(taskList);

            } else if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("4")) {

                isRunning = false;
            } else {

            }
        } while (isRunning);

    }
}