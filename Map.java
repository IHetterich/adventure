import java.util.*;
/*
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
*/
import foes.*;

public class Map{

    public static void makeDoors(){
	for(int i = 0; i < roomList.size(); i++){
	    Room a = roomList.get(i);
	    for(int r = 0; r < a.adjRooms.size(); r++){
		Room b = a.adjRooms.get(r);
	       	if(b.adjRooms.contains(a)){
		}else{
		    b.adjRooms.add(a);
		}
	    }
	}
    }

    public static Room move(Room currentRoom){
	     
	Scanner input = new Scanner(System.in);
	int dest;
	Room destRoom;
	if(currentRoom.adjRooms.size() == 1){
	    System.out.println("There is 1 exit:");
	}else{
		System.out.println("There are " + currentRoom.adjRooms.size() + " exits:");
        }

	for(int i = 0; i < currentRoom.adjRooms.size(); i++) {
		System.out.println(i + 1 + ". " + currentRoom.adjRooms.get(i).name);
        }

        dest = input.nextInt();
        destRoom = currentRoom.adjRooms.get(dest - 1);
	
        if(currentRoom.clear) {
	    currentRoom = destRoom;
        }else {
	    if(destRoom.visited) {
		currentRoom = destRoom;
	    }else {
		System.out.println("That door is not accessible in combat");
	    }
	}
	
	return currentRoom;
    }

    
    //Full declaration of Cultist Temple
    
    public static Room temple = new Room("Temple", "Stone pews line half the room facing an ancientand gruesome altar that commands the other half. A massive countenance of some elder being looms over the the blood stained altar. Regardless of your torch and how close you move to it the details of the face seem hidden in some stygian fog. A scratching in the back of your head suggests that perhaps it is for the best.", new ArrayList<Room>(), new ArrayList<Enemy>(Arrays.asList(Bestiary.priest)), "A shambling form standing on the altar turns to face you. A seeming explosion of flesh has erupted from and torn a priest's vestments to tatters. Facial features and innumerable limbs protrude haphazardly from its entire surface. It's many mouths open at once and a chorus of anguish fills the chamber as it begins shambling torwards you.", "The mass of flesh that you fear was once a person now lies motionless amongst the pews.", true);
    
    public static Room hallway = new Room("Hallway", "A plain hallway with a single bend connects 4 rooms, the trickle of water can be heard from the two doors on either end. No sound eminates from the pair of doors along its length.", new ArrayList<Room>(Arrays.asList(temple)), new ArrayList<Enemy>(), "", "You stand alone.", false);
    
    public static Room priest = new Room("Priest's Quarters", "Clearly belonging to the ranking priest in this temple a well made bed fills one corner of this room. A few shelves line the walls holding religious tomes and artifacts. A well appointed desk fills the center of the room. On it a book lies open, seemingly left so to let the ink of a new page dry. One door leads on.", new ArrayList<Room>(Arrays.asList(hallway)), new ArrayList<Enemy>(), "", "You stand alone.", false);
    
    public static Room mess = new Room("Mess Hall", "A small kitchen with a long cold wood burning stove stretches along one wall. Long tables and their accompanying benches fill the rest of the room. It seems whatever happened in this temple happened during a meal as plates line the tables, their forgotten contents left to rot. Two doors lead on, one opposite and one to the left.", new ArrayList<Room>(Arrays.asList(hallway, priest)), new ArrayList<Enemy>(), "", "You stand alone.", false);
    
    public static Room storage = new Room("Storage Room", "The relatively small room is cramped with boxes. The overwhelming smell of spoiled grain and meat suggests this was used as a pantry of sorts. You see no other doors than the one you have come through.", new ArrayList<Room>(), new ArrayList<Enemy>(), "", "You stand alone.", false);
    
    public static Room dormitory = new Room("Dormitory", "Old bunks line the walls, the bedding rotting and filling the room with a wet stench. Two tables fill about half the space, bearing the memories and marks of many card games and idle carvings by the cultists who whiled away many an aimless hour in this room. Two doors lead on, one directly in front of you and one to the right.", new ArrayList<Room>(Arrays.asList(storage, mess)), new ArrayList<Enemy>(Arrays.asList(Bestiary.dormSoul1, Bestiary.dormSoul2)), "Whispered screams of torment scratch at your mind as the spirits of former occupants advance torwards you. Their ghostly hands grasping first at the air and then at your flesh.", "You stand alone, the faint whispers of now resting souls haunting your memory.", false);

    public static Room statues = new Room("Statue Room", "Statues portraying what you assume are ancient priests or dark saints of this religion line the walls staring down at you with twisted smiles and grimaces. The room is much longer than it is wide and the gaze of these stone cultists seems to bore into on the uneasy walk to the door on the other end.", new ArrayList<Room>(Arrays.asList(temple)), new ArrayList<Enemy>(Arrays.asList(Bestiary.statue)), "The grinding of stone against stone assaults your ears as a statue shutters to life and begins attacking!", "The shattered remains of a statue cover a portion of the floor.", false);
    
    public static Room altar = new Room("Altar Room", "A short hallway turning to the left leads to another door, the trickle of water can be heard on the other side. Opening the doors four altars fillthis room, two on your left and two on the right. The wall is cracked and a small stream flows from an altar on right across the room and into another crack on the left. A door stand on opposite you.", new ArrayList<Room>(Arrays.asList(statues)), new ArrayList<Enemy>(), "", "You stand alone.", false);

    public static Room library = new Room("Library", "Old shelves fill the room sagging under the weight of both time and the musty tomes lining them. A small underground stream has forced it's way through one wall and runs through the room before exiting. Several shelves have long ago collapsed into it and the metal spines of long ago disintegrated books lay in the water. A door stands opposite you.", new ArrayList<Room>(Arrays.asList(hallway)), new ArrayList<Enemy>(Arrays.asList(Bestiary.libBook1, Bestiary.libBook2, Bestiary.libBook3)), "Flapping on fetid covers several ancient tomes launch themselves at you.", "Destroyed books, no longer animated liter the floor", false);
    
    public static Room entrance = new Room("Temple Entrance", "Mildewed tapestries line the walls of this entry room. Rotting from the wetness seeping through from the cave the rotten cloths portray foul gods and dark deeds. A door stands in the center of each wall leading deeper into the temple.", new ArrayList<Room>(Arrays.asList(library, dormitory, altar)), new ArrayList<Enemy>(), "", "You stand alone.", false);

    public static Room cave = new Room("Cave", "The wet dank of the cave fills your lungs. Moss covers the walls and within its recesses you find an ancient door.", new ArrayList<Room>(Arrays.asList(entrance)), new ArrayList<Enemy>(), "", "You stand alone.", false);

    public static Room mouth = new Room("Mouth of Cave", "You stand at the mouth of a cave", new ArrayList<Room>(Arrays.asList(cave)), new ArrayList<Enemy>(), "", "You stand alone.", false);

    public static ArrayList<Room> roomList = new ArrayList<Room>(Arrays.asList(temple, hallway, priest, mess, storage, dormitory, statues, altar, library, entrance, cave, mouth));

}
