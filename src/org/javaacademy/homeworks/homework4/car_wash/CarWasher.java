package org.javaacademy.homeworks.homework4.car_wash;

public class CarWasher {
    public int wash(Car car) {
        int washPrice;
        car.setClean(true);
        if (getCategory(car)) {
            washPrice = 4000;
        } else {
            washPrice = 2000;
        }
        return washPrice;
    }

    public int washAllCars(Car[] cars) {
        int price = 0;
        for (int i = 0; i < cars.length; i++) {
            price += wash(cars[i]);
        }
        return price;
    }

    public boolean getCategory(Car car) {
        int minLength = 6;
        double minHeight = 2.5;
        int minWidth = 2;
        boolean big = false;
        int countSuccessRules = 0;
        countSuccessRules += car.getLength() > minLength ? 1 : 0;
        countSuccessRules += car.getHeight() > minHeight ? 1 : 0;
        countSuccessRules += car.getWidth() > minWidth ? 1 : 0;

        if (countSuccessRules > 1) {
            big = true;
        }
        return big;
    }


}
