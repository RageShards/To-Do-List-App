package ToDoApp;

public class Task {
    private String name;
    private String description;
    private boolean isCompleted;

    Task(String tName, String info) {
        name = tName;
        description = info;
        isCompleted = false;
    }

    public void setCompleted(boolean x) {
        isCompleted = x;
    }

    public String getName() {
        return name;
    }

    public String getD() {
        return description;
    }

    public boolean isDone() {
        return isCompleted;
    }
}
