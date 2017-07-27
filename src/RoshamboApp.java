/**
 * Created by D.Cisero on 7/25/17.
 */
import java.util.Scanner;

public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName;
        String choosePlayer;
        String userChoice;
        String resultOne = "You lucky winner you!!!";
        String resultTwo = "You Lose!";
        String resultThree = "We have a Draw!";

        System.out.println("Welcome to the classic game of Rock, Paper, Scissors!");
        System.out.println();

        //prompt the user to enter a name and select an opponent
        System.out.print("Please enter your name: ");
        userName = scan.next();

        //prompt the user to select a player
        System.out.print("Which player would you like to play? (Computer or Queen): ");
        choosePlayer = scan.next();
        System.out.println();

        //prompt the user to select rock, paper, scissors
        System.out.print("Rock, paper, or scissors? ");
        userChoice = scan.next();
        Being uc = new Being();
        System.out.println();

        //validate: if user makes an invalid selection, print error message and prompt again until correct
        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors"))
            System.out.println("Invalid move, please try again!");


        //print the player's choice
        System.out.print(userName + ": " + uc.generateRoshambo(userChoice));
        System.out.println();

        //print the opponent's choice
        if (choosePlayer.equalsIgnoreCase("Computer")) {
            Computer choice1 = new Computer();
            System.out.println("Computer: " + choice1.generateRoshambo());
        }
        else if (choosePlayer.equalsIgnoreCase("Queen")){
            Queen choice2 = new Queen();
            System.out.println("Queen: " + choice2.generateRoshambo());
        }

        scan.nextLine();


        //print the result of the match
       if (userChoice.equals("paper") && Roshambo.equals("rock")) {
            //System.out.println("Draw!");
       }


        //create do while loop to allow the player to play until they end the game

    }
}
