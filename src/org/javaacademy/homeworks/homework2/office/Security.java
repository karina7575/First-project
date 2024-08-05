package org.javaacademy.homeworks.homework2.office;

public class Security {
    private String name;

    public Security(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void askForSalary(Boss boss) {
        System.out.println(boss.getName() + ", дайте аванс! Очень надо!");
    }
}
