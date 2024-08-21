package org.javaacademy.homeworks.homework4.flying;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public void fly () throws FlyException {
        if(!this.isInjured) {
            System.out.println("yтка летит");
        }
        else throw new FlyException("Ошибка: утка ранена");
    }
}
