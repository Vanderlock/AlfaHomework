package Lesson12.exceptions;

public class InvalidBaggageWeightException extends RuntimeException {
    public InvalidBaggageWeightException(String message) {
        super(message);
    }
}