package org.javaacademy.homeworks.homework4.darvin;

public abstract class Alive {
    protected boolean live;
    protected int weight;

    public Alive(int weight) {
        this.live = true;
        this.weight = weight;
    }

    public void die() {
        this.live = false;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
