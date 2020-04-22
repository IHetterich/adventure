import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Map{

    //Begin declaring rooms from end to beginning.
    public static Room temple = new Room("Temple", "Stone pews line half the room facing an ancient and gruesome altar that commands the other half. A massive countenance of some elder being looms overthe the blood stained altar. Regardless of your torch and how close you move to it the details of the face seem hidden in some stygian fog. A scratching in the back of your head suggests that perhaps it is for the best.", new ArrayList<Room>(), 1);
    
    public static Room hallway = new Room("Hallway", "A plain hallway with a single bend connects 4 rooms, the trickle of water can be heard from the two doors on either end. No sound eminates from the pair of doors along its length.", new ArrayList<Room>(Arrays.asList(temple)), 0);
    
    public static Room priest = new Room("Priest's Quarters", "Clearly belonging to the ranking priest in this temple a well made bed fills one corner of this room. A few shelves line the walls holding religious tomes and artifacts. A well appointed desk fills the center of the room. On it a book lies open, seemingly left so to let the ink of a new page dry. One door leads on.", new ArrayList<Room>(Arrays.asList(hallway)), 0);
    
    public static Room mess = new Room("Mess Hall", "A small kitchen with a long cold wood burning stove stretches along one wall. Long tables and their accompanying benches fill the rest of the room. It seems whatever happened in this temple happened during a meal as plates line the tables, their forgotten contents left to rot. Two doors lead on, one opposite and one to the left.", new ArrayList<Room>(Arrays.asList(hallway, priest)), 0);
    
    public static Room storage = new Room("Storage Room", "The relatively small room is cramped with boxes. The overwhelming smell of spoiled grain and meat suggests this was used as a pantry of sorts. You see no other doors than the one you have come through.", new ArrayList<Room>(), 0);
    
    public static Room dormitory = new Room("Dormitory", "Old bunks line the walls, the bedding rotting and filling the room with a wet stench. Two tables fill about half the space, bearing the memories and marks of many card games and idle carvings by the cultists who whiled away many an aimless hour in this room. Two doors lead on, one directly in front of you and one to the right.", new ArrayList<Room>(Arrays.asList(storage, mess)), 0);

    public static Room statues = new Room("Statue Room", "Statues portraying what you assume are ancient priests or dark saints of this religion line the walls staring down at you with twisted smiles and grimaces. The room is much longer than it is wide and the gaze of these stone cultists seems to bore into on the uneasy walk to the door on the other end.", new ArrayList<Room>(Arrays.asList(temple)), 0);
    
    public static Room altar = new Room("Altar Room", "A short hallway turning to the left leads to another door, the trickle of water can be heard on the other side. Opening the doors four altars fillthis room, two on your left and two on the right. The wall is cracked and a small stream flows from an altar on right across the room and into another crack on the left. A door stand on opposite you.", new ArrayList<Room>(Arrays.asList(statues)), 0);

    public static Room library = new Room("Library", "Old shelves fill the room sagging under the weight of both time and the musty tomes lining them. A small underground stream has forced it's way through one wall and runs through the room before exiting. Several shelves have long ago collapsed into it and the metal spines of long ago disintegrated books lay in the water. A door stands opposite you.", new ArrayList<Room>(Arrays.asList(hallway, temple)), 0);
    
    public static Room entrance = new Room("Temple Entrance", "Mildewed tapestries line the walls of this entry room. Rotting from the wetness seeping through from the cave the rotten cloths portray foul gods and dark deeds. A door stands in the center of each wall leading deeper into the temple.", new ArrayList<Room>(Arrays.asList(library, dormitory, altar)), 0);

    public static Room cave = new Room("Cave", "The wet dank of the cave fills your lungs. Moss covers the walls and within its recesses you find an ancient door.", new ArrayList<Room>(Arrays.asList(entrance)), 0);

    public static Room mouth = new Room("Mouth of Cave", "You stand at the mouth of a cave", new ArrayList<Room>(Arrays.asList(cave)), 0);

    public static ArrayList<Room> roomList = new ArrayList<Room>(Arrays.asList(temple, hallway, priest, mess, storage, dormitory, statues, altar, library, entrance, cave, mouth));

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
}
