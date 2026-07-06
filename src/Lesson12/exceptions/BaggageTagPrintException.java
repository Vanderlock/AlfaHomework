package Lesson12.exceptions;

public class BaggageTagPrintException extends AirportServiceException {
    public BaggageTagPrintException(String flightNumber) {
        super("Не удалось напечатать багажную бирку для рейса " + flightNumber +
                ". Проверьте состояние принтера (чернила, лента бирок)");
    }
}