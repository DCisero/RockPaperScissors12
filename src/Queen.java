/**
 * Created by D.Cisero on 7/25/17.
 */
//randomly generates
import java.util.Random;

public class Queen extends Player {
    Random rand = new Random();

    private String playerName = "Queen";
    private String randomChoice;

    public Queen(){
        playerName = "Queen";

    }

    public String generateRoshambo() {
        switch ((int) (Math.random() * 2) + 1) {
            case 1:
                randomChoice.equalsIgnoreCase("ROCK");
                break;
            case 2:
                randomChoice.equalsIgnoreCase("PAPER");
                break;
            case 3:
                randomChoice.equalsIgnoreCase("SCISSORS");
                break;

        }
        return randomChoice;
    }

}

    //    public Roshambo generateRoshambo(Roshambo randomChoice) {
//        switch ((int) (Math.random() * 2) + 1) {
//            case 1:
//                randomChoice = Roshambo.ROCK;
//                break;
//            case 2:
//                randomChoice = Roshambo.PAPER;
//                break;
//            case 3:
//                randomChoice = Roshambo.SCISSORS;
//                break;
//        }
//        return randomChoice;
    //}


//    public void setRandomChoice () {
//        randomChoice = (int) (Math.random() * 3);
//        if (randomChoice == 0) {
//            randomChoice = 1;
//        }
//    }
//
//    public int getRandomChoice(){
//        return randomChoice;
//    }
//
//public String generateRoshambo() {
//        return null;
//    }


