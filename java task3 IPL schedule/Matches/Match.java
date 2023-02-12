package Matches;
import java.util.Date;
import java.time.LocalDate;
import teams.Team;

public class Match {

    private Team teamA;
    private Team teamB;

    private String date;
    public Match(Team teamA, Team teamB,String date ) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public String getMatch() {
        return this.teamA.getName() + " vs " + this.teamB.getName() + " -> " + this.date;
    }
}

