package foes;

public class Enemy {

    private int armorClass = 0;
    private int health = 0;
    private int toHit = 0;
    private int location;

    Enemy(int health, int toHit, int armorClass, int location) {
        this.location = location;
        this.health = health;
        this.toHit = toHit;
        this.armorClass = armorClass;
    }

    // TODO: What should attack either take or return?
    // hint: I think it only needs to be one or the other...
    public void attack() {

    }

    public int getArmorClass() {
        return this.armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }
}
