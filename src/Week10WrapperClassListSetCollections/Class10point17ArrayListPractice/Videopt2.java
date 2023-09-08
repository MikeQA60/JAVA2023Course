package Week10WrapperClassListSetCollections.Class10point17ArrayListPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Videopt2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// Create a Scanner object 'sc' to read user input.

        List<String> taskList = new ArrayList<>();
// Create an ArrayList of strings named 'taskList' to store tasks.

        boolean isRunning = true;
// Create a boolean variable 'isRunning' and initialize it to true.
// This variable controls whether the program continues running.

        do {
            // Start a do-while loop that repeats until 'isRunning' is false.

            System.out.println("What do you want to do?");
            // Print the user menu.

            // ... Print menu options ...

            String input = sc.nextLine();
            // Read user input and store it in the 'input' variable.

            if (input.equalsIgnoreCase("add a task") || input.equalsIgnoreCase("1")) {
                // Check if the user wants to add a task (using either full text or shortcut).

                // ... Prompt for task input ...

                String task = sc.nextLine();
                // Read the task input and store it in the 'task' variable.
                taskList.add(task);
                // Add the task to the 'taskList'.

            } else if (input.equalsIgnoreCase("complete a task") || input.equalsIgnoreCase("2")) {
                // Check if the user wants to complete a task (using either full text or shortcut).

                // ... Prompt for completed task input ...

                String taskCompleted = sc.nextLine();
                // Read the completed task input and store it in the 'taskCompleted' variable.

                for (int i = 0; i < taskList.size(); i++) {
                    // Iterate through each task in the 'taskList'.

                    if (taskList.get(i).equalsIgnoreCase(taskCompleted)) {
                        // Check if the current task matches the completed task (case-insensitive).

                        taskList.remove(i);
                        // Remove the task from the 'taskList'.
                    }
                }

            } else if (input.equalsIgnoreCase("print all tasks") || input.equalsIgnoreCase("3")) {
                // Check if the user wants to print all tasks (using either full text or shortcut).

                System.out.println(taskList);
                // Print the contents of the 'taskList'.

            } else if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("4")) {
                // Check if the user wants to quit (using either full text or shortcut).

                isRunning = false;
                // Set 'isRunning' to false to exit the loop and stop the program.

            } else {
                // Handle invalid input (not matching any of the menu options).

                // ... Handle invalid input ...

            }

        } while (isRunning); // Continue the loop while 'isRunning' is true.

    }
}
