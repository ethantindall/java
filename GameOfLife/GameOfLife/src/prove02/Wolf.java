package prove02;
import java.awt.*;
import java.util.Random;

public class Wolf extends Creature implements Movable, Aware, Spawner, Aggressor{

    private int _direction = new Random().nextInt(4);
    private boolean _ready;

    public void setReady(Boolean x) {_ready = x;}
    public boolean getReady() {return _ready;}

    public Wolf() {
    }

    public void attack(Creature target) {
        if(target instanceof Creature && !(target instanceof Zombie) && !(target instanceof Plant)) {
            target.takeDamage(5);
            setReady(true);
        }
    }

    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {
        if ((left instanceof Animal) && !(left instanceof Zombie)) {
            _direction = 0;}
        if ((right instanceof Animal) && !(right instanceof Zombie)) {
            _direction = 1;}
        if ((above instanceof Animal) && !(above instanceof Zombie)) {
            _direction = 2;}
        if ((below instanceof Animal) && !(below instanceof Zombie)) {
            _direction = 3;}
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
    }
    public Creature spawnNewCreature() {
        if (getReady() == true) {
            Wolf w = new Wolf();
            w.setLocation(new Point(_location.x-1, _location.y-1));
            setReady(false);
            return w;
        }
        setReady(false);
        return null;
    }
}
