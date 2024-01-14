package ToDoApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Scanner input = new Scanner(System.in);
        System.out.println("** Welcome to your To-Do List! **");
        while (true) {
            System.out.println(
                    "\n1. Add Task \n2. Mark Task as Completed \n3. Remove Task \n4. Display Tasks\n5. Exit");
            System.out.print("Select a choice: ");
            int userAns = input.nextInt();
            input.nextLine();

            switch (userAns) {
                case 1:
                    System.out.print("Enter a task name: ");
                    String taskName = input.nextLine();
                    System.out.print("Description: ");
                    String info = input.nextLine();
                    Task newTask = new Task(taskName, info);
                    list.addTask(newTask);
                    break;

                case 2:
                    System.out.print("Enter the task number: ");
                    int index = input.nextInt();
                    list.markComplete(index - 1);
                    break;
                case 3:
                    System.out.print("Enter the task number: ");
                    int index2 = input.nextInt();
                    list.removeTask(index2);
                    break;
                case 4:
                    System.out.println("** Tasks **");
                    list.displayTasks();
                    break;
                case 5:
                    System.out.print(
                            "This is will delete all your tasks. Are you sure you want to continue (Y/N)? ");
                    String answer = input.nextLine();
                    if (answer.equals("Y") || answer.equals("y")) {
                        System.out.println("Exiting the to-do list app. Goodbye!");
                        input.close();
                        System.exit(0);
                    }
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
