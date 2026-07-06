package Lesson11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);

        // 3.1 Проверка InputMismatchException
        System.out.print("Введите количество воды (мл): ");
        try {
            int waterInput = scanner.nextInt();
            System.out.println("Вы ввели: " + waterInput + " мл");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: нужно было ввести число");
        }

        // 3.2 Проверка NotEnoughWaterException (своё исключение)
        System.out.println("\n--- Проверка NotEnoughWaterException ---");
        try {
            coffeeMachine.makeCoffee(100);
        } catch (NotEnoughWaterException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка кофемашины завершена");
        }

        // 3.3 Проверка ArithmeticException
        System.out.println("\n--- Проверка ArithmeticException ---");
        try {
            coffeeMachine.calculateCups(1000, 0);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: размер чашки не может быть 0");
        }

        // 3.4 Проверка NullPointerException
        System.out.println("\n--- Проверка NullPointerException ---");
        String nullCoffeeName = null;
        try {
            coffeeMachine.printCoffeeName(nullCoffeeName);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: название кофе отсутствует");
        }

        scanner.close();
    }
}