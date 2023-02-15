import Matches.Match;
import Matches.Schedules.Schedule;
import teams.Team;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


class IPLSchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of teams: ");
        int numTeams = scanner.nextInt();

        scanner.nextLine();
        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < numTeams; i++) {
            System.out.print("Enter the name of Team " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the home ground of Team " + (i + 1) + ": ");
            String homeGround = scanner.nextLine();
            teams.add(new Team(name, homeGround));
        }

        Schedule schedule = new Schedule();


        int numMatches = numTeams * (numTeams - 1);
        int teamIndex = 0;
        int weekendIndex = 0;
        int dayIndex = 0;
        int matchesPlayed = 0;

        LocalDate startDate = LocalDate.now();
        DayOfWeek dayOfWeek = startDate.getDayOfWeek();
        while (matchesPlayed < numMatches) {
            Team team1 = teams.get(teamIndex);
            for (int i = 1; i < numTeams; i++) {
                int otherTeamIndex = (teamIndex + i) % numTeams;
                Team team2 = teams.get(otherTeamIndex);
                if (schedule.canPlay(team1, team2, startDate)) {
                    Match match = new Match(team1, team2, startDate.format(DateTimeFormatter.ofPattern("EEEE MMMM dd")));
                    schedule.addMatch(match);
                    startDate = startDate.plusDays(1);
                    dayOfWeek = startDate.getDayOfWeek();
                    matchesPlayed++;
                    if (dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY) {
                        i++;
                    }
                }
                if (matchesPlayed == numMatches) {
                    break;
                }
            }
            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                weekendIndex++;
            }
            dayIndex++;
            teamIndex = dayIndex % numTeams;
        }

        for (Match match : schedule.getMatches()) {
            System.out.println(match.getTeam1().getName() + " vs " + match.getTeam2().getName() + " -> " + match.getDate() + ", " + match.getVenue());
        }
    }
}
