package ToDoApp;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task userT) {
        tasks.add(userT);
    }

    public void removeTask(int index) {
        tasks.remove(tasks.get(index - 1));
    }

    public void markComplete(int index) {
        tasks.get(index).setCompleted(true);
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).getName());
            System.out.println("\t--> " + tasks.get(i).getD());
            System.out.println("   Done? " + tasks.get(i).isDone());
        }
    }
}
