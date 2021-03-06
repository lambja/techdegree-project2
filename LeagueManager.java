import com.teamtreehouse.model.Player;
import com.teamtreehouse.model.Players;
import com.teamtreehouse.model.Organizer;
import com.teamtreehouse.model.Team;

public class LeagueManager {

  public static void main(String[] args) {
    Player[] players = Players.load();
    System.out.printf("There are currently %d registered players.%n", players.length);
    Organizer organizer = new Organizer(players);
    organizer.run();
  }

}
