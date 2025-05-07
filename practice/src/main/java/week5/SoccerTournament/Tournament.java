package week5.SoccerTournament;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Tournament {
    private String name;       //Name of the tournament
    private List<Team> teams;   //all teams in the tournament
    private List<Round> rounds;     //each round played
    private Team winner;             //the champion

    public Tournament(String name){
        this.name = name;
        this.teams = new ArrayList<>();
        this.rounds = new ArrayList<>();
    }
    public void addTeam(Team team) {
        teams.add(team);
    }
    public void startTournament(){
        if (teams.size() != 8){
            System.out.println("Tournament needs exactly 8 teams.");
            return;
        }

        Collections.shuffle(teams); // Randomize teams before matches

        // --- Round 1: 8 teams → 4
        Round round1 = new Round();
        for (int i = 0; i < 8; i += 2) {
            round1.addMatch(new Match(teams.get(i), teams.get(i + 1)));
        }
        List<Team> winners1 = round1.playRound();
        rounds.add(round1);

        // --- Round 2: 4 teams → 2
        Round round2 = new Round();
        for (int i = 0; i < 4; i += 2) {
            round2.addMatch(new Match(winners1.get(i), winners1.get(i + 1)));
        }
        List<Team> winners2 = round2.playRound();
        rounds.add(round2);

        // --- Final: 2 teams → 1
        Round finalRound = new Round();
        finalRound.addMatch(new Match(winners2.get(0), winners2.get(1)));
        List<Team> finalWinners = finalRound.playRound();
        rounds.add(finalRound);

        // Set tournament winner
        winner = finalWinners.get(0);
        System.out.println("The winner of the tournament is: " + winner.getName() + "!");
    }

    public Team getWinner() {
        return winner;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Round> getRounds() {
        return rounds;

    }



}
