package Lesson6.delivery.model;

public class Parcel {
    private String nameReceiver;
    private String addressDelivery;
    protected double weight;
    protected String trackNumber;

    public Parcel() {
        this.nameReceiver = "Неизвестно";
        this.addressDelivery = "Не указан";
        this.weight = 0.0;
        this.trackNumber = "000000";
    }

    public Parcel(String nameReceiver, String addressDelivery, double weight, String trackNumber) {
        this.nameReceiver = nameReceiver;
        this.addressDelivery = addressDelivery;
        this.weight = weight;
        this.trackNumber = trackNumber;
    }

    public String getNameReceiver() {
        return nameReceiver;
    }

    public void setNameReceiver(String nameReceiver) {
        this.nameReceiver = nameReceiver;
    }

    public String getAddressDelivery() {
        return addressDelivery;
    }

    public void setAddressDelivery(String addressDelivery) {
        this.addressDelivery = addressDelivery;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Ошибка: вес не может быть отрицательным");
        }
    }

    public double calculateDeliveryPrice(){
        return (100 + weight) * 30;
    }

    public void printInfo(){
        System.out.println("Информация о всех полях посылки:");
        System.out.println("Имя получателя: " + nameReceiver);
        System.out.println("Адрес доставки: " + addressDelivery);
        System.out.println("Вес посылки: " + weight);
        System.out.println("Трек номер: " + trackNumber);
    }
}
