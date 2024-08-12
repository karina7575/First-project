package org.javaacademy.homeworks.immutablecity;

import java.util.Arrays;

public final class City {
    private final String cityName;
    private House[] houses;

    public City(String cityName, House[] housesFromMain) {
        this.cityName = cityName;
        houses = new House[2];
        for (int i = 0; i < houses.length; i++) {
            House house = new House(housesFromMain[i].getStreet(), housesFromMain[i].getHouseNumber());
            this.houses[i] = house;
        }
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", houses=" + Arrays.toString(houses) +
                '}';
    }

    public House[] getHouses() {
        House[] copyHouses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            House houseCopy = new House(houses[i].getStreet(), houses[i].getHouseNumber());
            copyHouses[i] = houseCopy;
        }
        return copyHouses;
    }
}
