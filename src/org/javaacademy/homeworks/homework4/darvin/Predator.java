package org.javaacademy.homeworks.homework4.darvin;

public abstract class Predator extends Alive {


    public Predator(int weight) {
        super(weight);
    }

    public void attack(Alive alive) {
        if (this.live == true) {
            if (this.getWeight() < alive.getWeight()) {
                // В случае если вес жертвы больше хищника, то хищник погибает
                this.die();
            } else {
                //иначе вес хищника увеличивается на треть веса жертвы и жертва погибает
                this.weight += (alive.weight / 3);
                alive.die();
            }
        } else throw new DarvinException("Животное не может нападать");
    }
}
