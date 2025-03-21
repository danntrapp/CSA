package Unit8.Unit8Proj;

public class testing {
    public static void main(String[] args) {
        RoboticsComp pp = new RoboticsComp();
        pp.AssignJudges();
        pp.printTeams();
        pp.score();
        pp.printScire();
        System.out.println("The winner of this comp is: " + pp.findWinner()+ "\n");
        System.out.print("The highest individual round was by: " + pp.findLowestIndividualRound());
        System.out.println(" Scored by: "+ pp.findLowestScoreJudge()+ "\n");
        System.out.print("The highest individual round was by: " + pp.findHighestIndividualRound());
        System.out.println(" Scored by: "+ pp.findHighestScoreJudge()+ "\n");
    }
    
    
}
