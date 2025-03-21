package Unit8.Unit8Proj;
import java.util.*;

public class RoboticsComp {
    private final String[] teams = new String[5];
    private final String[] judges = {"Smith", "Johnson", "Jones", "Patel", "Brandt", "Williams"};
    private final double[][] scoreArray = new double[5][6];
    private final String[][] judgeArray = new String[5][6];

    RoboticsComp() {
        this.teams[0] = "Team 1";
        this.teams[1] = "Team 2";
        this.teams[2] = "Team 3";
        this.teams[3] = "Team 4";
        this.teams[4] = "Team 5";
    }

    public void printTeams() {
        for (int i = 0; i < this.judgeArray.length; i++) {
            System.out.println("Team " + (i + 1) + " judges: " + Arrays.toString(this.judgeArray[i]));
        }
    }
    public void printScire() {
        for (int i = 0; i < this.judgeArray.length; i++) {
            System.out.println("Team " + (i + 1) + " score: " + Arrays.toString(this.scoreArray[i]));
        }
    }

    private double randomScore() {
        double ret = (40 + (Math.random() * 10));
        ret = Math.round(ret * 100);
        ret /= 100;
        return ret;
    }

    public void score() {
        for (double[] scoreArray1 : this.scoreArray) {
            for (int k = 0; k < scoreArray1.length; k++) {
                scoreArray1[k] = randomScore();
            }
        }

    }
    public HashMap<String, Double> totalScoreHashMap() {
        HashMap<String, Double> totalScores = new HashMap<>();
        for (int i = 0; i < teams.length; i++) {
            double totalScore = 0;
            for (int j = 0; j < this.scoreArray[i].length; j++) {
                totalScore += this.scoreArray[i][j];
            }
            totalScores.put(this.teams[i], totalScore);
        }
        return totalScores;
    }

    public HashMap<String, Double> highestScoreHashMap() {
        HashMap<String, Double> largestScores = new HashMap<>();
        for (int i = 0; i < teams.length; i++) {
            double largest = 0;
            for (int j = 0; j < this.scoreArray[i].length; j++) {
                if(this.scoreArray[i][j] > largest) {
                    largest = this.scoreArray[i][j];
                }
            }
            largestScores.put(this.teams[i], largest);
        }
        return largestScores;
    }

    public String findHighestIndividualRound() {
        HashMap<String, Double> scores = highestScoreHashMap();
        String winner = null;
        double highestScore = 0;
        for (Map.Entry<String, Double> entry : scores.entrySet()) {
            if (entry.getValue() > highestScore) {
                highestScore = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
        
    }

    public String findWinner() {
        HashMap<String, Double> scores = totalScoreHashMap();
        String winner = null;
        double highestScore = 0;
        for (Map.Entry<String, Double> entry : scores.entrySet()) {
            if (entry.getValue() > highestScore) {
                highestScore = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }

    public String findLowestIndividualRound() {
        HashMap<String, Double> scores = highestScoreHashMap();
        String loser = null;
        double lowestScore = 1000;
        for (Map.Entry<String, Double> entry : scores.entrySet()) {
            if (entry.getValue() < lowestScore) {
                lowestScore = entry.getValue();
                loser = entry.getKey();
            }
        }
        return loser;
    }

    public String findHighestScoreJudge() {
        double highestScore = 0;
        String highestScoreJudge = null;
        for (int i = 0; i < scoreArray.length; i++) {
            for (int j = 0; j < scoreArray[i].length; j++) {
                if (scoreArray[i][j] > highestScore) {
                    highestScore = scoreArray[i][j];
                    highestScoreJudge = judgeArray[i][j];
                }
            }
        }
        return highestScoreJudge;
    }

    public String findLowestScoreJudge() {
        double lowestScore = 100000;
        String lowestScoreJudge = null;
        for (int i = 0; i < scoreArray.length; i++) {
            for (int j = 0; j < scoreArray[i].length; j++) {
                if (scoreArray[i][j] < lowestScore) {
                    lowestScore = scoreArray[i][j];
                    lowestScoreJudge = judgeArray[i][j];
                }
            }
        }
        return lowestScoreJudge;
    }

    //So i think the way this works is that the hashmap contains the teams and then a hashset that has the judges that have been assigned to that round. You then assign the judges to each team using the .contains function to check if the judge has already been assigned.
    public void AssignJudges() {
        Random random = new Random();
        HashMap<String, String> lastAssignedJudge = new HashMap<>();

        for (int round = 0; round < 6; round++) {
            ArrayList<String> availableJudges = new ArrayList<>(Arrays.asList(judges));
            Collections.shuffle(availableJudges, random);

            for (String team : teams) {
                String lastJudge = lastAssignedJudge.get(team);
                String assignedJudge = null;

                // Find a judge that has not been assigned to this team in the previous round
                for (String judge : availableJudges) {
                    if (!judge.equals(lastJudge)) {
                        assignedJudge = judge;
                        break;
                    }
                }

                // Assign the judge to the team
                if (assignedJudge != null) {
                    judgeArray[Arrays.asList(teams).indexOf(team)][round] = assignedJudge;
                    lastAssignedJudge.put(team, assignedJudge);
                    availableJudges.remove(assignedJudge);
                }
            }
        }
    }
}
