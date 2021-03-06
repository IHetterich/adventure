import java.util.*;
import java.util.ArrayList;
import foes.*;

public class Room{

    public String name;
    public boolean visited = false;
    public String description;
    public ArrayList<Room>  adjRooms;
    public boolean clear = false;
    public ArrayList<Enemy> enemies;
    public String ncDesc;
    public String cDesc;
    public boolean victory;
    
    Room(String name, String description, ArrayList<Room> adjRooms, ArrayList<Enemy> enemies, String ncDesc, String cDesc, boolean victory){
	this.name = name;
	this.description = description;
	this.adjRooms = adjRooms;
	this.enemies = enemies;
	this.ncDesc = ncDesc;
	this.cDesc = cDesc;
	this.victory = victory;
    }

    public void visit(){
	visited = true;
	clearTest();	
    }
    
    public void look() {
	System.out.println(this.description);
	if(this.clear){
	    System.out.println(this.cDesc);
	}else System.out.println(this.ncDesc);
    }

    /*
    public Room move(){
	     
	Scanner input = new Scanner(System.in);
	int dest;
	Room destRoom;
	if(this.adjRooms.size() == 1){
	    System.out.println("There is 1 exit:");
	}else{
		System.out.println("There are " + this.adjRooms.size() + " exits:");
        }

	for(int i = 0; i < this.adjRooms.size(); i++) {
		System.out.println(i + 1 + ". " + this.adjRooms.get(i).name);
        }

        dest = input.nextInt();
        destRoom = this.adjRooms.get(dest - 1);
	
        if(this.clear) {
	    return destRoom;
        }else {
	    System.out.println("That door is not accessible in combat");
	    return;
        }
    }
    */

    public void clearTest() {
	boolean isClear = true;

	if(enemies.size() == 0){
	    this.clear = true;
	}else{
	    for(int i = 0; i < enemies.size(); i++) {
		isClear = isClear && enemies.get(i).getDead();
	    }
	    this.clear = isClear;
	}
    }
	
	
}
