package Lesson13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alien> aliens = new ArrayList<>();

        aliens.add(new Alien("Зигмунд", "Марс", 7));
        aliens.add(new Alien("Боб", "Сатурн", 9)); //дубль
        aliens.add(new Alien("Зигмунд", "Марс", 3)); //дубль
        aliens.add(new Alien("Лукреция", "Юпитер", 5));
        aliens.add(new Alien("Боб", "Сатурн", 2));


        System.out.println("Список всех пришельцев");
        for (Alien alien : aliens) {
            System.out.println(alien);
        }


        boolean hasDuplicates = false;


        for (int i = 0; i < aliens.size(); i++) {
            for (int j = i + 1; j < aliens.size(); j++) {
                if (aliens.get(i).equals(aliens.get(j))) {
                    hasDuplicates = true;
                    System.out.println("Найден дубликат: " + aliens.get(i) +
                            " (позиции " + i + " и " + j + ")");
                }
            }
        }

        System.out.println("\nСодержит ли список дубликаты?");
        System.out.println("Результат: " + hasDuplicates);
        //2 часть
        SquadManager squadManager = new SquadManager();
        squadManager.demonstrateListCreations();
        //3 часть
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ЧАСТЬ 3: ОТСЕИВАНИЕ ТРУСОВ");
        System.out.println("=".repeat(50));

        // Создаем отряд с трусами
        ArrayList<String> squad = new ArrayList<>();
        squad.add("Храбрый Иван");
        squad.add("Трус Вася");
        squad.add("Смелый Петр");
        squad.add("Трус Коля");
        squad.add("Отважный Максим");

        // Вызываем метод фильтрации
        squadManager.filterOutCowards(squad);

        // Часть 4: Очередь на вход
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ЧАСТЬ 4: ОЧЕРЕДЬ НА ВХОД");
        System.out.println("=".repeat(50));

        // Создаем объект AssaultQueue
        AssaultQueue assaultQueue = new AssaultQueue();

        // Добавляем 5 человек
        System.out.println("\n=== Добавление штурмовиков в очередь ===");
        assaultQueue.addRecruit("Штурмовик-1");
        assaultQueue.addRecruit("Штурмовик-2");
        assaultQueue.addRecruit("Штурмовик-3");
        assaultQueue.addRecruit("Штурмовик-4");
        assaultQueue.addRecruit("Штурмовик-5");

        // Выводим текущее состояние очереди
        System.out.println("\n=== Состояние очереди после добавления ===");
        assaultQueue.printQueue();
        System.out.println("\nИнформация об очереди: " + assaultQueue);

        // Имитируем уход 2 человек из начала очереди
        System.out.println("\n=== Трусы покидают очередь ===");
        String firstCoward = assaultQueue.retreatCoward();
        String secondCoward = assaultQueue.retreatCoward();

        System.out.println("\nСбежали трусы: " + firstCoward + " и " + secondCoward);

        // Выводим состояние после ухода трусов
        System.out.println("\n=== Состояние очереди после ухода трусов ===");
        assaultQueue.printQueue();

        // Добавляем 3 новых в конец
        System.out.println("\n=== Добавление новых штурмовиков ===");
        assaultQueue.addRecruit("Штурмовик-6");
        assaultQueue.addRecruit("Штурмовик-7");
        assaultQueue.addRecruit("Штурмовик-8");

        // Выводим итоговое состояние очереди
        System.out.println("\n=== Итоговое состояние очереди ===");
        assaultQueue.printQueue();
        System.out.println("\nИтоговая информация об очереди: " + assaultQueue);

        // Часть 5: Отчёт командованию
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ЧАСТЬ 5: ОТЧЁТ КОМАНДОВАНИЮ");
        System.out.println("=".repeat(50));

        // Создаем список пойманных пришельцев
        List<Alien> capturedAliens = new ArrayList<>();
        capturedAliens.add(new Alien("Зигмунд", "Марс", 7));
        capturedAliens.add(new Alien("Ксавьер", "Венера", 9));
        capturedAliens.add(new Alien("Лукреция", "Юпитер", 5));

        // Создаем первый отчет
        MissionReport report1 = new MissionReport("Штурм Зоны 51", capturedAliens, 50);

        System.out.println("\n=== Первый отчет ===");
        System.out.println(report1);

        // Создаем второй отчет с теми же данными
        List<Alien> capturedAliens2 = new ArrayList<>();
        capturedAliens2.add(new Alien("Зигмунд", "Марс", 7));
        capturedAliens2.add(new Alien("Ксавьер", "Венера", 9));
        capturedAliens2.add(new Alien("Лукреция", "Юпитер", 5));

        MissionReport report2 = new MissionReport("Штурм Зоны 51", capturedAliens2, 50);

        System.out.println("\n=== Второй отчет ===");
        System.out.println(report2);

        // Сравнение через ==
        System.out.println("\n=== Сравнение отчетов ===");
        System.out.println("Сравнение через ==: " + (report1 == report2));
        System.out.println("Сравнение через equals(): " + report1.equals(report2));

        // Демонстрация hashCode
        System.out.println("\n=== hashCode отчетов ===");
        System.out.println("hashCode report1: " + report1.hashCode());
        System.out.println("hashCode report2: " + report2.hashCode());
        System.out.println("hashCode равны: " + (report1.hashCode() == report2.hashCode()));

    }
}
