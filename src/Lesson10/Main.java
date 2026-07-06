package Lesson10;

public class Main {
    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();

        tracker.addTask("Проверить авторизацию");
        tracker.addTask("Проверить регистрацию");
        tracker.addTask("Написать тесты");
        tracker.addTask("Обновить документацию");

        tracker.displayAllTasks();


        tracker.markTaskAsCompleted("Проверить регистрацию");
        tracker.markTaskAsCompleted("Написать тесты");


        tracker.displayAllTasks();


        System.out.println("Статус задачи 'Проверить авторизацию': " +
                (tracker.getTaskStatus("Проверить авторизацию") ? "Выполнена" : "Не выполнена"));
        System.out.println("Статус задачи 'Написать тесты': " +
                (tracker.getTaskStatus("Написать тесты") ? "Выполнена" : "Не выполнена"));


        tracker.displayStatistics();

        // Проверка несуществующей задачи
        tracker.getTaskStatus("Несуществующая задача");
    }
}
