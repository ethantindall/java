package prove02;
import java.awt.*;

public class Zombie extends Creature implements Movable, Aggressor {
    public void attack(Creature target) {
        if(!(target instanceof Zombie) && !(target instanceof Plant)) {
            target.takeDamage(5);
        }
    }
    Shape getShape() {
        return Shape.Square;
    }
    Color getColor() {
        return new Color(0,0,255);
    }


    Boolean isAlive() {
        return true;
    }


    public void move() {
        _location.x++;
    }
}
