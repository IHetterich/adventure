package foes;

public class Zombie extends Enemy {

    public Zombie() {
	super("Zombie", 12, 15, 3, 3);

    public static final int HEALTH = 15;
    public static final int ARMOR_CLASS = 12;
    public static final int TO_HIT = 3;

    public Zombie(int location) {
        super(HEALTH, ARMOR_CLASS, TO_HIT, location);
    }

}
