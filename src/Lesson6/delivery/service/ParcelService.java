package Lesson6.delivery.service;

import Lesson6.delivery.model.Parcel;

public class ParcelService {
    public void printParcelsReport(Parcel[] parcels) {
        for (Parcel parcel : parcels) {
            parcel.printInfo();
            System.out.println("Стоимость доставки: " + parcel.calculateDeliveryPrice() + " руб.");
            System.out.println();
        }
    }
}
