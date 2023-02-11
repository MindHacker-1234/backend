
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Nominee {
    private String name;
    private int id;
    private int votes;

    public Nominee(String name, int id) {
        this.name = name;
        this.id = id;
        this.votes = 0;
    }

    public void vote() {
        votes++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getVotes() {
        return votes;
    }
}

class VotingSystem {
    public static void main(String[] args) {
        Map<Integer, Nominee> nominees = new HashMap<>();

        nominees.put(1, new Nominee("John", 1));
        nominees.put(2, new Nominee("Jane", 2));
        nominees.put(3, new Nominee("Jim", 3));

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of voters:");
        int numVoters = scan.nextInt();
        Map<Integer, String> voters = new HashMap<>();

        for (int i = 1; i <= numVoters; i++) {
            System.out.println("Enter the name of voter " + i + ":");
            String name = scan.next();
            System.out.println("Enter the ID of voter " + i + ":");
            int id = scan.nextInt();
            voters.put(id, name);

            System.out.println("Enter the nominee ID you want to vote for:");
            int nomineeId = scan.nextInt();
            nominees.get(nomineeId).vote();
        }

        int maxVotes = 0;
        int winnerId = 0;
        for (Nominee nominee : nominees.values()) {
            if (nominee.getVotes() > maxVotes) {
                maxVotes = nominee.getVotes();
                winnerId = nominee.getId();
            }
        }

        System.out.println("The winner is " + nominees.get(winnerId).getName());
        System.out.println("The winner's ID is " + winnerId);
        System.out.println("The voters for the winner are:");
        for (Map.Entry<Integer, String> voter : voters.entrySet()) {
            int voterId = voter.getKey();
            String voterName = voter.getValue();
            for (Map.Entry<Integer, Nominee> entry : nominees.entrySet()) {
                if (entry.getKey() == winnerId) {
                    Nominee nominee = entry.getValue();
                    if (nominee.getVotes() > 0) {
                        System.out.println("Voter ID: " + voterId + " Voter Name: " + voterName);
                    }
                }
            }
        }
    }
}



