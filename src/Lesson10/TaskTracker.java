package Lesson10;

import java.util.ArrayList;
import java.util.List;

public class TaskTracker {
    private List<Task> tasks;

    public TaskTracker() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        Task task = new Task(taskName);
        tasks.add(task);
        System.out.println("Задача \"" + taskName + "\" добавлена.");
    }

    public void displayAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
            return;
        }
        System.out.println("\n=== Список всех задач ===");
        for (Task task : tasks) {
            task.displayInfo();
        }
        System.out.println();
    }

    public boolean markTaskAsCompleted(String taskName) {
        for (Task task : tasks) {
            if (task.getName().equalsIgnoreCase(taskName)) {
                task.markAsCompleted();
                System.out.println("Задача \"" + taskName + "\" отмечена как выполненная.");
                return true;
            }
        }
        System.out.println("Задача \"" + taskName + "\" не найдена.");
        return false;
    }

    public boolean getTaskStatus(String taskName) {
        for (Task task : tasks) {
            if (task.getName().equalsIgnoreCase(taskName)) {
                return task.isCompleted();
            }
        }
        System.out.println("Задача \"" + taskName + "\" не найдена.");
        return false;
    }

    public void displayStatistics() {
        int total = tasks.size();
        int completed = 0;
        int open = 0;

        for (Task task : tasks) {
            if (task.isCompleted()) {
                completed++;
            } else {
                open++;
            }
        }

        System.out.println("\n=== Статистика задач ===");
        System.out.println("Всего задач: " + total);
        System.out.println("Выполнено: " + completed);
        System.out.println("Открыто: " + open);
        System.out.println();
    }
}