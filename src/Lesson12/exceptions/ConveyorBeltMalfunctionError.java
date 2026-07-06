package Lesson12.exceptions;

public class ConveyorBeltMalfunctionError extends Error {
    public ConveyorBeltMalfunctionError(String message) {
        super("ОШИБКА: " + message + ". Багажная лента не работает. Необходимо срочное вмешательство инженеров.");
    }
}