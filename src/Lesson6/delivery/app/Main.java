package Lesson6.delivery.app;

import Lesson6.delivery.model.*;
import Lesson6.delivery.service.ParcelService;

public class Main {
    public static void main(String[] args) {
        Parcel regularParcel = new Parcel(
                "Александр Солодуха",
                "г. Минск, ул. Амураторская, 4, офис 319б",
                2.5,
                "CN123456789BY"
        );

        Parcel fragileParcel = new FragileParcel(
                "Юрий Лоза",
                "п. Юрьево, ул. Вишневая, д. 5",
                1.8,
                "CN987654321RU",
                true
        );

        Parcel expressParcel = new ExpressParcel(
                "Евгений Петросян",
                "д. Жаворонки , ул. Наприколе, д. 156",
                3.0,
                "CN111222333",
                7
        );

        Parcel defaultParcel = new Parcel();
        Parcel[] parcels = {
                regularParcel,
                fragileParcel,
                expressParcel,
                defaultParcel
        };

        ParcelService parcelService = new ParcelService();
        parcelService.printParcelsReport(parcels);
    }
}
