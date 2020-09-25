import java.util.*;

public class AI {

    public static int enemyTurn(PlayerCharacter player, Room currentRoom) {
	for(int i = 0; i < currentRoom.enemies.size(); i++) {
	    player.hitPoints = player.hitPoints - currentRoom.enemies.get(i).attack(player.getAC());
	}
	return player.hitPoints;
    }

}
