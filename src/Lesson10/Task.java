package Lesson10;

public class Task {
    private String name;
    private boolean isCompleted;

    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getName() {
        return name;
    }


    public void displayInfo() {
        if (isCompleted) {
            System.out.println("[x] " + name);
        } else {
            System.out.println("[ ] " + name);
        }
    }
}