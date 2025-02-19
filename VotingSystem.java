import java.util.*;

class VotingSystem {
    private Map<String, Integer> votes;
    
    public VotingSystem() {
        votes = new LinkedHashMap<>();
    }
    
    public void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
    }
    
    public void displayResults() {
        Map<String, Integer> sortedResults = new TreeMap<>(votes);
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.castVote("Hero");
        votingSystem.castVote("Bhai");
        votingSystem.castVote("Hero");
        votingSystem.castVote("Chintu");
        votingSystem.castVote("Bhai");
        votingSystem.castVote("Hero");
        System.out.println("Voting Results:");
        votingSystem.displayResults();
    }
}
