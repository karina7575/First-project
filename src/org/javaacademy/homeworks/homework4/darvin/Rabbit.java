package org.javaacademy.homeworks.homework4.darvin;

public class Rabbit extends Herbivore {
    public Rabbit(int weight) {
        super(weight);
    }

    public void run() {
        super.run();
        System.out.println("кролик быстро бежит");
    }

}
