package org.javaacademy.homeworks.homework3.PhoneFactory;

public class Camera {
    private int megaPixels;

    public Camera(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public void takeAPhoto() {
        System.out.println("Щелк! Сделано фото");
    }
}
