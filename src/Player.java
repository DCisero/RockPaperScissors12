/**
 * Created by D.Cisero on 7/25/17.
 */

//make it an abstract class that generateRoshambo
public abstract class Player {

    private String playerName;
    private Roshambo roshambo;

    public String getPlayerName() {

        return playerName;
    }

    public void setPlayerName(String playerName) {

        this.playerName = playerName;
    }

    public Roshambo getRoshambo() {

        return roshambo;
    }
    public void setRoshambo(Roshambo roshambo) {

        this.roshambo = roshambo;
    }

    public abstract String generateRoshambo();

}

