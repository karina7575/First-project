package org.javaacademy.homeworks.homework3.PhoneFactory;

public class Samsung {
    private Cpu SamsungCpu;
    private Camera SamsungCamera;
    private Case SamsungCase;

    public Samsung(int samsungCpu, int samsungCameraMegaPixels, int length, int width, int height) {
        SamsungCpu = new Cpu(samsungCpu);
        SamsungCamera = new Camera(samsungCameraMegaPixels);
        SamsungCase = new Case(length, width, height);
    }

    public void takeAPhoto() {
        System.out.println("Сделано фото");
    }

}
