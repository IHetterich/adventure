import java.util.ArrayList;
import java.util.*;
import foes.*;
import dice.*;

public class PlayerCharacter {

    public int hitPoints = 25;
    public int strength = 0;
    public int dexterity = 0;
    public int brains = 0;
    public String name = "Bob";
    public int toHit = 2 + strength;
    public int armorClass = 10;
    private Scanner input = new Scanner(System.in);
    private Dice die = new Dice();
    
    public PlayerCharacter() {
    }    

    public int getHP() {
	return this.hitPoints;
    }

    public void setHP(int newHP) {
	this.hitPoints = newHP;
    }

    public int getAC() {
	return this.armorClass;
    }
    
    public void creation() {
	System.out.println("Name");
	this.name = input.nextLine();
	System.out.println("Strength");
	this.strength = input.nextInt();
	System.out.println("Dex");
	this.dexterity = input.nextInt();
	System.out.println("Brains");
	this.brains = input.nextInt();
	this.armorClass = 10 + dexterity;
    }

    public void tutorial(Room currentRoom){
	String test;
	
	System.out.println("Well then " + this.name + " those are really the only questions we had for you. Lets talk about these controls.");

	System.out.println("Your main actions are Look, Move, and Attack.");
	System.out.println("Let's try that first one. Type 'Look' in order to get a description of your surroundings.");

	//to clear out the /n from previous we run .nextLine()
	input.nextLine();
	test = input.nextLine().toLowerCase();
       
	if(test.equals("look")){
	    currentRoom.look();
	}else System.out.println("Come on, we asked you to type 1 word");
    }

    public void attack(Room currentRoom){
	if(currentRoom.clear) {
	    System.out.println("There are no enemies to attack.");
	}else {
	    System.out.println("You face " + currentRoom.enemies.size() + " enemies:");
	    for(int i = 0; i < currentRoom.enemies.size(); i++) {
		Enemy currentEnemy = currentRoom.enemies.get(i);
		if(currentEnemy.getDead()) {
		    System.out.println(i + 1 + ". Dead " + currentEnemy.type);
		}else {
		    System.out.println(i + 1 + ". " + currentEnemy.type);
		}
	    }
	    System.out.println("Who do you attack?");
	    Enemy target = currentRoom.enemies.get(input.nextInt() - 1);

	    if(die.rolld20() + this.strength >= target.getArmorClass()) {
		int damage = die.rolld10() + strength;
		System.out.println("You strike the " + target.type + " for " + damage + " damage!");
		target.damage(damage);
	    }else {
		System.out.println("Your strike misses!");
	    }
	}
    }

    public void status() {
	System.out.println("HP: " + this.hitPoints);
	System.out.println("AC: " + this.armorClass);
    }
}    
