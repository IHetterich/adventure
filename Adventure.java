import foes.*;
import java.util.*;

public class Adventure { 

    public static Room currentRoom;
    
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	PlayerCharacter player = new PlayerCharacter();
	Room currentRoom;
	Map.makeDoors();
	currentRoom = Map.mouth;
	currentRoom.visit();	
	String action;

     	player.creation();
	player.tutorial(currentRoom);
        
	while(!currentRoom.victory || !currentRoom.clear) {
	    System.out.println("So what do you do adventurer?");

	    action = input.nextLine();
	    action = action.toLowerCase();
	    
	    switch(action){
	    case "look":
		currentRoom.look();
		break;
	    case "move":
		currentRoom = Map.move(currentRoom);
		currentRoom.visit();
		currentRoom.look();
		break;
	    case "attack":
		player.attack(currentRoom);
	        player.hitPoints = AI.enemyTurn(player, currentRoom);
		currentRoom.clearTest();
		break;
	    case "status":
		player.status();
		break;
	    default:
		System.out.println("Your options are Look, Move, Status, and Attack");
		break;
	    }
	}
	    System.out.println("Congratulations! You won!");
    }
}
