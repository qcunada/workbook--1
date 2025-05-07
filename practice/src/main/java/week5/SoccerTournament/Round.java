package week5.SoccerTournament;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private List<Match> matches;     //All the matches in this round

    public Round (){
        this.matches = new ArrayList<>();  //start with no matches
    }
    public void addMatch(Match match){
        matches.add(match);     //add a match to this round
    }

    public List<Match> getMatches() {
        return matches;     //return the list of matches
    }

    public List<Team> playRound(){
        System.out.println("===Starting Round===");
        List<Team> winners = new ArrayList<>();  // collect winners of this match
        for (Match match : matches) {
            match.playMatch();                   // play each match
            winners.add(match.getWinner());      //add winner to the list
        }
        System.out.println("===Round Complete===");
        System.out.println();
        return winners;  //return all winning teams
    }
}
