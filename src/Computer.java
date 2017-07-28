/**
 * Created by D.Cisero on 7/25/17.
 */

//generates only rock
public class Computer extends Player {

  String playerName = "Computer";

   public Computer(){
       playerName = "Computer";

   }
    public String generateRoshambo() {
        String compChoice = Roshambo.ROCK.toString();
       return compChoice;
    }

}
