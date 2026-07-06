package Lesson12.exceptions;

public class AirportServiceException extends Exception {
    public AirportServiceException(String message) {
        super(message);
    }

    public AirportServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
