package org.javaacademy.homeworks.homework4.flying;

public class Plane implements Flyable {
    private int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void fly () throws FlyException {
        if(countPassengers >= 0) {
            System.out.println("самолет летит");
        }
        else throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
    }
}
