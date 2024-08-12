package org.javaacademy.homeworks.homework3;

import org.javaacademy.homeworks.homework3.PhoneFactory.Iphone;
import org.javaacademy.homeworks.homework3.PhoneFactory.IphoneFactory;
import org.javaacademy.homeworks.homework3.PhoneFactory.Samsung;
import org.javaacademy.homeworks.homework3.PhoneFactory.SamsungFactory;
import org.javaacademy.homeworks.homework3.pyramids.Pyramid1;
import org.javaacademy.homeworks.immutablecity.City;
import org.javaacademy.homeworks.immutablecity.House;

public class Runner {
    public static void main(String[] args) {
        ex2();
        ex3();
        ex4();

    }

    public static void ex1() {
        //в раннере пакета shop
    }

    public static void ex2() {
        Iphone iphone = IphoneFactory.createIphone();
        Samsung samsung = SamsungFactory.createSamsung();
        iphone.takeAPhoto();
        iphone.cpuInfo();
        samsung.takeAPhoto();
    }

    public static void ex3() {
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
    }

    /**
     * Для продвинутых
     */
    public static void ex4() {
        House[] houses = new House[2];
        houses[0] = new House("Ленина", 3);
        houses[1] = new House("Сухаревская", 1);

        City city = new City("Томск", houses);
        House house3 = city.getHouses()[1];
        System.out.println(city);
        house3.setHouseNumber(613);
        System.out.println(house3);
        System.out.println(city);
    }
}
