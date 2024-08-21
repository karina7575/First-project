package org.javaacademy.homeworks.homework4;

import org.javaacademy.homeworks.homework4.car_wash.Car;
import org.javaacademy.homeworks.homework4.car_wash.CarWasher;
import org.javaacademy.homeworks.homework4.car_wash.HeavyCar;
import org.javaacademy.homeworks.homework4.car_wash.LightCar;
import org.javaacademy.homeworks.homework4.flying.Duck;
import org.javaacademy.homeworks.homework4.flying.FlyException;
import org.javaacademy.homeworks.homework4.flying.Flyable;
import org.javaacademy.homeworks.homework4.flying.Plane;
import org.javaacademy.homeworks.homework4.sound_around.*;

public class Runner {
    public static void main(String[] args) throws FlyException {
        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {
        Car[] cars = new Car[9];
        cars[0] = new LightCar(5, 2, 1.8, 5);
        cars[1] = new LightCar(5, 2, 1.8, 4);
        cars[2] = new LightCar(5, 2, 1.8, 2);
        cars[3] = new LightCar(5, 2, 1.8, 5);
        cars[4] = new HeavyCar(12, 3, 2.3, true);
        cars[5] = new HeavyCar(12, 3, 2.3, false);
        cars[6] = new HeavyCar(12, 3, 2.3, false);
        cars[7] = new HeavyCar(12, 3, 2.3, false);
        cars[8] = new HeavyCar(12, 3, 2.3, true);
        CarWasher washer = new CarWasher();
        System.out.println(washer.washAllCars(cars));
    }

    public static void ex2() {
        Flyable[] flyables = new Flyable[4];
        flyables[0] = new Duck(false);
        flyables[1] = new Duck(true);
        flyables[2] = new Plane(10);
        flyables[3] = new Plane(-1);
        for (Flyable things : flyables) {
            try {
                things.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void ex3() {
        MakingSound[] all = new MakingSound[4];
        all[0] = new Human();
        all[1] = new Builder();
        all[2] = new Driver();
        all[3] = new Bird();
        for (MakingSound i : all) {
            i.makeSound();
        }
    }

    public static void ex4() {
        //в пакете darvin класс Runner
    }
}
