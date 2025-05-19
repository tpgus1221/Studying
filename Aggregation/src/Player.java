public class Player {
    String name;
    public Player(String name, Team team){
        this.name = name;
        team.addPlayerList(this);
        Main.total.add(this);
    }

    public String getPlayerName() {
        return name;
    }

}
