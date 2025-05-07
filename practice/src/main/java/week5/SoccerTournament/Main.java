package week5.SoccerTournament;

public class Main {
    public static void main(String[] args) {
        Tournament tournament = new Tournament("NBA PLAYOFFS");

        // Add exactly 8 teams
        tournament.addTeam(new Team("Warriors"));
        tournament.addTeam(new Team("Lakers"));
        tournament.addTeam(new Team("Thunders"));
        tournament.addTeam(new Team("Wolves"));
        tournament.addTeam(new Team("Nuggets"));
        tournament.addTeam(new Team("Grizzlies"));
        tournament.addTeam(new Team("Rockets"));
        tournament.addTeam(new Team("Clippers"));

        tournament.startTournament();

    }
}
