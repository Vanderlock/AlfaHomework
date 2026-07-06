package Lesson11;

public class CoffeeMachine {

    public void makeCoffee(int waterAmount) {
        final int MIN_WATER_NEEDED = 200;

        if (waterAmount <= MIN_WATER_NEEDED) {
            throw new NotEnoughWaterException(
                    "Недостаточно воды для приготовления кофе. " +
                            "Требуется минимум " + MIN_WATER_NEEDED + " мл, " +
                            "доступно: " + waterAmount + " мл"
            );
        }

        System.out.println("Кофе готово!");
    }


    public int calculateCups(int waterAmount, int cupSize) {
        return waterAmount / cupSize;
    }


    public void printCoffeeName(String coffeeName) {
        System.out.println("Название кофе: " + coffeeName.toUpperCase());
    }
}
