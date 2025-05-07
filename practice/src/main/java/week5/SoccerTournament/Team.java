package week5.SoccerTournament;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;            //team's name
    private List<Player> players;  // list of players on this team

    public Team(String name){
        this.name = name;                   //set a team name
        this.players = new ArrayList<>();  //start with an empty list of players

    }
    public void addPlayer(Player player){
        players.add(player);      // add one player to the team

    }
    public String getName(){
        return name;    //returns the team name
    }

    public List<Player> getPlayers() {
        return players; //returns the list of players
    }
}
