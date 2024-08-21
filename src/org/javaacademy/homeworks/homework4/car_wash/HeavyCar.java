package org.javaacademy.homeworks.homework4.car_wash;

public class HeavyCar extends Car {

    private boolean cruiseControl;

    public HeavyCar(int length, int height, double width, boolean cruiseControl) {
        super(length, height, width);
        this.cruiseControl = cruiseControl;
    }
}
