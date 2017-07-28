/**
 * Created by D.Cisero on 7/25/17.
 */
public enum Roshambo {
    ROCK, PAPER, SCISSORS;

    //include a toString method  to convert selected value to a string
    public String toString() {
        switch (this) {
            case ROCK:
                return "rock";
            case PAPER:
                return "paper";
            default:
                return "scissors";
        }
    }

}


