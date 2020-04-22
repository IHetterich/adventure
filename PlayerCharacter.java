import java.util.ArrayList;
import java.util.*;

public class PlayerCharacter {

    public int hitPoints = 25;
    public int strength = 0;
    public int dexterity = 0;
    public int brains = 0;
    public String name = "Bob";
    public int toHit = 2 + strength;
    public int armorClass = 10 + dexterity;
    private Scanner input = new Scanner(System.in);
    
    public PlayerCharacter() {
    }    

    public void creation(){
	System.out.println("Name");
	this.name = input.nextLine();
	System.out.println("Strength");
	this.strength = input.nextInt();
	System.out.println("Dex");
	this.dexterity = input.nextInt();
	System.out.println("Brains");
	this.brains = input.nextInt();
    }

    public void tutorial(){
	String test;
	
	System.out.println("Well then " + this.name + " those are really the only questions we had for you. Lets talk about these controls.");

	System.out.println("Your main actions are Look, Move, and Attack.");
	System.out.println("Let's try that first one. Type 'Look' in order to get a description of your surroundings.");

	//to clear out the /n from previous we run .nextLine()
	input.nextLine();
	test = input.nextLine().toLowerCase();
       
	if(test.equals("look")){
	    Adventure.currentRoom.visit();
	}else System.out.println("Come on, we asked you to type 1 word");
    }
    
    public void move(){
	int dest;
	
	if(Adventure.currentRoom.adjRooms.size() == 1){
	    System.out.println("There is 1 exit:");
	}else{
	    System.out.println("There are " + Adventure.currentRoom.adjRooms.size() + " exits:");
	}

	for(int i = 0; i < Adventure.currentRoom.adjRooms.size(); i++){
	    System.out.println(i + 1 + ". " + Adventure.currentRoom.adjRooms.get(i).name);
	}

	dest = input.nextInt();

	Adventure.currentRoom = Adventure.currentRoom.adjRooms.get(dest - 1);

	Adventure.currentRoom.visit();
    }

    public void attack(){
    }
}
    
