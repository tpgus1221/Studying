import java.util.ArrayList;

public class Team {
    String name;
    ArrayList<Player> playerList = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }
    public void addPlayerList(Player player){
        playerList.add(player);
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }
}
