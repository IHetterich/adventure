import foes.*;
import java.util.*;
import java.util.ArrayList;

public class Adventure{

    public static Room currentRoom;
    
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	//Dice dice = new Dice();
	PlayerCharacter player = new PlayerCharacter();
	currentRoom = Map.mouth;
	String action;

	Zombie one = new Zombie(1);
	System.out.println(one.location);
	player.creation();
	Map.makeDoors();
	Map.mouth.adjRooms.add(Map.temple);

	player.tutorial();
        
	while(currentRoom.victory != 1){
	    System.out.println("So what do you do adventurer?");

	    action = input.nextLine();
	    action = action.toLowerCase();
	    
	    switch(action){
	    case "look":
		currentRoom.visit();
		break;
	    case "move":
		player.move();
		break;
	    case "attack":
		player.attack();
		break;
	    default:
		System.out.println("Your options are Look, Move, and Attack");
		break;
	    }
	}
	    System.out.println("Congratulations! You won!");
    }
}
