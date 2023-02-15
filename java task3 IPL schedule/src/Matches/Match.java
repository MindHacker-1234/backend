package Matches;
import java.time.LocalDate;
import teams.Team;

public class Match {
    private Team team1;
    private Team team2;
    private String venue;
    private LocalDate date;

    public Match(Team team1, Team team2, String venue) {
        this.team1 = team1;
        this.team2 = team2;
        this.venue = venue;
        this.date = date;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public String getVenue() {
        return venue;
    }

    public LocalDate getDate() {
        return date;
    }
}