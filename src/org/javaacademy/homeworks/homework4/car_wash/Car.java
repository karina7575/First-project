package org.javaacademy.homeworks.homework4.car_wash;

public abstract class Car {
    private boolean isClean;
    private int length;
    private int height;
    private double width;

    public Car(int length, int height, double width) {
        this.isClean = false;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
