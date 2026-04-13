public class FirstLessonRunner {
    static void main() {
        String name = "Игорь";
        String position = "Шаурмэн";
        int shiftRate = 4000;
        int shift = 22;
        int bonus = 1000;
        int fine = 50;
        int price = 200;
        int quantity = 108;

        //Решение
        System.out.println("Сотрудник: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Оплата за смены: " + shiftRate * shift);
        System.out.println("Премия: " + bonus);
        System.out.println("Штраф: " + fine);
        System.out.println("Итоговая зарплата за месяц: " + (shiftRate * shift + bonus - fine));
        System.out.println("Выручка шаурмы за день: " + price * quantity);
    }
}
