package cz.tul.stin.kuryr;

import cz.tul.stin.kuryr.delivery.Delivery;
import cz.tul.stin.kuryr.shipping.AirDelivery;
import cz.tul.stin.kuryr.shipping.BikeDelivery;
import cz.tul.stin.kuryr.shipping.TruckDelivery;

public class Main {
    public static void main(String[] args) {
        Delivery d1 = new Delivery(
                "A123",
                10,
                new TruckDelivery()
        );

        Delivery d2 = new Delivery(
                "A321",
                10,
                new AirDelivery()
        );

        Delivery d3 = new Delivery(
                "A456",
                5,
                new BikeDelivery()
        );

        System.out.println("Truck: " + d1.calculatePrice());
        System.out.println("Air: " + d2.calculatePrice());
        System.out.println("Bike: " + d3.calculatePrice());
    }
}
