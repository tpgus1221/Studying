import java.util.ArrayList;

public class Main {
    public static ArrayList<Player> total = new ArrayList<>();
    public static void main(String[] args) {

        Team A = new Team("A");
        Team B = new Team("B");

        Player a = new Player("a", A);
        Player b = new Player("b", B);
        Player c = new Player("c", A);
        Player d = new Player("d", B);
        Player e = new Player("e", A);
        Player f = new Player("f", B);

        System.out.print("전체 선수: ");
        for (Player name : total){
            System.out.print(name.getPlayerName() + " ");
        }

        System.out.print("\nA팀의 선수: ");
        for (Player name : A.getPlayerList()){
            System.out.print(name.getPlayerName() + " ");
        }

        System.out.print("\nB팀의 선수: ");
        for (Player name : B.getPlayerList()){
            System.out.print(name.getPlayerName() + " ");
        }

        B = null;

        System.out.print("\nB팀이 없어지고 전체 선수: ");
        for (Player name : total){
            System.out.print(name.getPlayerName() + " ");
        }


    }
}