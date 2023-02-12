package Matches.Schedules;

import Matches.Match;

import java.util.List;

public class Schedule {
    private List<Match> matches;

    public Schedule(List<Match> matches) {
        this.matches = matches;
    }

    public void addMatch(Match match) {
        this.matches.add(match);
    }

    public List<Match> getMatches() {
        return this.matches;
    }
}
