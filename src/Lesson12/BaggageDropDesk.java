package Lesson12;

import Lesson12.exceptions.*;

public class BaggageDropDesk {
    private final String[] availableFlights;
    private static final int MAX_BAGGAGE_WEIGHT = 23;

    public BaggageDropDesk(String[] availableFlights) {
        this.availableFlights = availableFlights;
    }

    public BaggageTicket checkBaggage(String passengerName, String flightNumber, int weight)
            throws AirportServiceException {

        // Проверка имени пассажира (непроверяемое исключение)
        if (passengerName == null || passengerName.trim().isEmpty()) {
            throw new InvalidPassengerNameException("Имя пассажира не может быть null или пустым");
        }

        // Проверка веса багажа (непроверяемое исключение)
        if (weight <= 0) {
            throw new InvalidBaggageWeightException("Вес багажа должен быть положительным числом. Получено: " + weight);
        }

        // Проверка существования рейса (проверяемое исключение)
        boolean flightExists = false;
        for (String flight : availableFlights) {
            if (flight.equals(flightNumber)) {
                flightExists = true;
                break;
            }
        }
        if (!flightExists) {
            throw new FlightNotFoundException(flightNumber);
        }

        // Проверка веса багажа (проверяемое исключение)
        if (weight > MAX_BAGGAGE_WEIGHT) {
            throw new OverweightBaggageException(weight, MAX_BAGGAGE_WEIGHT);
        }

        // Имитация проблемы с печатью багажной бирки
        if ("AE-404".equals(flightNumber)) {
            throw new BaggageTagPrintException(flightNumber);
        }

        // Имитация критической ошибки с багажной лентой (для демонстрации)
        if ("CR-500".equals(flightNumber)) {
            throw new ConveyorBeltMalfunctionError("Остановка конвейерной ленты на стойке " + flightNumber);
        }

        // Успешная сдача багажа
        BaggageTicket ticket = new BaggageTicket(passengerName, flightNumber, weight);
        System.out.println("Багаж успешно принят! Пассажир: " + passengerName);
        System.out.println("Не забудьте уплатить налог за слишком правильные введенные данные!");

        return ticket;
    }
}