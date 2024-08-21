package org.javaacademy.homeworks.homework4.darvin;

public class Runner {
    public static void main(String[] args) {
        Predator tiger = new Tiger(300);
        Predator wolf = new Wolf(50);
        Herbivore rabbit = new Rabbit(2);
        Herbivore elephant = new Elephant(2000);
        try {
            rabbit.run();
            wolf.attack(rabbit);
            tiger.attack(wolf);
            tiger.attack(elephant);
            elephant.run();
            rabbit.run();
        } catch (DarvinException e) {
            System.out.println(e.getMessage());
        }
    }
}
