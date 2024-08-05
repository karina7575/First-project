package org.javaacademy.homeworks.homework2.office;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void panic() {
        System.out.println("Я ничего не успеваю, помогите!");
    }
}
