package week5.SoccerTournament;

import java.util.Random;

public class Match {
    private Team team1;        //first team
    private Team team2;       //second team
    private Team winner;     // winner of the match


    public Match(Team team1, Team team2){
        this.team1 = team1;     //set to team 1
        this.team2 = team2;    //set to team 2

    }
    public void playMatch(){       //randomly choose which team to win
        Random random = new Random();
        winner = random.nextBoolean() ? team1 : team2;
       //Set winner to team1 if random.nextBoolean() returns true; otherwise, set winner to team2

        System.out.println("Match: " + team1.getName() + " vs " + team2.getName() + "[ winner: " + winner.getName() + " ]");
    }

    public Team getWinner() {
        return winner;            //return the team that won
    }
}
