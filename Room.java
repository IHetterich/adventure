import java.util.ArrayList;

public class Room{

    public String description;
    public ArrayList<Room>  adjRooms; 
    public int victory;
    public String name;
    
    Room(String name, String description, ArrayList<Room> adjRooms, int victory){
	this.name = name;
	this.description = description;
	this.adjRooms = adjRooms;
	this.victory = victory;
    }

    public void visit(){
	System.out.println(description);
    }
    
	
}
