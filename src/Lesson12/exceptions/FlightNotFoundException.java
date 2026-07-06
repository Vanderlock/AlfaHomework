package Lesson12.exceptions;

public class FlightNotFoundException extends AirportServiceException {
    public FlightNotFoundException(String flightNumber) {
        super("Рейс " + flightNumber + " не найден в базе данных аэропорта");
    }
}
