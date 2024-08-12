package org.javaacademy.homeworks.homework3.PhoneFactory;

public class IphoneFactory {
    public static Iphone createIphone() {
        return new Iphone(1000, 1000, 8, 60, 200, 10);
    }
}
