package Matches.Schedules;

import Matches.Match;
import teams.Team;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {
    private Map<Team, List<Match>> teamMatches;

    public Schedule() {
        teamMatches = new HashMap<>();
    }

    public void addMatch(Match match) {
        Team team1 = match.getTeam1();
        Team team2 = match.getTeam2();
        List<Match> team1Matches = teamMatches.getOrDefault(team1, new ArrayList<>());
        team1Matches.add(match);
        teamMatches.put(team1, team1Matches);
        List<Match> team2Matches = teamMatches.getOrDefault(team2, new ArrayList<>());
        team2Matches.add(match);
        teamMatches.put(team2, team2Matches);
    }

    public List<Match> getMatches(Team team) {
        return teamMatches.getOrDefault(team, new ArrayList<>());
    }

    public List<Match> getMatches() {
        List<Match> allMatches = new ArrayList<>();
        for (List<Match> matches : teamMatches.values()) {
            allMatches.addAll(matches);
        }
        return allMatches;
    }

    public boolean canPlay(Team team1, Team team2, LocalDate date) {
        for (Match match : getMatches(team1)) {
            if (match.getDate().isEqual(date) && (match.getTeam1() == team2 || match.getTeam2() == team2)) {
                return false;
            }
        }

        LocalDate twoDaysAgo = date.minusDays(2);
        for (Match match : getMatches(team1)) {
            if ((match.getTeam1() == team2 || match.getTeam2() == team2) && match.getDate().isAfter(twoDaysAgo)) {
                return false;
            }
        }

        LocalDate yesterday = date.minusDays(1);
        for (Match match : getMatches(team1)) {
            if (match.getDate().isEqual(yesterday)) {
                return false;
            }
        }

        return true;
    }
}
