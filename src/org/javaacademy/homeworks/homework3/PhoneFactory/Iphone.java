package org.javaacademy.homeworks.homework3.PhoneFactory;

public class Iphone {
    private Cpu iphoneCpu1;
    private Cpu iphoneCpu2;
    private Camera iphoneCamera;
    private Case iphoneCase;

    public Iphone(int iphoneCpu1, int iphoneCpu2, int iphoneCameraMegaPixels, int length, int width, int height) {
        this.iphoneCpu1 = new Cpu(iphoneCpu1);
        this.iphoneCpu2 = new Cpu(iphoneCpu2);
        this.iphoneCamera = new Camera(iphoneCameraMegaPixels);
        this.iphoneCase = new Case(length, width, height);
    }

    public void takeAPhoto() {
        System.out.println("Сделано фото");
    }

    public void cpuInfo() {
        System.out.println(iphoneCpu1);
        System.out.println(iphoneCpu2);
    }
}
