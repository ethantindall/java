package prove02;

import java.awt.*;
import java.util.Random;

public class Rhino extends Creature implements Movable, Aggressor, Roamer {
    private int _direction = new Random().nextInt(4);
    private int steps = 0;

    @Override
    public void attack(Creature target) {
        if(target != null) {
            target.takeDamage(20);
        }
    }

    Shape getShape() {
        return Shape.Square;
    }

    Color getColor() {
        return new Color(0,0,0);
    }

    Boolean isAlive() {
        return true;
    }


    public void move() {
        roam();
        switch (_direction) {
            case 0:
                _location.x--;
                break;
            case 1:
                _location.x++;
                break;
            case 2:
                _location.y++;
                break;
            case 3:
                _location.y--;
                break;
            default:
                break;
        }
       steps += 1;
    }

    @Override
    public void roam() {
        if (steps == 20) {
            _direction = new Random().nextInt(4);
            steps = 0;
            _health -= 1;
        }
    }
}
