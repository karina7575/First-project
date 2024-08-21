package org.javaacademy.homeworks.homework4.car_wash;

public class LightCar extends Car {

    private int maxPassengers;

    public LightCar(int length, int height, double width, int maxPassengers) {
        super(length, height, width);
        this.maxPassengers = maxPassengers;
    }
}
