package foes;

public class Zombie extends Enemy {

    public Zombie(int location){
	super(location);
	health = 15;
	armorClass = 12;
	toHit = 3;
    }
}
