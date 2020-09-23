package prove02;

import java.awt.*;

public class Wolf extends Creature implements Movable, Aware, Aggressor{
    public void attack(Creature target) {
        if(!(target instanceof Zombie) && !(target instanceof Plant)) {
            target.takeDamage(5);
        }
    }

    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {

    }

    Shape getShape() {
        return Shape.Square;
    }

    Color getColor() {
        return new Color(211,211,211);
    }

    Boolean isAlive() {
        return _health > 0;
    }

    public void move() {

    }
}
