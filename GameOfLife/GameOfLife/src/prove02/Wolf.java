package prove02;
import java.awt.*;
import java.util.Random;

public class Wolf extends Creature implements Movable, Aware, Aggressor{

    private int _direction = new Random().nextInt(4);

    public void attack(Creature target) {
        if(target instanceof Creature && !(target instanceof Zombie) && !(target instanceof Plant)) {
            target.takeDamage(5);
        }
    }

    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {
        if ((left instanceof Animal) && !(left instanceof Zombie)) {
            _direction = 0;
            System.out.println("change");
        }
        if ((right instanceof Animal) && !(right instanceof Zombie)) {
            _direction = 1;
            System.out.println("change");
        }
        if ((above instanceof Animal) && !(above instanceof Zombie)) {
            _direction = 2;
            System.out.println("change");
        }
        if ((below instanceof Animal) && !(below instanceof Zombie)) {
            _direction = 3;
            System.out.println("change");
        }
    }

    Shape getShape() {
        return Shape.Square;
    }

    Color getColor() {
        return new Color(150,150,150);
    }

    Boolean isAlive() {
        return true;
    }

    public void move() {
        switch (_direction) {
            case 0:
                _location.x++;
                break;
            case 1:
                _location.x--;
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
    }
}
