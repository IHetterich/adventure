package foes;

import dice.*;

public class Enemy {

    public String type;
    private int armorClass;
    private int health;
    private int toHit;
    private int damCode;
    private boolean dead = false;
    private Dice die = new Dice();
    
    Enemy(String type, int armorClass, int health, int toHit, int damCode) {
	this.type = type;
	this.armorClass = armorClass;
	this.health = health;
	this.toHit = toHit;
	this.damCode = damCode;
    }

    public int getArmorClass() {
	return this.armorClass;
    }

    public int getHealth() {
	return this.health;
    }
	
    public int getArmorClass() {
        return this.armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getToHit() {
	return this.toHit;
    }

    public boolean getDead() {
	return this.dead;
    }

    public void damage(int damage) {
	this.health = this.health - damage;
	if(this.health <= 0){
	    this.dead = true;
	    System.out.println("The " + this.type + " dies!");
	}
    }
    
    public int attack(int ac) {
	if(!this.dead) {
	    System.out.println("The " + type + " swings at you!");
	    int damage;
	    if(die.rolld20() + this.toHit >= ac) {
		switch(this.damCode){
		case 1:
		    damage = die.rolld2();
		    break;
		case 2:
		    damage = die.rolld4();
		    break;
		case 3:
		    damage = die.rolld6();
		    break;
		case 4:
		    damage = die.rolld8();
		    break;
		case 5:
		    damage = die.rolld10();
		    break;
		case 6:
		    damage = die.rollD12();
		    break;
		default:
		    System.out.println("Invalid damage code");
		    return 0;
		    break;
		}
		System.out.println("It hits you for " + damage + " damage!");
		return damage;
	    }else {
		System.out.println("And it misses!");
		return 0;
	    }
	}
	return 0;
    }
    
}
