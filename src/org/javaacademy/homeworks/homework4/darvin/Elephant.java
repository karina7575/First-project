package org.javaacademy.homeworks.homework4.darvin;

public class Elephant extends Herbivore {
    public Elephant(int weight) {
        super(weight);
    }

    public void run() {
        super.run();
        System.out.println("слон медленно бежит");
    }
}
