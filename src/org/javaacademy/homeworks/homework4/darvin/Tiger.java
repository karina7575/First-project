package org.javaacademy.homeworks.homework4.darvin;

public class Tiger extends Predator {
    public Tiger(int weight) {
        super(weight);
    }

    @Override
    public void attack(Alive alive) {
        if (this.live == true) {
            if (this.getWeight() < alive.getWeight() * 2) {
                // тигр может сьесть жертву весом до двух раз больше него
                this.die();
            } else {
                //иначе вес хищника увеличивается на треть веса жертвы и жертва погибает
                this.weight += (alive.weight / 3);
            }
        } else throw new DarvinException("Животное не может нападать");
    }
}
