import Matches.Match;
import Matches.Schedules.Schedule;
import teams.Team;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


class IPLSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of teams: ");
        int numTeams = sc.nextInt();
        List<Team> teams = new ArrayList<>();

        for (int i = 0; i < numTeams; i++) {
            System.out.print("Enter team name: ");
            String teamName = sc.next();
            System.out.print("Enter home ground: ");
            String homeGround = sc.next();
            teams.add(new Team(teamName, homeGround));
        }

        Schedule schedule = new Schedule(new ArrayList<Match>());
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] weekends = {"Saturday", "Sunday"};
        int numMatches = teams.size()*(teams.size() - 1) /2;
        int dayIndex = 0;
        int teamIndex = 0;
        int weekendIndex = 0;
        LocalDate startdate = LocalDate.now();
        for (int i = 0; i < numMatches; i++) {
            if (i == (numMatches/2)) {
                LocalDate date = startdate.plusDays(i);
                Match match = new Match(teams.get(teamIndex), teams.get((teamIndex + 1) % teams.size()), weekends[weekendIndex % 2] + " " +  date);
                schedule.addMatch(match);
                weekendIndex++;
            } else {
                LocalDate day = startdate.plusDays(i);
                Match match = new Match(teams.get(teamIndex), teams.get((teamIndex + 1) % teams.size()), weekDays[dayIndex % 5] + " " +  day);
                schedule.addMatch(match);
                dayIndex++;
            }
            teamIndex = (teamIndex + 1) % teams.size();
            if (dayIndex % 5 == 0) {
                teamIndex = (teamIndex + 1) % teams.size();
            }
        }

        for (Match match : schedule.getMatches()) {
            System.out.println(match.getMatch());
        }
    }
}
