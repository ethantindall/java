package tindall;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private int health;
    private int mana;
    private int gold;
    private Map<String, Integer> equipment = new HashMap<>();

    public void addEquipment(String x, Integer y) {
        equipment.put(x, y);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
