package Lesson12.exceptions;

public class OverweightBaggageException extends AirportServiceException {
    public OverweightBaggageException(int weight, int maxWeight) {
        super("Багаж слишком тяжелый: " + weight + " кг. Максимальный допустимый вес: " + maxWeight + " кг");
    }
}