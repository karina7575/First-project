package org.javaacademy.homeworks.homework4.darvin;

public abstract class Herbivore extends Alive {

    public Herbivore(int weight) {
        super(weight);
    }

    public void run() {
        if (this.live == false) {
            throw new DarvinException("Животное не может бегать");
        }
    }
}
