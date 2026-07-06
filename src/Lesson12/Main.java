package Lesson12;

import Lesson12.exceptions.*;

public class Main {
    public static void main(String[] args) {
        String[] flights = {"SU-123", "TK-777", "KC-909", "AE-404", "CR-500"};
        BaggageDropDesk desk = new BaggageDropDesk(flights);

        //Успешная сдача багажа
        System.out.println("Сценарий 1: Успешная сдача багажа");
        try {
            BaggageTicket ticket = desk.checkBaggage("Ivan Petrov", "SU-123", 18);
            System.out.println("Получена бирка: " + ticket);
        } catch (InvalidPassengerNameException e) {
            System.out.println("Ошибка в имени пассажира: " + e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println("Ошибка в весе багажа: " + e.getMessage());
        } catch (FlightNotFoundException e) {
            System.out.println("Рейс не найден: " + e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println("⚖Перевес: " + e.getMessage());
            System.out.println("Отправьте пассажира на доплату за перевес");
        } catch (BaggageTagPrintException e) {
            System.out.println("Проблема с печатью: " + e.getMessage());
            System.out.println("Проверьте принтер и попробуйте снова");
        } catch (AirportServiceException e) {
            System.out.println("Ошибка сервиса аэропорта: " + e.getMessage());
        }
        System.out.println();

        //Рейс не существует
        System.out.println("Рейс не существует");
        try {
            desk.checkBaggage("Maria Sokolova", "XX-999", 15);
        } catch (InvalidPassengerNameException e) {
            System.out.println("Ошибка в имени пассажира: " + e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println("Ошибка в весе багажа: " + e.getMessage());
        } catch (FlightNotFoundException e) {
            System.out.println("Рейс не найден: " + e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println("Перевес: " + e.getMessage());
            System.out.println("Отправьте пассажира на доплату за перевес");
        } catch (BaggageTagPrintException e) {
            System.out.println("Проблема с печатью: " + e.getMessage());
            System.out.println("Проверьте принтер и попробуйте снова");
        } catch (AirportServiceException e) {
            System.out.println("Ошибка сервиса аэропорта: " + e.getMessage());
        }
        System.out.println();

        //Багаж слишком тяжелый
        System.out.println("Багаж слишком тяжелый");
        try {
            desk.checkBaggage("Petr Sidorov", "TK-777", 30);
        } catch (InvalidPassengerNameException e) {
            System.out.println("Ошибка в имени пассажира: " + e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println("Ошибка в весе багажа: " + e.getMessage());
        } catch (FlightNotFoundException e) {
            System.out.println("Рейс не найден: " + e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println("Перевес: " + e.getMessage());
            System.out.println("Отправьте пассажира на доплату за перевес");
        } catch (BaggageTagPrintException e) {
            System.out.println("Проблема с печатью: " + e.getMessage());
            System.out.println("Проверьте принтер и попробуйте снова");
        } catch (AirportServiceException e) {
            System.out.println("Ошибка сервиса аэропорта: " + e.getMessage());
        }
        System.out.println();

        //Проблема с печатью бирки
        System.out.println("Проблема с печатью бирки");
        try {
            desk.checkBaggage("Anna Ivanova", "AE-404", 20);
        } catch (InvalidPassengerNameException e) {
            System.out.println("Ошибка в имени пассажира: " + e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println("Ошибка в весе багажа: " + e.getMessage());
        } catch (FlightNotFoundException e) {
            System.out.println("Рейс не найден: " + e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println("Перевес: " + e.getMessage());
            System.out.println("💡 Отправьте пассажира на доплату за перевес");
        } catch (BaggageTagPrintException e) {
            System.out.println("🖨️ Проблема с печатью: " + e.getMessage());
            System.out.println("💡 Проверьте принтер и попробуйте снова");
        } catch (AirportServiceException e) {
            System.out.println("⚠️ Ошибка сервиса аэропорта: " + e.getMessage());
        }
        System.out.println();

        //Некорректное имя пассажира
        System.out.println("Некорректное имя пассажира (null)");
        try {
            desk.checkBaggage(null, "SU-123", 15);
        } catch (InvalidPassengerNameException e) {
            System.out.println("Ошибка в имени пассажира: " + e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println("Ошибка в весе багажа: " + e.getMessage());
        } catch (FlightNotFoundException e) {
            System.out.println("Рейс не найден: " + e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println("Перевес: " + e.getMessage());
            System.out.println("Отправьте пассажира на доплату за перевес");
        } catch (BaggageTagPrintException e) {
            System.out.println("Проблема с печатью: " + e.getMessage());
            System.out.println("Проверьте принтер и попробуйте снова");
        } catch (AirportServiceException e) {
            System.out.println("Ошибка сервиса аэропорта: " + e.getMessage());
        }
        System.out.println();

        //Некорректный вес багажа
        System.out.println("Некорректный вес багажа (отрицательный)");
        try {
            desk.checkBaggage("Olga Smirnova", "KC-909", -5);
        } catch (InvalidPassengerNameException e) {
            System.out.println("Ошибка в имени пассажира: " + e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println("Ошибка в весе багажа: " + e.getMessage());
        } catch (FlightNotFoundException e) {
            System.out.println("Рейс не найден: " + e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println("Перевес: " + e.getMessage());
            System.out.println("Отправьте пассажира на доплату за перевес");
        } catch (BaggageTagPrintException e) {
            System.out.println("Проблема с печатью: " + e.getMessage());
            System.out.println("Проверьте принтер и попробуйте снова");
        } catch (AirportServiceException e) {
            System.out.println("Ошибка сервиса аэропорта: " + e.getMessage());
        }
        System.out.println();

        //Демонстрация критической ошибки (Error)
        System.out.println("Критическая ошибка (ConveyorBeltMalfunctionError)");
        try {
            desk.checkBaggage("Test Passenger", "CR-500", 10);
        } catch (InvalidPassengerNameException e) {
            System.out.println("Ошибка в имени пассажира: " + e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println("Ошибка в весе багажа: " + e.getMessage());
        } catch (FlightNotFoundException e) {
            System.out.println("Рейс не найден: " + e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println("Перевес: " + e.getMessage());
            System.out.println("Отправьте пассажира на доплату за перевес");
        } catch (BaggageTagPrintException e) {
            System.out.println("Проблема с печатью: " + e.getMessage());
            System.out.println("Проверьте принтер и попробуйте снова");
        } catch (AirportServiceException e) {
            System.out.println("Ошибка сервиса аэропорта: " + e.getMessage());
        }
    }
}