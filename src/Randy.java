/**
 * Created by D.Cisero on 7/25/17.
 */
//randomly generates
import java.util.Random;

public class Randy extends Player {
    Random rand = new Random();

    private String playerName = "Randy";
    private String randyChoice;

    public Randy(){
        playerName = "Randy";

    }

    public String generateRoshambo() {

        switch ((int) (Math.random() * 2) + 1) {
            case 1:
                randyChoice.equalsIgnoreCase("ROCK");
                break;
            case 2:
                randyChoice.equalsIgnoreCase("PAPER");
                break;
            case 3:
                randyChoice.equalsIgnoreCase("SCISSORS");
                break;

        }
        return randyChoice;
    }

}





