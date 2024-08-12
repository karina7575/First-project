package org.javaacademy.homeworks.homework3.PhoneFactory;

public class Cpu {
    private int mhz;

    public Cpu(int mhz) {
        this.mhz = mhz;
    }

    @Override
    public String toString() {
        return "Процессор: " +
                "количество вычислений в секунду = " + mhz;
    }
}
