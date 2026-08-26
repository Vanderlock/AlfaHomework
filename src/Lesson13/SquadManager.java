package Lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SquadManager {

    public void demonstrateListCreations() {
        System.out.println("=== Демонстрация создания отрядов ===\n");

        // 1. Основной отряд - ArrayList
        System.out.println("1. ОСНОВНОЙ ОТРЯД (ArrayList)");
        List<String> mainSquad = new ArrayList<>();
        mainSquad.add("Штурмовик-1");
        mainSquad.add("Штурмовик-2");
        mainSquad.add("Штурмовик-3");
        mainSquad.add("Штурмовик-4");

        System.out.println("Состав отряда: " + mainSquad);


        System.out.println("\nПопытка добавить штурмовика в основной отряд:");
        try {
            mainSquad.add("Штурмовик-5");
            System.out.println("✓ Успех! Добавлен новый штурмовик.");
            System.out.println("Новый состав: " + mainSquad);
        } catch (Exception e) {
            System.out.println("✗ Исключение: " + e.getClass().getSimpleName());
        }


        System.out.println("\nПопытка удалить штурмовика из основного отряда:");
        try {
            mainSquad.remove("Штурмовик-1");
            System.out.println("✓ Успех! Штурмовик удален.");
            System.out.println("Новый состав: " + mainSquad);
        } catch (Exception e) {
            System.out.println("✗ Исключение: " + e.getClass().getSimpleName());
        }

        System.out.println("\n" + "=".repeat(50) + "\n");

        // 2. Отряд поддержки - Arrays.asList()
        System.out.println("2. ОТРЯД ПОДДЕРЖКИ (Arrays.asList())");
        List<String> supportSquad = Arrays.asList("Поддержка-1", "Поддержка-2", "Поддержка-3");

        System.out.println("Состав отряда: " + supportSquad);


        System.out.println("\nПопытка добавить штурмовика в отряд поддержки:");
        try {
            supportSquad.add("Поддержка-4");
            System.out.println("✓ Успех! Добавлен новый штурмовик.");
            System.out.println("Новый состав: " + supportSquad);
        } catch (Exception e) {
            System.out.println("✗ Исключение: " + e.getClass().getSimpleName());
        }


        System.out.println("\nПопытка удалить штурмовика из отряда поддержки:");
        try {
            supportSquad.remove("Поддержка-1");
            System.out.println("✓ Успех! Штурмовик удален.");
            System.out.println("Новый состав: " + supportSquad);
        } catch (Exception e) {
            System.out.println("✗ Исключение: " + e.getClass().getSimpleName());
        }

        System.out.println("\n" + "=".repeat(50) + "\n");

        // 3. Элитный отряд - List.of()
        System.out.println("3. ЭЛИТНЫЙ ОТРЯД (List.of())");
        List<String> eliteSquad = List.of("Элита-1", "Элита-2");

        System.out.println("Состав отряда: " + eliteSquad);


        System.out.println("\nПопытка добавить штурмовика в элитный отряд:");
        try {
            eliteSquad.add("Элита-3");
            System.out.println("✓ Успех! Добавлен новый штурмовик.");
            System.out.println("Новый состав: " + eliteSquad);
        } catch (Exception e) {
            System.out.println("✗ Исключение: " + e.getClass().getSimpleName());
        }


        System.out.println("\nПопытка удалить штурмовика из элитного отряда:");
        try {
            eliteSquad.remove("Элита-1");
            System.out.println("✓ Успех! Штурмовик удален.");
            System.out.println("Новый состав: " + eliteSquad);
        } catch (Exception e) {
            System.out.println("✗ Исключение: " + e.getClass().getSimpleName());
        }
    }

    // Метод для отсеивания трусов
    public void filterOutCowards(List<String> squad) {
        System.out.println("\n=== Отсеивание трусов ===\n");

        System.out.println("Отряд до фильтрации:");
        System.out.println(squad);


        Iterator<String> iterator = squad.iterator();
        while (iterator.hasNext()) {
            String soldier = iterator.next();
            if (soldier.startsWith("Трус")) {
                iterator.remove();
                System.out.println("Удален: " + soldier);
            }
        }

        System.out.println("\nОтряд после фильтрации:");
        System.out.println(squad);

        // Бонус: альтернативная фильтрация через removeIf()
        System.out.println("\n=== Бонус: фильтрация через removeIf() ===");
        System.out.println("Демонстрация removeIf() на копии списка:");

        // Создаем копию для демонстрации
        List<String> squadCopy = new ArrayList<>(squad);
        squadCopy.add("Трус Вася");
        squadCopy.add("Трус Петя");

        System.out.println("Список до removeIf(): " + squadCopy);

        // Используем removeIf() для удаления
        squadCopy.removeIf(soldier -> soldier.startsWith("Трус"));

        System.out.println("Список после removeIf(): " + squadCopy);
    }
}